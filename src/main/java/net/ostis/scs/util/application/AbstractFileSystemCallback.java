package net.ostis.scs.util.application;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.ostis.scs.util.application.filesystem.FileSystemRunnerCallback;
import net.ostis.scs.util.common.exception.ApplicationException;
import net.ostis.scs.util.common.message.Message;
import net.ostis.scs.util.logging.Logger;

/**
 * Base class for callbacks used in {@link Application}.
 * @author Tsimur_Abayeu
 * Mar 8, 2015
 */
public abstract class AbstractFileSystemCallback
	implements FileSystemRunnerCallback {

	private static final String SCS_EXTENSION = ".scs";

	private int filesNumber;

	private Logger logger;

	private Operation operation;

	private ProcessingStatus status;

	private List<File> failedFiles;

	public AbstractFileSystemCallback(
			final Logger loggerArg,
			final Operation operationArg) {
		super();
		failedFiles = new ArrayList<File>();
		status = ProcessingStatus.SUCCESS;
		logger = loggerArg;
		operation = operationArg;
	}

	@Override
	public final void execute(final File file) {
		if (file.getName().endsWith(SCS_EXTENSION)) {
			++filesNumber;
			logger.info(Message.entryMessage(operation, file));
			try {
				executeCallbackLogic(file);
			} catch (ApplicationException e) {
				logger.info(Message.entryErrorMessage(e));
				status = ProcessingStatus.FAILURE;
				failedFiles.add(file);
			}
		}
	}

	/**
	 * Hook-method for subclasses.
	 * Should contain logic of certain callback type.
	 * @param file
	 * @throws ApplicationException if any error occurs while processing.
	 * The exception should be caught and logged. Processing status changed
	 * to @{link {@link ProcessingStatus#FAILURE}.
	 */
	protected abstract void executeCallbackLogic(final File file)
			throws ApplicationException;

	public final int getFilesNumber() {
		return filesNumber;
	}

	public final int getProcessedFilesNumber() {
		return filesNumber - failedFiles.size();
	}

	public final ProcessingStatus getStatus() {
		return status;
	}

	public final List<File> getFailedFiles() {
		return failedFiles;
	}

}
