package net.ostis.scs.util.application.filesystem;

/**
 * Defines possible run modes for {@link FileSystemRunner}.
 * @author Tsimur_Abayeu
 * Mar 6, 2015
 */
public enum FileSystemRunMode {

	/**
	 * Callback should be called just for root that is a file.
	 * Otherwise exception will be thrown.
	 */
	FILE,

	/**
	 * Callback should be called for each file under root that is a directory.
	 * Otherwise exception will be thrown.
	 */
	DIRECTORY,

	/**
	 * Callback should be called for each file under root that is a directory
	 * recursively. Otherwise exception will be thrown.
	 */
	DIRECTORY_RECURSIVE;

}
