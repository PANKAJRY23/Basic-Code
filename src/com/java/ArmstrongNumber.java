package com.java;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.print("Please enter a number: ");
		int num = scr.nextInt();
		int notChangedNumber = num;
		int temp;
		int sum=0;
		while(num>0) {
			temp = num%10;
			sum = sum+(int)java.lang.Math.pow(temp, 3);
			num = num/10;
		}
		if(notChangedNumber==sum) {
			System.out.println(notChangedNumber+" is a Armstrong number");
		}
		else {
			System.out.println(notChangedNumber+" is not a Armstrong number");
		}
	}

}
