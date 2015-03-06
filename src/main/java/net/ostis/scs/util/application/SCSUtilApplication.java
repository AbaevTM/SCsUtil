package net.ostis.scs.util.application;

import java.io.File;

import net.ostis.scs.util.application.filesystem.FileSystemException;
import net.ostis.scs.util.application.filesystem.FileSystemRunMode;
import net.ostis.scs.util.application.filesystem.FileSystemRunner;
import net.ostis.scs.util.application.filesystem.FileSystemRunnerCallback;
import net.ostis.scs.util.application.filesystem.FileSystemRunnerNIO;
import net.ostis.scs.util.common.Property;
import net.ostis.scs.util.logging.Logger;
import net.ostis.scs.util.logging.LoggerLog4jImpl;
import net.ostis.scs.util.parsing.SCSParser;
import net.ostis.scs.util.parsing.SCSParserANTLRImpl;

import org.kohsuke.args4j.CmdLineException;
import org.kohsuke.args4j.CmdLineParser;
import org.kohsuke.args4j.Option;

/**
 * Console application.
 * Parses given arguments and triggers SCSParser.
 * @author Tsimur_Abayeu
 * Feb 12, 2015
 */
public final class SCSUtilApplication {

	private static final boolean ENCODING_CHECKS_ENABLED = Boolean.valueOf(
			Property.getString("settings.encoding-checks-enabled"));

	/**
	 * Hidden constructor.
	 */
	private SCSUtilApplication() {

	}

	/**
	 * Entry point.
	 * @param args passed by platform dependent shell script.
	 */
	public static void main(final String[] args) {
		Options options = new Options();
		CmdLineParser optionsParser = new CmdLineParser(options);
		LoggerLog4jImpl logger = new LoggerLog4jImpl(SCSUtilApplication.class);
		try {
			optionsParser.parseArgument(args);
			initializeLogger(logger, options);
			FileSystemRunner filesystemRunner =
					buildFileSystemRunner(options, logger);
			final SCSParser parser = buildSCSParser(logger);
			switch (options.operation) {
				case TRANSLATE :
					//TODO add call to translation logic.
					break;
				case VERIFY :
					filesystemRunner.run(new FileSystemRunnerCallback() {

						@Override
						public void execute(final File file) {
							parser.parseFile(file);
						}

					});
					break;
				default:
					throw new IllegalArgumentException();
			}
		} catch (CmdLineException e) {
			if (options.help) {
				//TODO print help message.
				logger.info(null);
			}
		} catch (FileSystemException e) {
			logger.info(e.getMessage(), e);
		}
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
		if (options.directory) {
			if (options.recursive) {
				runMode = FileSystemRunMode.DIRECTORY_RECURSIVE;
			} else {
				runMode = FileSystemRunMode.DIRECTORY;
			}
		} else {
			runMode = FileSystemRunMode.FILE;
		}
		filesystemRunner = new FileSystemRunnerNIO(runMode);
		filesystemRunner.setLogger(logger);
		filesystemRunner.setRoot(options.path);
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
		File logFile = options.logFile;
		if (logFile != null) {
			logger.setLogFile(logFile);
		} else {
			if (options.logDefault) {
				logger.setDefaultLogFile(
						options.operation.name().toLowerCase());
			}
		}
	}

	/**
	 * Operation that should be performed
	 * on given SCS file or directory of such files.
	 * @author Tsimur_Abayeu
	 * Mar 4, 2015
	 */
	private enum Operation {

		VERIFY,

		TRANSLATE;

		}

	/**
	 * Contains options that have been parsed by args4j.
	 * @author Tsimur_Abayeu
	 * Mar 4, 2015
	 */
	private static class Options {

		/**
		 * Implies that application should not parse
		 * other arguments but should print help message
		 * describing application's console interface.
		 */
		@Option(
				name = "--help")
		private boolean help;

		/**
		 * SCS file or directory containing such files.
		 */
		@Option(
				name = "-p",
				aliases = "--path",
				required = true)
		private File path;

		/**
		 * Defines which type of operation should be performed.
		 */
		@Option(
				name = "--do",
				required = true)
		private Operation operation;

		/**
		 * Implies that given file name is the name
		 * of a folder. By default operation is performed
		 * just for files contained in this directory.
		 * {@link Options#recursive}
		 *
		 */
		@Option(
				name = "-d",
				aliases = {"--directory"})
		private boolean directory;

		/**
		 * Implies that operation should be performed
		 * for any file under given directory including sub directories.
		 * Depends on --directory option.
		 */
		@Option(
				name = "-r",
				aliases = {"--recursive"},
				depends = "-d")
		private boolean recursive;

		/**
		 * Implies that log file with default
		 * file name should be created.
		 *
		 */
		@Option(
				name = "-l",
				aliases = "--log")
		private boolean logDefault;

		/**
		 * Path to log file with custom name.
		 */
		@Option(
				name = "-lf",
				aliases = "--log-file",
				required = true)
		private File logFile;

	}

}
