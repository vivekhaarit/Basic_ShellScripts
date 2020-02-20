package com.bridgelabz.functionalprograms;

import java.util.Scanner;

import com.bridgelabz.myexceptions.InvalidRowColumnException;

public class TwoDArray {
	
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
			throws InvalidRowColumnException{
		
		try {
		System.out.print("Enter rows: ");
		int r = sc.nextInt();
		System.out.print("Enter columns: ");
		int c = sc.nextInt();
		System.out.println("Enter array elements: ");
		Utility.read2D_boolean(r,c);
		}
		catch(InvalidRowColumnException e) {
			
			e.printStackTrace();
		}
	}

}


