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
}
