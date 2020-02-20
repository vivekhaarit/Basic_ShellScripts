package com.bridgelabz.utils;

import java.util.Scanner;

public class InputUtility {
	static Scanner sc = new Scanner(System.in);
	
	public static String getString() {
		return sc.nextLine();
	}
	
	public static float getFloat() {
		return sc.nextFloat();
	}
	
	public static int getInt() {
		return sc.nextInt();
	}
	
	public static Object[] getArray(int size) {
		return new Object[size];
	}
	
	public static int[] getDate(String dateString) {
		String[] ddmmyy = dateString.split(" ");
		int[] date = new int[3];
		for(int i=0;i<3;i++) {
			date[i] = Integer.parseInt(ddmmyy[i]);
		}
		return date;
	}
}
