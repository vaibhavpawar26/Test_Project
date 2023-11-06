package com.java.strings;

public class DemoloopBreak {
/**
 * print numbers from 1 to 12 and 21 to 30.
 * here we are skipping the numbers from 13 to 20.
 *
 */
	public static void main(String[] args) {
		for (int i = 1; i <= 30; i++) {
			// System.out.println(i);
			if ((1 <= i && i <= 12) || (21 <= i && i <= 30)) {
				System.out.print(" " + i);
			}

		}
	}

}
