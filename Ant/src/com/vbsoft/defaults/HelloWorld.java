package com.vbsoft.defaults;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
public class HelloWorld {
	static final Logger logger = Logger.getRootLogger();
	public static void main(String [] args) throws Exception{
		BasicConfigurator.configure();
		System.out.println("Hello World !!!");
		logger.debug("My Hello World to log ");
		
	}
	
}
