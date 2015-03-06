package net.ostis.scs.util.logging;

import java.io.File;

/**
 * Custom logger.
 * @author Tsimur_Abayeu
 * Feb 28, 2015
 */
public interface Logger {

	/**
	 * Prints debug message.
	 * @param message to be printed
	 */
	void debug(final Object message);

	/**
	 * Prints debug message and its cause.
	 * @param message to be printed
	 * @param throwable object of Throwable describing some error.
	 */
	void debug(final Object message,  final Throwable throwable);

	/**
	 * Prints info message.
	 * @param message to be printed
	 */
	void info(final Object message);

	/**
	 * Prints info message and its cause.
	 * @param message to be printed
	 * @param throwable object of Throwable describing some error.
	 */
	void info(final Object message,  final Throwable throwable);

	/**
	 * Sets log file name. If no file name has been set or
	 * file name is null then file should not be created.
	 * @param file log file that will be created.
	 */
	void setLogFile(final File file);

	/**
	 * Sets log level.
	 * @param level new level value.
	 */
	void setLevel(final int level);

}
