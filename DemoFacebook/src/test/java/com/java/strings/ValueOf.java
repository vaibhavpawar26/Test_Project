package com.java.strings;

public class ValueOf {

	public static void main(String[] args) {
//		int a=30;  
//		String s1=String.valueOf(a);  
//		System.out.println(s1+10);//concatenating string with 10 
//		int c= 20;
//		String s2=String.valueOf(c);
//		System.out.println(s2+10);
		char[] data = { 'G', 'E', 'E', 'K', 'S', ' ', 'F', 'O', 'R', ' ', 'G', 'E', 'E', 'K', 'S' };
		String sample;

		// Returns the string representation
		// of a specific subarray of the chararray argument
		sample = String.valueOf(data, 0, 15);

		System.out.println(sample);

		// Returns the string of charArray 0 to 5
		sample = String.valueOf(data, 0, 5);
                                       
		System.out.println(sample);

		// Returns the string of charArray starting
		// index 6 and total count from 6 is 8
		sample = String.valueOf(data, 4, 8);

		System.out.println(sample);

	}

}
