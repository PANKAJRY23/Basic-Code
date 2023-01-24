package com.programs;

import java.util.*;

public class EvenNumber {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.print("Please enter the number: ");
		int number = scr.nextInt();
		if((number%2)==0) {
			System.out.println(number+" is a even number");
		}else {
			System.out.println(number+" not a even number");
		}
		
	}

}
