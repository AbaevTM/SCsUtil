package net.ostis.scs.util.application;

import java.io.File;

import net.ostis.scs.util.logging.Logger;
import net.ostis.scs.util.parsing.SCSParser;

/**
 * Implementation of {@link AbstractFileSystemCallback}
 * for @{link {@link Operation#VERIFY} operation.
 * @author Tsimur_Abayeu
 * Mar 7, 2015
 */
class VerifyFileSystemCallback extends AbstractFileSystemCallback {

	private SCSParser parser;

	/**
	 * @param loggerArg
	 * @param operationArg
	 */
	public VerifyFileSystemCallback(
			final SCSParser parserArg,
			final Logger loggerArg) {
		super(loggerArg, Operation.VERIFY);
		parser = parserArg;
	}

	@Override
	protected void executeCallbackLogic(final File file) {
		parser.parseFile(file);
	}

}
