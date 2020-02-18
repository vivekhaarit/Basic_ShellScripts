package com.bridgelabz.basicprogramming;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.bridgelabz.utils.InputUtility;

public class HarmonicNumber {
	private final static Logger logger = Logger.getLogger(HarmonicNumber.class);
	public static void main(String[] args) {
		PropertyConfigurator.configure("log4j.properties");
		logger.info("which harmonic no you want to print: ");
		int x = InputUtility.getInt();
		double result = Utility.harmonicNo(x);
		logger.info(result);
	}

}
