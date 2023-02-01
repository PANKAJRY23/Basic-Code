package com.java;

public class LargestNumberInArray {

	public static void main(String[] args) {
		int [] arrays={70,20,30,100};
		int temp=0;
		for(int array:arrays) {
			if(array>temp) {
				temp = array;
			}	
		}
		System.out.println(temp);

	}

}
