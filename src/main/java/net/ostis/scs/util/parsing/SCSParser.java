package net.ostis.scs.util.parsing;

import java.io.File;

import net.ostis.scs.util.logging.LoggerAware;
import net.ostis.scs.util.parsing.antlr.SCSNewParser.SyntaxContext;
import net.ostis.scs.util.parsing.exception.ParsingException;

/**
 * SCSParser parses SCS files and returns document tree.
 * @author Tsimur_Abayeu
 * Feb 13, 2015
 */
public interface SCSParser extends LoggerAware {

	/**
	 * Parse SCS file and build document tree.
	 * @param file that should be parsed.
	 * @throws ParsingException if any error occurs
	 * while parsing.
	 * @return SyntaxContext instance if file parsed
	 * successfully (null otherwise).
	 */
	SyntaxContext parseFile(final File file) throws ParsingException;

	/**
	 * Tries to parse SCS file and build document tree.
	 * @param file that should be parsed.
	 * @throws ParsingException if any error occurs
	 * while parsing.
	 */
	void validateFile(final File file) throws ParsingException;

}
