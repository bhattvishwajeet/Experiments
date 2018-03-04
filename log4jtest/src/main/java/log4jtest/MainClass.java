package log4jtest;
import org.apache.log4j.Logger;

public class MainClass {

	private static final Logger log = Logger.getLogger(MainClass.class);
	
	public static void main(String args[]) throws Exception{
		//System.out.println("Hello World!");
		log.fatal("FATAL: Hello World!");
		log.error("ERROR: Hello World!");
		log.warn("WARN: Hello World!");
		log.info("INFO: Hello World!");
		log.debug("DEBUG: Hello World!");
		log.trace("TRACE: Hello World!");
	}
	
}
