package net.ostis.scs.util.test.encoding;

import java.io.File;
import java.net.URISyntaxException;

import net.ostis.scs.util.logging.Logger;
import net.ostis.scs.util.logging.LoggerLog4jImpl;
import net.ostis.scs.util.parsing.SCSParser;
import net.ostis.scs.util.parsing.SCSParserANTLRImpl;
import net.ostis.scs.util.parsing.exception.EncodingException;
import net.ostis.scs.util.parsing.exception.ParsingException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Tests appropriate validation result for properly strutted
 * file in different encodings. The goal of the test is
 * ensure that validator invalidates files that are not parsable
 * by sc-machine.
 * Test cases and expected result:
 * cp1251									| parsed partly
 * cp1251 without last newline				| parsed partly
 * UTF16 be									| encoding error
 * UTF16 be without last newline			| encoding error
 * UTF16 le									| encoding error
 * UTF16 le without last newline			| encoding error
 * UTF16									| encoding error
 * UTF16 without last newline				| encoding error
 * UTF32 									| encoding error
 * UTF32 without last newline.				| encoding error
 * UTF8										| encoding error
 * UTF8 without last newline				| encoding error
 * UTF8 without BOM							| ok
 * UTF8 without BOM without last newline	| ok
 * windows-1251								| parsed partly
 * windows-1251 without last newline		| parsed partly
 * @author Tsimur_Abayeu
 * Feb 13, 2015
 */
public final class EncodingTest {

	/**
	 * Class logger.
	 */
	private static final Logger LOGGER =
			new LoggerLog4jImpl(EncodingTest.class);

	/**
	 * Names of files encoded correctly.
	 */
	private static final String [] CORRECT_FILES = {
		"test1 UTF8 without BOM.scs",
		"test1 UTF8 without BOM without last newline.scs"
	};

	/**
	 * Names of files encoded incorrectly.
	 */
	private static final String [] INCORRECT_FILES = {
		"test1 cp1251.scs",
		"test1 cp1251 without last newline.scs",
		"test1 UTF16 be.scs",
		"test1 UTF16 be without last newline.scs",
		"test1 UTF16 le.scs",
		"test1 UTF16 le without last newline.scs",
		"test1 UTF16.scs",
		"test1 UTF16 without last newline.scs",
		"test1 UTF32.scs",
		"test1 UTF32 without last newline.scs",
		"test1 UTF8.scs",
		"test1 UTF8 without last newline.scs",
		"test1 windows-1251.scs",
		"test1 windows-1251 without last newline.scs"
	};

	/**
	 * SCSParser implementation.
	 */
	private SCSParser parser;

	/**
	 * Uses {@link SCSParserANTLRImpl} as parser.
	 */
	public EncodingTest() {
		Logger parsersLogger = new LoggerLog4jImpl(SCSParserANTLRImpl.class);
		parsersLogger.setLevel(LoggerLog4jImpl.INFO_LOG_LEVEL);
		this.parser = new SCSParserANTLRImpl(true);
		parser.setLogger(parsersLogger);
	}

	/**
	 * Tries to parse correct SCS file from resource folder.
	 * @param scsFile encoded file.
	 * @throws ParsingException should not be thrown.
	 */
	@Test(dataProvider = "correctSCSFilesProvider")
	public void correctEncodingTest(final File scsFile)
			throws ParsingException {
		LOGGER.debug("\t Parsing correct file: " + scsFile.getName());
		parser.parseFile(scsFile);
	}

	/**
	 * Tries to parse incorrect SCS file from resource folder.
	 * @param scsFile encoded file.
	 * @throws ParsingException is expected.
	 */
	@Test(dataProvider = "incorrectSCSFilesProvider",
			expectedExceptions = EncodingException.class)
	public void incorrectEncodingTest(final File scsFile)
			throws ParsingException {
		LOGGER.debug("\t Parsing incorrect file: " + scsFile.getName()
				+ " EncodingException should be thrown.");
		parser.parseFile(scsFile);
	}

	/**
	 * Data provider for encoding test.
	 * @return array of test SCS files correctly encoded.
	 */
	@DataProvider(name = "correctSCSFilesProvider")
	public Object[][] testRightDataProvider() {
		return wrapFiles(CORRECT_FILES);
	}

	/**
	 * Data provider for encoding test.
	 * @return array of test SCS files encoded with wrong encoding.
	 */
	@DataProvider(name = "incorrectSCSFilesProvider")
	public Object[][] testWrongDataProvider() {
		return wrapFiles(INCORRECT_FILES);
	}

	/**
	 * Creates wrapper Object[][] array
	 * around each file for given file's name from fileNames.
	 * @param fileNames array of relative file names.
	 * @return array of test SCS files encoded with wrong encoding.
	 */
	public Object[][] wrapFiles(final String[] fileNames) {
		Object[][] result = null;
		result = new Object[fileNames.length][];
		for (int index = 0; index < fileNames.length; ++index) {
			File file = null;
			try {
				file = new File(EncodingTest.class.getResource(
								"/EncodingTest/" + fileNames[index]).toURI());
			} catch (URISyntaxException e) {
				// Should not happen.
				e.printStackTrace();
			}
			result[index] = new Object[]{file};
		}
		return result;
	}

}
