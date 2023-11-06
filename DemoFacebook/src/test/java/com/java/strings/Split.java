package com.java.strings;

import java.util.regex.Pattern;

public class Split {

	public static void main(String[] args) {
		Pattern p=Pattern.compile(":");
		// spliting the input sequence
		String[] str=p.split("Java:programming:Language", 3);
		for(String str1:str)
		{
			System.out.println(" "+str1);
	
	}

	}
}
