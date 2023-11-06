package com.oops.java;

public class Person1 {
    String name;
    int empid;
    Person1(String name,int empid){
    	this.name = name;
    	this.empid = empid;
    }
    public static void main(String[] args) {
		Person1 p1 = new Person1("vaibhav",123);
		Person1 p2 = new Person1("shubham",121);
		System.out.println("Person1 1 : "+p1.name+ " " +p1.empid);
		System.out.println("Person1 2 : "+p2.name+ " " +p2.empid);
	}
}
