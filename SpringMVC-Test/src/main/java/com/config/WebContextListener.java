package com.config;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.apache.log4j.Logger;

public class WebContextListener implements ServletContextListener {
	
 	Logger log = Logger.getLogger(WebContextListener.class);

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		try {
			log.info("Inicio de la configuración de la aplicación");
			
			// ****************************
			// System Properties
			// ****************************
			setSystemProperties();
			
		} catch (Exception e) {
			log.error("Error en el inicio de la aplicación ", e);
			Runtime.getRuntime().exit(1);
		}
		
	}

	/**
	 * Obtenemos el fichero properties.path definido en el servidor Tomcat
	 * con las variables de sistema necesarias para la aplicación. 
	 */
	private static void setSystemProperties() {

		Properties properties = new Properties();
		FileInputStream fileInputStream = null;
		try {
			File fileSystemProperties = new File(System.getProperty("properties.path"));
			fileInputStream = new FileInputStream(fileSystemProperties);
			properties.load(fileInputStream);


			System.out.println("***************************************************************");
			System.out.println("***************************************************************");
			System.out.println("**** PROPIEDADES DE SISTEMA DEFINIDAS EN SYSTEM.PROPERTIES ****");
			System.out.println("***************************************************************");
			System.out.println("***************************************************************");
			
			for (Object key : properties.keySet()) {
				System.setProperty((String) key, (String) properties.get(key));				
				System.out.println(key + ":  " + properties.get(key));
			}

			System.out.println("***************************************************************");
			System.out.println("***************************************************************");
			
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
	
	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		// TODO Auto-generated method stub
		
	}

}
