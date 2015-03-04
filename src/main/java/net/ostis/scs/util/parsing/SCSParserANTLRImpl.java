package net.ostis.scs.util.parsing;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.file.Files;

import net.ostis.scs.util.common.Property;
import net.ostis.scs.util.logging.Logger;
import net.ostis.scs.util.parsing.antlr.SCSErrorListener;
import net.ostis.scs.util.parsing.antlr.SCSNewLexer;
import net.ostis.scs.util.parsing.antlr.SCSNewParser;
import net.ostis.scs.util.parsing.antlr.SCSNewParser.SyntaxContext;
import net.ostis.scs.util.parsing.exception.EncodingException;
import net.ostis.scs.util.parsing.exception.ParsingException;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.apache.commons.io.ByteOrderMark;
import org.apache.commons.io.input.BOMInputStream;

/**
 * Basic implementation of SCSParser using ANTLR tool.
 * @author Tsimur_Abayeu
 * Feb 13, 2015
 */
public class SCSParserANTLRImpl implements SCSParser {

	/**
	 * Default encoding of SCS files is UTF-8 without BOM.
	 */
	public static final String DEFAULT_FILE_ENCODING = "UTF-8";

	public static final String IOEXCEPTION_MESSAGE_KEY = "iOException.message";

	private static final Charset DEFAULT_CHARSET = Charset.availableCharsets()
			.get(DEFAULT_FILE_ENCODING);

	private Logger logger;

	private boolean encodingCheckEnabled;

	/**
	 * Default constructor.
	 * @param encodingCheckEnabledArg enables check for file
	 * encoding before parsing. If this parameter is false then
	 * parser skips checking.
	 */
	public SCSParserANTLRImpl(final boolean encodingCheckEnabledArg) {
		super();
		this.encodingCheckEnabled = encodingCheckEnabledArg;
	}

	@Override
	public final SyntaxContext parseFile(final File file)
			throws ParsingException {
		return parse(file);
	}

	@Override
	public final void validateFile(final File file) throws ParsingException {
		parse(file);
	}

	/**
	 * Tries to build SyntaxContext node for given SCS file.
	 * @param file file to be parsed.
	 * @return ANTLR based SyntaxContext.
	 */
	private SyntaxContext parse(final File file) {
		SyntaxContext syntax = null;
		try {
			if (encodingCheckEnabled) {
				checkEncoding(file);
			}
			SCSErrorListener errorListener = new SCSErrorListener(file);
			SCSNewLexer lexer = new SCSNewLexer(new ANTLRFileStream(
					file.getAbsolutePath(), DEFAULT_FILE_ENCODING));
			lexer.removeErrorListeners();
			lexer.addErrorListener(errorListener);
			CommonTokenStream tokenStream = new CommonTokenStream(lexer);
			SCSNewParser parser = new SCSNewParser(tokenStream);
			parser.removeErrorListeners();
			parser.addErrorListener(errorListener);
			syntax = parser.syntax();
		} catch (IOException e) {
			String fileName = null;
			if (file == null) {
				fileName = String.valueOf(file);
			} else {
				file.getName();
			}
			logger.info(Property.getString(
					IOEXCEPTION_MESSAGE_KEY,
					fileName),
					e);
		}
		return syntax;
	}

	/**
	 * Checks if given file is properly encoded.
	 * @param file to be checked.
	 * @throws ParsingException is thrown if encoding
	 * does not match DEFAULT_FILE_ENCODING.
	 * @throws IOException if file cannot be opened.
	 */
	private void checkEncoding(final File file)
			throws ParsingException, IOException {
		//Check if file contains BOM.
		BOMInputStream bomInputStream = null;
		try {
			bomInputStream = new BOMInputStream(
					new FileInputStream(file),
					ByteOrderMark.UTF_8,
					ByteOrderMark.UTF_16BE,
					ByteOrderMark.UTF_16LE,
					ByteOrderMark.UTF_32BE,
					ByteOrderMark.UTF_32LE
					);
			if (bomInputStream.hasBOM()) {
				throw new EncodingException(file);
			}
		} finally {
			bomInputStream.close();
		}
		// Check that file can be read as UTF-8 encoded.
		// TODO Approach can be improved. Reading entire file can be costly.
		byte[] array = Files.readAllBytes(file.toPath());
		CharsetDecoder decoder = DEFAULT_CHARSET.newDecoder();
		try {
			decoder.decode(ByteBuffer.wrap(array));
		} catch (CharacterCodingException e) {
			throw new EncodingException(file, e);
		}
	}

	@Override
	public final void setLogger(final Logger loggerArg) {
		logger = loggerArg;
	}

}
