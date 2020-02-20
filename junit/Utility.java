package com.bridgelabz.junit;

public class Utility {

	public static String findWeekDay(int[] date) {
		String[] days = {"sunday", "monday", "tuesday","wednesday","thursday","friday","saturday"};
		int y = date[2];
		int m = date[1];
		int d = date[0];
		
		float yo = y-(14-m)/12;
		float x = yo + (yo/4) - (yo/100) + (yo/400);
		float mo = m + 12*((14-m)/12)-2;
		int numerator = (int)(d + x + 31*(mo/12));
		int d0 = numerator%7;
		String day=null;
		
		switch(d0) {
			case 0: day = days[0];
			case 1: day = days[1];
			case 2: day = days[2];
			case 3: day = days[3];
			case 4: day = days[4];
			case 5: day = days[5]; 
			case 6: day = days[6];
		}
		return day;
	}
}
