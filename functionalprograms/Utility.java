package com.bridgelabz.functionalprograms;

import java.util.Scanner;

import org.apache.log4j.Logger;

import com.bridgelabz.myexceptions.InvalidRowColumnException;
import com.bridgelabz.myexceptions.MyException;
import com.bridgelabz.utils.InputUtility;

public class Utility {
	
	private final static Logger logger = Logger.getLogger(Utility.class);
	static Scanner sc = new Scanner(System.in);
	
	
	public static int[] makeArray(int size) 
			throws MyException {
		
		if(size<1)
			throw new MyException("Array size must be greater than 1.");
		
		int[] elements = new int[size];
		for(int i=0;i<size;i++) {
			elements[i] = InputUtility.getInt();
		}
		return elements;
	}
	
	public static void showArray(int[] array) {
		for(int i=0;i<array.length;i++) {
			logger.info(array[i]);
		}
	}
	
	public static void findTriplets(int[] array) {
		int size = array.length;
		int count=0;
		for(int i=2;i<size;i++) {
			for(int j=1;j<size;j++) {
				if(j==i)
					continue;
				for(int k=0;k<size;k++) {
					if(k==j||k==i)
						continue;
					if(array[i]+array[j]+array[k] == 0) {
						logger.info("["+array[i]+", "+array[j]+", "+array[k]+"]");
						count++;
					}
				}
			}
		}
		logger.info("No of distinct triplets are: "+count);
		if(count==0)
			logger.info("No triplets found.");
	}
	
	public static void read2D_int(int r,int c) 
			throws InvalidRowColumnException {
		
		if(r<=0||c<=0)
			throw new InvalidRowColumnException("row column value must be positive");
		
		int[][] arrInt = new int[r][c];
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				arrInt[i][j] = sc.nextInt();	//
			}
		}
		System.out.println("array length is : "+arrInt.length);
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				System.out.print(arrInt[i][j]+" ");
			}
			System.out.println("");
		}
	}
	
	
	public static void read2D_boolean(int r,int c) 
			throws InvalidRowColumnException{
		
		if(r<=0||c<=0)
			throw new InvalidRowColumnException("row column value must be positive");
	
		boolean[][] arrBln = new boolean[r][c];
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				arrBln[i][j] = sc.nextBoolean();
			}
		}
		System.out.println("the array elememts are: ");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				System.out.print(arrBln[i][j]+" ");
			}
			System.out.println("");
		}
	}
	
}
