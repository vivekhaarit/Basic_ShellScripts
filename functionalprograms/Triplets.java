package com.bridgelabz.functionalprograms;

import java.util.ArrayList;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.bridgelabz.myexceptions.MyException;
import com.bridgelabz.utils.InputUtility;
import com.bridgelabz.utils.LogUtility;

public class Triplets {
	
	
	public static void main(String[] args) 
			throws MyException{
		
		LogUtility.setLog(Triplets.class.getName());
		Logger logger = LogUtility.getLog();
		PropertyConfigurator.configure("log4j.properties");
		
		logger.info("how many elements you want to enter : ");
		int size = InputUtility.getInt();
		
		int[] elements = Utility.makeArray(size);
		Utility.showArray(elements);
		Utility.findTriplets(elements);
		

	}
}
