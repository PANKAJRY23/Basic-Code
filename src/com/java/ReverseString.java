package com.java;

public class ReverseString {

	public static void main(String[] args) {
		String s = "TCS";
		StringBuffer reverse = new StringBuffer();
		char [] c = s.toCharArray();
		for(int i=s.length()-1;i>=0;i--) {
			reverse.append(c[i]);
//			reverse = c[i]+"";
		}
		System.out.print(reverse);

	}

}
