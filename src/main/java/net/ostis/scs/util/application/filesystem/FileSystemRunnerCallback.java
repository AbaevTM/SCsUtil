package net.ostis.scs.util.application.filesystem;

import java.io.File;

/**
 * Callback that is used by {@link FileSystemRunner}.
 * @author Tsimur_Abayeu
 * Mar 6, 2015
 */
public interface FileSystemRunnerCallback {

	/**
	 * Callback's logic that is triggered for each file in
	 * the run.
	 * @param file current file.
	 */
	void execute(final File file);

}
