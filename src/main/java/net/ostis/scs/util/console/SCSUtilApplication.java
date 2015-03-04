package net.ostis.scs.util.console;

import java.io.File;

import net.ostis.scs.util.logging.Logger;
import net.ostis.scs.util.logging.LoggerLog4jImpl;

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
		Logger logger = new LoggerLog4jImpl(SCSUtilApplication.class);
		Options options = new Options();
		CmdLineParser parser = new CmdLineParser(options);
		try {
			parser.parseArgument(args);
		} catch (CmdLineException e) {
			if (options.help) {
				//TODO print help message.
				logger.info(null);
			}
			logger.info(e.getMessage());
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
		private File logPath;

	}

}
