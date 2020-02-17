package com.bridgelabz.basicprogramming;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.bridgelabz.utils.InputUtility;
import com.bridgelabz.utils.Utility;

public class FlipCoin {
	private final static Logger logger = Logger.getLogger(FlipCoin.class);
	public static void main(String[] args) {
		PropertyConfigurator.configure("log4j.properties");
		logger.info("how many times you want to flip the coin?: ");
		int trials = InputUtility.getInt();
		float[] result = Utility.flipTheCoins(trials);
		logger.info("head: "+result[0]+"\nTail: "+result[1]);
	}
}
