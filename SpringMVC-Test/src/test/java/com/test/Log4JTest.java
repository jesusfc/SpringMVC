package com.test;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.junit.Test;

public final class Log4JTest {

	static Logger log = Logger.getLogger(Log4JTest.class);

	@Test
	public void log4JTest() {
		BasicConfigurator.configure();
		log.debug("debug message");
		log.info("info message");
		log.warn("warn message");
		log.error("error message");
		log.fatal("fatal message");
	}

}
