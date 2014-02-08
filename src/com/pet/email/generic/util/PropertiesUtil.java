package com.pet.email.generic.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Class Description	: 
 * Created By			: Khairul Ikhwan
 * Created Date			: Jul 5, 2013
 * Current Version		: 1.0
 * Latest Changes By	: 
 * Latest Changes Date	: 
 */
public class PropertiesUtil {
	
	private static Properties systemProp = loadFromClassPath("/email.properties", PropertiesUtil.class);
	
	public static final String KEY_DEFAULT_LANDING_HASH = "default.landing.hash";
	
	public static final String getSystemProperties(String key, String defaultValue) {
		return systemProp.getProperty(key, defaultValue);
	}

	public static final Properties loadFromClassPath(String path, Class<?> clazz) {
		Properties props = new Properties();
		InputStream is = null;
		try {
			is = clazz.getResourceAsStream(path);
			props.load(is);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(is != null) {
					is.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return props;
	}
	
}
