package com.java.strings;

public class IndexOf {

	public static void main(String[] args) {
//          String s1 = "java is Awesome";
//          System.out.println(s1.indexOf("i",5));
		 String s2 = "Learn Java programming";
		    int result;

		    // getting the index of character 'a'
		    // search starts at index 4
		    result = s2.indexOf('a', 4);

		    System.out.println(result);  // 7

		    // getting the index of "Java"
		    // search starts at index 8
		    result = s2.indexOf("Java", 8);

		    System.out.println(result);  // -1
	}

}
