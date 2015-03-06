package net.ostis.scs.util.logging;

/**
 * Marks classes that can use {@link Logger}.
 * @author Tsimur_Abayeu
 * Mar 6, 2015
 */
public interface LoggerAware {

	/**
	 * Sets custom implementation of logger.
	 * @param logger to be used by parser.
	 */
	void setLogger(final Logger logger);

}
