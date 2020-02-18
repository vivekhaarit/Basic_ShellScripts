package com.bridgelabz.basicprogramming;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.bridgelabz.customizedexceptions.YearLessThan15882Exception;
import com.bridgelabz.utils.InputUtility;
import com.bridgelabz.utils.LogUtility;

public class LeapYear {
	
	//private final static Logger logger = Logger.getLogger(LeapYear.class);
	
	public static void main(String[] args) 
			throws YearLessThan15882Exception {
		
		
		LogUtility.setLog(LeapYear.class.getName());
		Logger logger = LogUtility.getLog();
		PropertyConfigurator.configure("log4j.properties");
    	logger.info("Enter any year(greater than 1582): ");
		try {
		int year = InputUtility.getInt();
		boolean result=false;
		result=Utility.isLeapYear(year);
		if(result)
			logger.info("leap");
		else
			logger.info("not leap");
		}
		catch(YearLessThan15882Exception e) {
			e.printStackTrace();
		}
	}
}
