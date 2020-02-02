package com.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.junit.Before;
import org.junit.Test;

public class SystemPropertiesTest {

	private static final String PROPERTIES_PATH = "src/main/resources/properties/system.properties";
	
	@Before
	public final void beforeTest() {
		System.setProperty("properties.path", PROPERTIES_PATH);
	}

	@Test
	public final void setSystemProperties() {

		Properties properties = new Properties();
		FileInputStream fileInputStream = null;
		try {
			File fileSystemProperties = new File(System.getProperty("properties.path"));
			fileInputStream = new FileInputStream(fileSystemProperties);
			properties.load(fileInputStream);

			for (Object key : properties.keySet()) {
				System.setProperty((String) key, (String) properties.get(key));
				System.out.println(key + " - " + properties.get(key));
			}

		} catch (Exception e) {
			System.out.println("Error en lectura de propiedades:" + e);
		} finally {
			if (fileInputStream != null) {
				try {
					fileInputStream.close();
				} catch (IOException e) {
					System.out.println("Error en cierre de fichero de configuracion" + e);
				}
			}
		}

	}

}
