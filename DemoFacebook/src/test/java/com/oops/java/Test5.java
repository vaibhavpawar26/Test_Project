package com.oops.java;

public class Test5 {
   void show(String b,int a) {
	   System.out.println("show1");
	   
   }
   void show(int a) {
	   System.out.println("show2");
	   
   }
  public static void main(String[] args) {
	Test5 t =new Test5();
	t.show("abc",10);
	//t.show("vaibhav");
	
}
}
