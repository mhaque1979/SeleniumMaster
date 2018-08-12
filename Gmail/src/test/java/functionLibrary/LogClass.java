package functionLibrary;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import jdk.internal.jline.internal.Log;

public class LogClass {
	
	private static Logger LOG = Logger.getLogger(LogClass.class);
	
	public static void startTestCase(String testcaseName) {
		PropertyConfigurator.configure("log4j.properties");
		LOG.info("=================================================================================");
		LOG.info("**************************"+ testcaseName + " Start from here **********************");
		LOG.info("**********************************************************************************");
		
	}
	
	public static void endTestCase(String testcaseName) {
		PropertyConfigurator.configure("log4j.properties");
		LOG.info("**********************************************************************************");
		LOG.info("**************************"+ testcaseName + " end from here **********************");
		LOG.info("**********************************************************************************");
		
	}
	
	public static void pass(String messages) {
		PropertyConfigurator.configure("log4j.properties");
		LOG.info(messages);
	}

	public static void error(String messages) {
		PropertyConfigurator.configure("log4j.properties");
		LOG.error(messages);
	}
	
	public static void warn(String messages) {
		PropertyConfigurator.configure("log4j.properties");
		LOG.warn(messages);
	
	}
	
}
