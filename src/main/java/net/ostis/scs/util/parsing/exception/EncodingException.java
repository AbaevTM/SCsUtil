package net.ostis.scs.util.parsing.exception;

import java.io.File;

import net.ostis.scs.util.common.message.Property;

/**
 * Exception that is thrown when SCS file's
 * encoding differs from default value.
 * @author Tsimur_Abayeu
 * Mar 1, 2015
 */
public class EncodingException extends ParsingException {

	/**
	 * Default encoding of SCS files is UTF-8 without BOM.
	 */
	public static final String DEFAULT_FILE_ENCODING = "UTF-8";

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	private static final String MESSAGE_KEY = "encodingException.message";

	private final String message;

	/**
	 * Constructs instance for file that is encoded with wrong encoding.
	 * @param file file encoded with wrong encoding.
	 * @param cause exception'scause.
	 */
	public EncodingException(final File file, final Throwable cause) {
		super(cause.getMessage(), cause);
		message = Property.getString(
				MESSAGE_KEY,
				file.getName(),
				DEFAULT_FILE_ENCODING);
	}

	/**
	 * Constructs instance for file that is encoded with wrong encoding.
	 * @param file file encoded with wrong encoding.
	 */
	public EncodingException(final File file) {
		super();
		message = Property.getString(
				MESSAGE_KEY,
				file.getName(),
				DEFAULT_FILE_ENCODING);
	}

	@Override
	public final String getMessage() {
		return message;
	}

}
