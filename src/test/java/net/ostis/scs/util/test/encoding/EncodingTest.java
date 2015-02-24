package net.ostis.scs.util.test.encoding;
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
 * UTF8-without BOM							| ok
 * UTF8-without BOM without last newline	| ok
 * windows-1251								| parsed partly
 * windows-1251 without last newline		| parsed partly
 * @author Tsimur_Abayeu
 * Feb 13, 2015
 */

public final class EncodingTest {

}
