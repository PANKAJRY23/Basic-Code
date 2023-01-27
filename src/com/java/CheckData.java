package com.java;

import java.util.HashMap;

public class CheckData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "It is nice";
		int temp =0;
		int [] intAr = {10,20,30,40,55,11,13,8}; 
		for(int i=0;i<intAr.length;i++) {
			for(int j=1;j<intAr.length;j++) {
				if(intAr[i]>intAr[j]) {
					temp = intAr[i];
					
				}
			}
			System.out.println(temp);
		}
		
	}

}
