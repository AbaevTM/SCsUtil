package net.ostis.scs.util.application.filesystem;

import java.io.File;

import net.ostis.scs.util.logging.LoggerAware;

/**
 * Utility that calls callback method for
 * every file on file system beginning from {@link FileSystemRunner#setRoot}
 * and depending on run configuration (handled by extending class).
 * @author Tsimur_Abayeu
 * Mar 6, 2015
 */
public interface FileSystemRunner extends LoggerAware {

	/**
	 * Sets root of the run. Can be a file or a directory depending
	 * on run configuration.
	 * @param root root file of the run.
	 */
	void setRoot(final File root);

	/**
	 * Depending on run configuration calls callback on each file.
	 * If callback throws exception runner should handle it and try
	 * to continue current run.
	 * @param callback contains triggered logic.
	 * @throws FileSystemException in case if runner cannot
	 * be configured properly.
	 */
	void run(final FileSystemRunnerCallback callback)
			throws FileSystemException;

}
