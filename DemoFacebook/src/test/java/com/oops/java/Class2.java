package com.oops.java;

public class Class2 {
    String name;
    int age;
    void testAs(String a, int b) {
    name=a;
    age=b;
} 
    void display() {
    	System.out.println(name+ " " +age);
    	
}  
    
    void display(int a) {
    	System.out.println(name+ " " +age);
    	
}  
    
    void display(String b) {
    	System.out.println(name+ " " +age);
    	
}  
//    Class2(){
//    	System.out.println("hello i am constructor");
//    }
//    
//    
//    Class2(int a){
//    	System.out.println("hello i am constructor");
//    }
//    
//    Class2(String a){
//    	System.out.println("hello i am constructor");
//    }
    public static void main(String[] args) {
		Class2 obj = new Class2();
//		Class2 obj2 = new Class2(4);
//		Class2 obj3 = new Class2("Vaibhav");
		obj.testAs("vaibhav", 27);
		obj.display();
		obj.testAs("sasi", 35);
	}
    
	}
    
    

