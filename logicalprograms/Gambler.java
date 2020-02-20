package com.bridgelabz.logicalprograms;

import java.util.Scanner;
import com.bridgelabz.utils.InputUtility;

public class Gambler {

	public static void main(String[] args) {
		System.out.print("Enter the amount you want to stake: ");
		int stake = InputUtility.getInt();
		System.out.println("How many time you would like to play: ");
		int n = InputUtility.getInt();
		System.out.println("What is your goal: ");
		int reach = InputUtility.getInt();
		int goal = 0;
		int win = 0;
		int lose=0;
		
		for(int i=0;i<n;i++) {
			while((stake > 0)&&(goal <= reach)) {
				if(Math.random()<0.5) { 
					win++;
					goal++;}
				else {
					lose++;
					stake--;}
				
			
			}
		}
		float perWin = win*100/n;
		float perLose = lose*100/n;
		System.out.println("No of Bets: "+n+"\n%Win: "+perWin+"\n%Loss: "+perLose);
	}

}
