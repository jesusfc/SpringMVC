package com.config;

import java.io.File;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.PropertyConfigurator;

public class Log4jInit implements ServletContextListener {


	@Override
	public void contextInitialized(ServletContextEvent sce) {

		// Obtenemos la url de fichero de log4j definido en el servidor Tomcat
		String log4jLocationFile = System.getProperty("log4j.configuration");
		
		File file = new File(log4jLocationFile);
		if (file.exists()) {
			System.out.println("Initializing log4j with: " + log4jLocationFile);
			PropertyConfigurator.configure(log4jLocationFile);
		} else {
			System.err.println("*** " + log4jLocationFile + " file not found, so initializing log4j with BasicConfigurator");
			BasicConfigurator.configure();
		}

	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		// TODO Auto-generated method stub

	}
}
