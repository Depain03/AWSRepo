package com.demo.Util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Util {

	public static Properties getProperty() {
		Properties properties = new Properties();
		InputStream is = null;
		try {
			is = new FileInputStream(".\\Properties\\config.properties");
			properties.load(is);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (is != null) {
					is.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return properties;
	}

}
