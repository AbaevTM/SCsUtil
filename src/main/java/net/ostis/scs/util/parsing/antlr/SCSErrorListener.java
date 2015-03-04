package net.ostis.scs.util.parsing.antlr;

import java.io.File;
import java.util.BitSet;

import net.ostis.scs.util.parsing.exception.EncodingException;

import org.antlr.v4.runtime.ANTLRErrorListener;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;

public class SCSErrorListener implements ANTLRErrorListener{

	private File file;

	/**
	 * Default constructor.
	 * @param fileArg File to be parsed.
	 * printing error messages.
	 */
	public SCSErrorListener(final File fileArg) {
		super();
		this.file = fileArg;
	}

	@Override
	public void reportAmbiguity(Parser arg0, DFA arg1, int arg2, int arg3,
			boolean arg4, BitSet arg5, ATNConfigSet arg6) {
		// TODO Auto-generated method stub

	}

	@Override
	public void reportAttemptingFullContext(Parser arg0, DFA arg1, int arg2,
			int arg3, BitSet arg4, ATNConfigSet arg5) {
		// TODO Auto-generated method stub

	}

	@Override
	public void reportContextSensitivity(Parser arg0, DFA arg1, int arg2,
			int arg3, int arg4, ATNConfigSet arg5) {
		// TODO Auto-generated method stub

	}

	@Override
	public void syntaxError(Recognizer<?, ?> arg0, Object arg1, int arg2,
			int arg3, String arg4, RecognitionException arg5) {
		boolean errorAtFirstSymbol = arg2 == 1 && (arg3 == 0 || arg3 == 1);
		if (errorAtFirstSymbol) {
			//TODO Maybe there is a better way to discover encoding
			// issues earlier.
			throw new EncodingException(file, arg5);
		}
	}

}
