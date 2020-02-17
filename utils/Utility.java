package com.bridgelabz.utils;

import java.util.ArrayList;

import org.apache.log4j.Logger;

import com.bridgelabz.customizedexceptions.CustomizedExceptions;

public class Utility {
	
	private final static Logger logger = Logger.getLogger(Utility.class);
	
	public static boolean isLeapYear(int year) throws CustomizedExceptions {
		boolean result=false;
		if(year<1582)
			throw new CustomizedExceptions("Enter any year greater than 1582.");
		
		else {
			if(year%4 == 0) {
				if(year%100 == 0) {
					if(year%400 == 0) {
						result=true;
						return result;
						}
					else {
						result=false;
						return result;
						}
				}
				else {
					result= true;
					return result;}
			}
			else {
			result=false;
			return result;
			}
		}
	}
	
	
	public static double harmonicNo(int number) {
		double sum=0.0;
		for(double i=1;i<=(double)number;i++) {
			sum = sum + 1/i;
		}
		return sum;
	}
	
	
	
	public static ArrayList primeFactors(int num) throws CustomizedExceptions {
		
		if(num<2)
			throw new CustomizedExceptions("Enter no greater than 2.");
		else {
			int j;
			ArrayList<Integer> list = new ArrayList<Integer>();
	
			for(int i=2;i<num;i++) {
				for(j=2;j<i;j++) {
					if(i%j==0)
						break;
				}
				if(num%i==0) {
					if(i==j)
						list.add(new Integer(j));
				}
			}
			return list;
		}
	}
	
	public static float[] flipTheCoins(int trials) {
		int tailcount=0;
		int headcount=0;
		float perHead=0;
		float perTail=0;
		float[] result = new float[2];
		if(trials<=0)
			logger.info("please enter a positive integer.");
		else {
			for(int i=0;i<trials;i++) {
				if(Math.random()>0.5) 
					headcount++;
				else
					tailcount++;
			}
			perHead=(float)headcount/(float)trials;
			perTail=(float)tailcount/(float)trials;		
			result[0]=perHead;
			result[1]=perTail;
		}
		return result;
	}
	

	public static void calculatePowerOfTwo(int n) 
			throws CustomizedExceptions{
		
		if(n==0)
			throw new CustomizedExceptions("Enter a no greater than 1");
		int result = 1;
		int[] arr= new int[n];
		for(int i=1;i<=n;i++) {
			result = result*2;
			arr[i]=result;
		}
		displayPowers(arr);
	}
	
	public static void displayPowers(int[] arr) {
		for (int i=0;i<arr.length;i++) {
			logger.info(arr[i]);
		}
	}
	public static void greetUser(String username) {
		String message = "Hello <<UserName>>, How are you?";
		logger.info(message.replace("<<UserName>>", username));
	}

} 
