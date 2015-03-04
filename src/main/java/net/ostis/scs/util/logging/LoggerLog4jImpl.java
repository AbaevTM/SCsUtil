package net.ostis.scs.util.logging;

import java.io.IOException;
import java.util.Enumeration;

import org.apache.log4j.Appender;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Level;
import org.apache.log4j.PatternLayout;

/**
 * Implementation of Logger that uses Log4j logger.
 * By default prints output to console but can
 * also print output to file.
 * @author Tsimur_Abayeu
 * Feb 28, 2015
 */
public class LoggerLog4jImpl implements Logger {

	public static final String DEFAULT_PATTERN_LAYOUT = "%m%n";

	public static final boolean DEFAULT_APPEND_TO_FILE_POLICY = false;

	public static final int DEBUG_LOG_LEVEL = Level.DEBUG.toInt();

	public static final int INFO_LOG_LEVEL = Level.INFO.toInt();

	private static final String FILE_APPENDER_NAME = "fileAppender";

	private static final Level DEFAULT_LOG_LEVEL = Level.INFO;

	private org.apache.log4j.Logger logger;

	/**
	 * Default constructor that instantiates
	 * logger with Log4j logger for client's class.
	 * @param clientClass class of logger client.
	 */
	public LoggerLog4jImpl(final Class<?> clientClass) {
		super();
		logger = org.apache.log4j.Logger.getLogger(clientClass);
		@SuppressWarnings("unchecked")
		Enumeration<Appender> appenders =
				logger.getAllAppenders();
		while (logger.getAllAppenders().hasMoreElements()) {
			appenders.nextElement().setLayout(
					new PatternLayout(DEFAULT_PATTERN_LAYOUT));
		}
	}

	@Override
	public final void debug(final Object message) {
		logger.debug(message);
	}

	@Override
	public final void debug(final Object message, final Throwable throwable) {
		logger.debug(message, throwable);
	}

	@Override
	public final void info(final Object message) {
		logger.info(message);
	}

	@Override
	public final void info(final Object message, final Throwable throwable) {
		logger.info(message, throwable);
	}

	@Override
	public final void setLogFile(final String fileName) {
		logger.removeAppender(FILE_APPENDER_NAME);
		if (fileName != null) {
			try {
			Appender fileAppender = new FileAppender(
					new PatternLayout(DEFAULT_PATTERN_LAYOUT),
					fileName,
					DEFAULT_APPEND_TO_FILE_POLICY
					);
			fileAppender.setName(FILE_APPENDER_NAME);
			logger.addAppender(fileAppender);
			} catch (IOException e) {
				logger.debug(e.getMessage(), e);
			}
		}
	}

	@Override
	public final void setLevel(final int level) {
		logger.setLevel(Level.toLevel(level, DEFAULT_LOG_LEVEL));
	}

}
