package helloWorld;

import org.apache.log4j.Logger;


public class Log4jDemo {
	
	final static Logger logger = Logger.getLogger(Log4jDemo.class);

	public static void main(String[] args) {

		System.out.println("Hello World !!");
		logger.info("This is information message");
		logger.warn("This is warn message");
		logger.error("This is error message ");
		logger.debug("This is debug message ");
		logger.fatal("This is fatal message ");
		
		
		
		System.out.println("\n Completed ... !!");
	}

}
