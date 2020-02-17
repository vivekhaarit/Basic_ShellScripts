package com.bridgelabz.utils;

import org.apache.log4j.Logger;


public class LogUtility {
	//private final static Logger logger;
	private static Logger logger;
	
	public static Logger getLog() {
		return logger;
	}
	public static void setLog(String className) {
		LogUtility.logger=Logger.getLogger(className);
	}
}
