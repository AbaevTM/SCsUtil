package net.ostis.scs.util.application.filesystem;

import java.io.IOException;

/**
 * Wrapper for I/O exceptions.
 * @author Tsimur_Abayeu
 * Mar 6, 2015
 */
public class FileSystemException extends IOException {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructs instance of exception.
	 * @param message exception's message.
	 * @param cause eception's cause.
	 */
	public FileSystemException(final String message, final Throwable cause) {
		super(message, cause);
	}

	/**
	 * Constructs instance of exception.
	 * @param message exception's message.
	 */
	public FileSystemException(final String message) {
		super(message);
	}

}
