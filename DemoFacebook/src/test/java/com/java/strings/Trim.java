package com.java.strings;

public class Trim {

	public static void main(String[] args) {
		String s1 = "  java is Awesome  ";
		System.out.println(s1.length());
		System.out.println(s1); // Without trim()
		String tr = s1.trim();
		System.out.println(tr.length());
		System.out.println(tr); // With trim()

		
		testIndexOf("kkk kjjjghghfgf dsdese");
	}

	public static void testIndexOf(String s) {
//		String str1 = "About 1,28,00,00,000 results (0.29 seconds)";
		String str1 = s;
		

		System.out.println(str1.indexOf("results"));

		System.out.println(str1.substring(6, 21));

		String[] str2 = str1.split(" ");
		int aa = str2.length;
		System.out.println(aa);
		System.out.println(str2[1]);
	}
	
	public static void testcharAt() {
		String str1 = "About 1,28,00,00,000 results (0.29 seconds)";

		System.out.println(str1.indexOf("results"));

		System.out.println(str1.substring(6, 21));

		String[] str2 = str1.split(" ");
		int aa = str2.length;
		System.out.println(aa);
		System.out.println(str2[1]);
	}
	

}
