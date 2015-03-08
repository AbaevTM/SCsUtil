package net.ostis.scs.util.application;

import java.io.File;

import net.ostis.scs.util.application.filesystem.FileSystemRunMode;
import net.ostis.scs.util.application.filesystem.FileSystemRunner;
import net.ostis.scs.util.application.filesystem.FileSystemRunnerNIO;
import net.ostis.scs.util.common.message.Message;
import net.ostis.scs.util.common.message.Property;
import net.ostis.scs.util.logging.Logger;
import net.ostis.scs.util.logging.LoggerLog4jImpl;
import net.ostis.scs.util.parsing.SCSParser;
import net.ostis.scs.util.parsing.SCSParserANTLRImpl;

import org.kohsuke.args4j.CmdLineException;
import org.kohsuke.args4j.CmdLineParser;

/**
 * Console application.
 * Parses given arguments and triggers SCSParser.
 * @author Tsimur_Abayeu
 * Feb 12, 2015
 */
public final class Application {

	private static final String HELP_MESSAGE_KEY = "message.help";

	private static final boolean ENCODING_CHECKS_ENABLED = Boolean.valueOf(
			Property.getString("settings.encoding-checks-enabled"));

	/**
	 * Hidden constructor.
	 */
	private Application() {

	}

	/**
	 * Entry point.
	 * @param args passed by platform dependent shell script.
	 */
	public static void main(final String[] args) {
		Options options = new Options();
		CmdLineParser optionsParser = new CmdLineParser(options);
		final LoggerLog4jImpl logger = new LoggerLog4jImpl(
				Application.class);
		try {
			optionsParser.parseArgument(args);
			if (options.isHelp()) {
				logger.info(Property.getString(HELP_MESSAGE_KEY));
				return;
			}
			initializeLogger(logger, options);
			FileSystemRunner runner =
					buildFileSystemRunner(options, logger);
			final SCSParser parser = buildSCSParser(logger);
			AbstractFileSystemCallback callback = null;
			logger.info(Message.startMessage(
					options.getPath(),
					ENCODING_CHECKS_ENABLED,
					runner.getRunMode(),
					options.getOperation()));
			switch (options.getOperation()) {
				case TRANSLATE :
					//TODO add call to translation logic.
					throw new UnsupportedOperationException(
							"TRANSLATE operation is currently unavailable.");
				case VERIFY :
					callback = new VerifyFileSystemCallback(parser, logger);
					runner.run(callback);
					break;
				default:
					throw new IllegalArgumentException();
			}
			logResult(options, logger, callback);
		} catch (CmdLineException e) {
			if (options.isHelp()) {
				logger.info(Property.getString(HELP_MESSAGE_KEY));
			} else {
				logger.info(Message.entryErrorMessage(e));
			}
		} catch (Exception e) {
			logger.info(Message.entryErrorMessage(e));
		}
	}

	private static void logResult(
			final Options options,
			final LoggerLog4jImpl logger,
			final AbstractFileSystemCallback callback) {
		String resultDescription = "";
		if (callback.getStatus() == ProcessingStatus.FAILURE) {
			resultDescription = Message.failedResultDescription(
					callback.getFailedFiles());
		}
		logger.info(Message.endMessage(
				options.getOperation(),
				callback.getStatus(),
				callback.getProcessedFilesNumber(),
				callback.getFilesNumber(),
				resultDescription));
	}

	/**
	 * Builds SCSParser.
	 * @param logger to be injected.
	 * @return SCSParser.
	 */
	private static SCSParser buildSCSParser(final Logger logger) {
		SCSParser parser = new SCSParserANTLRImpl(ENCODING_CHECKS_ENABLED);
		parser.setLogger(logger);
		return parser;
	}

	/**
	 * Builds FileSystemRunner depending on given configuration.
	 * @param options contains configuration properties.
	 * @param logger custom logger.
	 * @return FileSystemRunner.
	 */
	private static FileSystemRunner buildFileSystemRunner(
			final Options options,
			final Logger logger) {
		FileSystemRunner filesystemRunner;
		FileSystemRunMode runMode = null;
		if (options.isDirectory()) {
			if (options.isRecursive()) {
				runMode = FileSystemRunMode.DIRECTORY_RECURSIVE;
			} else {
				runMode = FileSystemRunMode.DIRECTORY;
			}
		} else {
			runMode = FileSystemRunMode.FILE;
		}
		filesystemRunner = new FileSystemRunnerNIO(runMode);
		filesystemRunner.setLogger(logger);
		filesystemRunner.setRoot(options.getPath());
		return filesystemRunner;
	}

	/**
	 * Initializes application's logger depending on given
	 * configuration.
	 * @param logger logger which log file should be configured.
	 * @param options contains configuration properties.
	 */
	private static void initializeLogger(
			final LoggerLog4jImpl logger,
			final Options options) {
		File logFile = options.getLogFile();
		if (logFile != null) {
			logger.setLogFile(logFile);
		} else {
			if (options.isLogDefault()) {
				logger.setDefaultLogFile(
						options.getOperation().name().toLowerCase());
			}
		}
	}

}
