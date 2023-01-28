package com.java;

import java.util.Scanner;

public class FactorialOfNumber {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.print("Please enter the number: ");
		int n = scr.nextInt();
		int fact=n;
		for(int i=1;i<n;i++) {
			fact =fact*(n-i);
		}
		System.out.println(fact+" Is the factorial of "+n);

	}

}