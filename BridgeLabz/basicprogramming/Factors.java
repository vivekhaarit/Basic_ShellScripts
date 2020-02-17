package com.bridgelabz.basicprogramming;

import java.util.ArrayList;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.bridgelabz.customizedexceptions.CustomizedExceptions;
import com.bridgelabz.utils.InputUtility;
import com.bridgelabz.utils.LogUtility;
import com.bridgelabz.utils.Utility;

public class Factors {
	//private final static Logger logger = Logger.getLogger(Factors.class);
	
	
	public static void main(String[] args) 
			throws CustomizedExceptions{
		

		LogUtility.setLog(Factors.class.getName());
		Logger logger = LogUtility.getLog();
		PropertyConfigurator.configure("log4j.properties");
		
		logger.info("enter number: ");
		ArrayList<Integer> list;
		try {
			int num = InputUtility.getInt();
			list = Utility.primeFactors(num);
			logger.info(list);
			}
		catch(CustomizedExceptions e){
			logger.error(e);
			e.printStackTrace();
		}
	}

}
