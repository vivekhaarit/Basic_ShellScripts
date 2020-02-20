package com.bridgelabz.junit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

//import com.bridgelabz.customizedexceptions.MyException;
import com.bridgelabz.utils.InputUtility;
import com.bridgelabz.utils.LogUtility;

public class DayOfWeek {

	public static void main(String[] args) {
		
		LogUtility.setLog(DayOfWeek.class.getName());
		Logger logger = LogUtility.getLog();
		PropertyConfigurator.configure("log4j.properties");
		
		String ddmmyy = InputUtility.getString();
		int[] date = InputUtility.getDate(ddmmyy);
		String day = Utility.findWeekDay(date);
		System.out.println(day);
	}
}
