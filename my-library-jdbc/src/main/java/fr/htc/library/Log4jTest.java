package fr.htc.library;

import org.apache.log4j.Logger;

public class Log4jTest {

	final static Logger logger = Logger.getLogger(Log4jTest.class);

	public static void main(String[] args) {

		logger.info("info");
		logger.warn("warn");
		logger.error("error");
		logger.debug("debug");
		logger.fatal("fatal");

	}
}
