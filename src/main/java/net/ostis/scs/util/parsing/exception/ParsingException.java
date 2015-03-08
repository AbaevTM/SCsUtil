package net.ostis.scs.util.parsing.exception;

import net.ostis.scs.util.common.exception.ApplicationException;

/**
 * General parsing exception.
 * @author Tsimur_Abayeu
 * Feb 13, 2015
 */
public class ParsingException extends ApplicationException {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Inherited constructor.
	 * @param message exception's message.
	 * @param cause exception'scause.
	 */
	public ParsingException(final String message, final Throwable cause) {
		super(message, cause);
	}

	/**
	 * Inherited constructor.
	 * @param message exception's message.
	 */
	public ParsingException(final String message) {
		super(message);
	}

	/**
	 * Default constructor.
	 */
	public ParsingException() {
		super();
	}

}
