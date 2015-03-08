package net.ostis.scs.util.application;

import java.io.File;

import org.kohsuke.args4j.Option;

/**
 * Contains options that have been parsed by args4j.
 * @author Tsimur_Abayeu
 * Mar 4, 2015
 */
public class Options {

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
	private  File path;

	/**
	 * Defines which type of operation should be performed.
	 */
	@Option(
			name = "--do",
			required = true)
	private  Operation operation;

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
	private  boolean directory;

	/**
	 * Implies that operation should be performed
	 * for any file under given directory including sub directories.
	 * Depends on --directory option.
	 */
	@Option(
			name = "-r",
			aliases = {"--recursive"},
			depends = "-d")
	private  boolean recursive;

	/**
	 * Implies that log file with default
	 * file name should be created.
	 *
	 */
	@Option(
			name = "-l",
			aliases = "--log")
	private  boolean logDefault;

	/**
	 * Path to log file with custom name.
	 */
	@Option(
			name = "-lf",
			aliases = "--log-file")
	private  File logFile;

	public final boolean isHelp() {
		return help;
	}

	public final File getPath() {
		return path;
	}

	public final Operation getOperation() {
		return operation;
	}

	public final boolean isDirectory() {
		return directory;
	}

	public final boolean isRecursive() {
		return recursive;
	}

	public final boolean isLogDefault() {
		return logDefault;
	}

	public final File getLogFile() {
		return logFile;
	}

}
