package com.jesusfc.test.database.test;


import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public final class Log4JTest {

	static Logger logger = Logger.getLogger(Log4JTest.class);

	private Log4JTest() {
		
		BasicConfigurator.configure();		
		logger.debug("debug message");
		logger.info("info message");
		logger.warn("warn message");
		logger.error("error message");
		logger.fatal("fatal message");
	}

}
