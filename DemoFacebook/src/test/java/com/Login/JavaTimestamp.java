package com.Login;

import java.sql.Timestamp;

public class JavaTimestamp {

	public static void main(String[] args) {
		Timestamp currentTimestamp = new Timestamp(System.currentTimeMillis());
		System.out.println("Formatted Timestamp: " + currentTimestamp.toString());
	}
         
}
