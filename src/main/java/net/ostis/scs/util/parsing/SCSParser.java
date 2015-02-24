package net.ostis.scs.util.parsing;

import java.io.File;

import net.ostis.scs.util.parsing.exception.ParsingException;

/**
 * SCSParser parses SCS files and returns document tree.
 * @author Tsimur_Abayeu
 * Feb 13, 2015
 */
public interface SCSParser {

	/**
	 * Parse SCS file and build document tree.
	 * @param file that should be parsed.
	 * @throws ParsingException if any error occurs
	 * while parsing.
	 */
	void parseFile(final File file) throws ParsingException;

}
