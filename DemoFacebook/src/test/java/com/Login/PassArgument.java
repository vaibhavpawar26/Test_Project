package com.Login;

import org.testng.annotations.Test;

public class PassArgument {
	String name = "vaibhav";
	String pwd = "vaibhav123";
	public void testprint(String n,String p) {
		System.out.println("print user name : "+n);
	    System.out.println("print password :"+p);
    
}
	@Test
	public void testlogin() {
		testprint("java","java123");
		testprint("python","python123");
	}
}  