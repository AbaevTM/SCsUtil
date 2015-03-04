package net.ostis.scs.util.common;

import java.io.File;
import java.net.URISyntaxException;
import java.text.MessageFormat;

import org.apache.commons.configuration.Configuration;
import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;

/**
 * Utility for retrieving values from property files.
 * @author Tsimur_Abayeu
 * Mar 1, 2015
 */
public final class Property {

	private static  Configuration property;

	private static final String PROPERTIES_FILE_PATH =
			"/properties/config.properties";

	static {
		try {
			property = new PropertiesConfiguration(new File(
					Property.class.getResource(PROPERTIES_FILE_PATH).toURI()));
		} catch (ConfigurationException | URISyntaxException e) {
			//Should never happen.
			e.printStackTrace();
		}
	}

	/**
	 * Retrieves property value by its key and substitutes
	 * parameters.
	 * @param key property's key.
	 * @param args arguments to be substituted.
	 * @return formated string.
	 */
	public static String getString(
			final String key,
			final Object ... args
			) {
		return MessageFormat.format(property.getString(key), args);
	}

	/**
	 * Retrieves property value by its key.
	 * @param key property's key.
	 * @return property's value.
	 */
	public static String getString(final String key) {
		return property.getString(key);
	}

	/**
	 * Hidden constructor.
	 */
	private Property() {

	}

}
