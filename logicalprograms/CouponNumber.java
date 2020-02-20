package com.bridgelabz.logicalprograms;

import java.util.Random;
import java.util.Scanner;


public class CouponNumber {

	static Scanner sc = new Scanner(System.in);
	static Random rand = new Random();
	
	static int[] createCoupons(int n) {
		int[] couponArr = new int[n];
		System.out.print("Enter "+n+" distinct coupon no: ");
		for (int i=0;i<couponArr.length;i++) {
			couponArr[i]=sc.nextInt();
		}
		for (int i=0;i<couponArr.length;i++) {
			System.out.print(couponArr[i]+" ");
		}
		System.out.println(" ");
		return couponArr;
	}
	
	static int collectCoupons(int n, int[] couponArr) {
		int index = rand.nextInt(n);		//generating any random index
		int coupon = couponArr[index];		//collecting any random coupon from the couponArr
		System.out.println("you got CouponNo: "+coupon);
		return coupon;
	}
	
	static int size_couponCollected(int[] couponsCollected) {
		int size=0;
		for(int i=0;i<couponsCollected.length;i++) {
			if(couponsCollected[i] !=0 )
				size++;
		}
		return size;
	}
	static int checkCoupons(int n, int[] couponArr) {
		int distinct = 0;
		int count = 0;
		int[] couponsCollected = new int[n];
		while(distinct<n) {
			int coupon = collectCoupons(n,couponArr);
			count++;
			int size = size_couponCollected(couponsCollected);
			for(int i=0;i<=size;i++) {
				if(coupon == couponsCollected[i])	//if the collected coupon had already been collected
							break;	//then don't add it in the couponsCollected array
				else {
					i++;
					couponsCollected[i]=coupon;
					distinct++;}
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		System.out.print("how many distinct coupons you want to create: ");
		int n = sc.nextInt();
		int[] couponArr = createCoupons(n);
		int count = checkCoupons(n, couponArr);
		System.out.println("total coupons collected: "+count);
	}

}
