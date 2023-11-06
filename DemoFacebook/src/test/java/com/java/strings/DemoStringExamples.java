package com.java.strings;

import java.util.regex.Pattern;

public class DemoStringExamples {

	public static void main(String[] args) {
		StringConcat("" + "", "dddd");

		DemoStringExamples dse = new DemoStringExamples();
		dse.StringSplit();
		DemoStringExamples ds = new DemoStringExamples();
		ds.StringStartWith();
		DemoStringExamples p = new DemoStringExamples();
		p.StringIndex();
		DemoStringExamples r= new DemoStringExamples();
		r.StringSubString();

		
	}

	//this function will concatanation of two strings.
	static void StringConcat(String arg1, String arg2) {
		String s = arg1;
		s = s.concat(arg2);
		System.out.println(s);
		String v = "Sachin" + "Tendulkar";
		System.out.println(s);// Sachin Tendulkar
	}

	//this function will split the string
	void StringSplit() {
		Pattern p = Pattern.compile(":");
		// spliting the input sequence
		String[] str = p.split("Java:programming:Language", 3);
		for (String str1 : str) {
			System.out.println(" " + str1);

		}
	}

	//
	void StringStartWith() {
		String s1 = "My name is vaibhav";
		System.out.println(s1.startsWith("My"));
		System.out.println(s1.startsWith("My name"));
		System.out.println(s1.startsWith("my name"));
	}

	//
	void StringIndex() {
		String myStr = "Hello planet earth, you are a great planet.";
		System.out.println(myStr.indexOf("o", 8));

	}
	
//
	void StringSubString() {
		String s = "ViratKohli";
		String str2 = "viral will play super";
		System.out.println("origenle String:" + s);
		System.out.println("Substring start from index:" + s.substring(5));
		System.out.println("Substring start from index 0 to 5:" + s.substring(0, 5));

	}

	void StringTrim() {
		String s1 = "  java is Awesome  ";
		System.out.println(s1.length());
		System.out.println(s1); // Without trim()
		String tr = s1.trim();
		System.out.println(tr.length());
		System.out.println(tr); // With trim()

	}

	void StringValueOf() {
		int a = 30;
		String s1 = String.valueOf(a);
		System.out.println(s1 + 10);// concatenating string with 10
		int c = 20;
		String s2 = String.valueOf(c);
		System.out.println(s2 + 10);
	}

	void StringCharAt() {
		String name = "javatpoint";
		char ch = name.charAt(8);// returns the char value at the 10th index
		System.out.println(ch);
	}
	void StringEndWith() {
		 String s1 = "Selenium with java";
         System.out.println(s1.endsWith("java"));
         System.out.println(s1.endsWith("a"));
         System.out.println(s1.endsWith("v"));
	
	}
	void StringLength() {
		String g = "good";
		System.out.println("length of string:" +g.length());
	}
	void StringReplace() {
		String s1="java is hard";  
		String replaceString=s1.replace("hard","easy");
		System.out.println(replaceString);
	}
	void StringReplaceAll() {
		String s2 = "Realace all a";
        String ReplaceString = s2.replaceAll("a", "e");
        System.out.println(ReplaceString);
	}
}
