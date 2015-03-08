package net.ostis.scs.util.common.message;

import java.io.File;
import java.util.List;

import net.ostis.scs.util.application.Operation;
import net.ostis.scs.util.application.ProcessingStatus;
import net.ostis.scs.util.application.filesystem.FileSystemRunMode;

/**
 * Contains  utility methods returning application's messages.
 * Uses {@link Property}.
 * @author Tsimur_Abayeu
 * Mar 8, 2015
 */
public final class Message {

	private static final String START_MESSAGE_KEY = "message.start";

	private static final String END_MESSAGE_KEY = "message.end";

	private static final String ENTRY_MESSAGE_KEY = "message.entry";

	private static final String ENTRY_ERROR_MESSAGE_KEY = "message.entry.error";

	private static final String FAILED_RESULT_DESCRIPTION_MESSAGE_KEY =
			"message.failedResultDescription";

	private Message() {

	}

	public static String startMessage(
			final File file,
			final boolean encodingChecksEnabled,
			final FileSystemRunMode runMode,
			final Operation operation) {
		return Property.getString(
				START_MESSAGE_KEY,
				operation,
				file,
				encodingChecksEnabled,
				runMode);
	}

	public static String endMessage(
			final Operation operation,
			final ProcessingStatus status,
			final int processedFilesNumber,
			final int filesNumber,
			final String resultDescription) {
		return Property.getString(
				END_MESSAGE_KEY,
				operation,
				status,
				processedFilesNumber,
				filesNumber,
				resultDescription
				);
	}

	public static String entryMessage(
			final Operation operation,
			final File file) {
		return Property.getString(
				ENTRY_MESSAGE_KEY,
				operation,
				file);
	}

	public static String entryErrorMessage(
			final Throwable throwable) {
		return Property.getString(
				ENTRY_ERROR_MESSAGE_KEY,
				throwable.getMessage());
	}

	public static String failedResultDescription(final List<File> failedFiles) {
		StringBuilder builder = new StringBuilder();
		for (File file : failedFiles) {
			builder.append("\t" + file + "\n");
		}
		return Property.getString(
				FAILED_RESULT_DESCRIPTION_MESSAGE_KEY,
				builder.toString());
	}

}
