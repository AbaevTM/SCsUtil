package net.ostis.scs.util.common.exception;

/**
 * Common exception that can be thrown
 * during run of certain operation.
 * @author Tsimur_Abayeu
 * Mar 8, 2015
 */
public class ApplicationException extends RuntimeException {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	public ApplicationException(final String message, final Throwable cause) {
		super(message, cause);
	}

	public ApplicationException(final String message) {
		super(message);
	}

	public ApplicationException() {
		super();
	}

}
