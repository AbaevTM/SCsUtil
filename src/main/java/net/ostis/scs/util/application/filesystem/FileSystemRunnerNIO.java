package net.ostis.scs.util.application.filesystem;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

import net.ostis.scs.util.common.Property;
import net.ostis.scs.util.logging.Logger;

/**
 * Implementation of {@link FileSystemRunner} using utils from
 * {@link java.nio.file} package.
 * @author Tsimur_Abayeu
 * Mar 6, 2015
 */
public class FileSystemRunnerNIO implements FileSystemRunner {

	private static final String NONEXISTENT_ROOT_MESSAGE_KEY =
			"filesystemException.nonexistent-root";

	private static final String NOT_A_FILE_MESSAGE_KEY =
			"filesystemException.not-a-file";

	private static final String NOT_A_DIRECTORY_MESSAGE_KEY =
			"filesystemException.not-a-directory";

	private static final String CANNOT_CONTINUE_MESSAGE_KEY =
			"filesystemException.run-stopped";

	private static final int DIRECTORY_RUN_DEPTH = 1;

	private FileSystemRunMode runMode = FileSystemRunMode.FILE;

	private Logger logger;

	private File root;

	/**
	 * Default constructor.
	 * @param runModeArg  configuration of run's type.
	 */
	public FileSystemRunnerNIO(final FileSystemRunMode runModeArg) {
		super();
		runMode = runModeArg;
	}

	@Override
	public final void setRoot(final File rootArg) {
		root = rootArg;
	}

	@Override
	public final void run(final FileSystemRunnerCallback callback)
			throws FileSystemException {
		checkFileExistance();
		switch (runMode) {
			case FILE:
			checkFileIsFile();
				callback.execute(root);
				break;
			case DIRECTORY:
				checkFileIsDirectory();
				directoryRun(callback, DIRECTORY_RUN_DEPTH);
				break;
			case DIRECTORY_RECURSIVE:
				checkFileIsDirectory();
				directoryRun(callback, Integer.MAX_VALUE);
				break;
			default:
				break;
		}
	}

	/**
	 * Starts run for root that is  a directory. Handles any exception
	 * that can be thrown during run.
	 * @param callback triggered logic.
	 * @param depth maximal depth of visited file system's subtree.
	 * @throws FileSystemException in case if run cannot be continued.
	 */
	private void directoryRun(
			final FileSystemRunnerCallback callback,
			final int depth) throws FileSystemException {
		try {
			Files.walkFileTree(
					root.toPath(),
					null,
					DIRECTORY_RUN_DEPTH,
					new FilesystemRunnerVisitor(callback));
		} catch (IOException e) {
			// Should not happen.
			logger.info(e.getMessage(), e);
			throw new FileSystemException(Property.getString(
					CANNOT_CONTINUE_MESSAGE_KEY,
					e.getMessage()));
		}
	}

	/**
	 * Checks that root is a file.
	 * @throws FileSystemException if root is not a file.
	 */
	private void checkFileIsFile() throws FileSystemException {
		if (!root.isFile()) {
			throw new FileSystemException(Property.getString(
					NOT_A_FILE_MESSAGE_KEY, root));
		}
	}

	/**
	 * Checks that root is a directory.
	 * @throws FileSystemException if root is not a directory.
	 */
	private void checkFileIsDirectory() throws FileSystemException {
		if (!root.isFile()) {
			throw new FileSystemException(Property.getString(
					NOT_A_DIRECTORY_MESSAGE_KEY, root));
		}
	}

	/**
	 * Checks for root existence.
	 * @throws FileSystemException if root does not exist.
	 */
	private void checkFileExistance() throws FileSystemException {
		if (root == null || !root.exists()) {
			throw new FileSystemException(
					Property.getString(NONEXISTENT_ROOT_MESSAGE_KEY, root));
		}
	}

	@Override
	public final void setLogger(final Logger loggerArg) {
		logger = loggerArg;
	}

	/**
	 * Custom implementation of {@link FileVisitor}.
	 * @author Tsimur_Abayeu
	 * Mar 6, 2015
	 */
	private class FilesystemRunnerVisitor extends SimpleFileVisitor<Path>
		implements FileVisitor<Path> {

		private FileSystemRunnerCallback callback;

		/**
		 * @param callbackArg parameter.
		 */
		FilesystemRunnerVisitor(final FileSystemRunnerCallback callbackArg) {
			super();
			this.callback = callbackArg;
		}

		@Override
		 public FileVisitResult visitFile(
				 final Path path,
				 final BasicFileAttributes attrs)
				 throws IOException {
			FileVisitResult result = FileVisitResult.CONTINUE;
			try {
				super.visitFile(path, attrs);
				callback.execute(path.toFile());
			} catch (Exception e) {
				// Catch any exception, log it and continue.
				logger.info(e.getMessage(), e);
			}
			return result;
		}

	}

}
