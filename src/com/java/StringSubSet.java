package com.java;

public class StringSubSet {

	public static void main(String[] args) {
		String s = "FUN";
		char [] c = s.toCharArray();
		for(int i=0;i<c.length;i++) {
			for(int j=i+1;j<c.length;j++) {
			System.out.println(c[i]+""+c[j]);
			
			}
			System.out.println(c[i]);
		}
		System.out.println(c);
		
		

	}

}
