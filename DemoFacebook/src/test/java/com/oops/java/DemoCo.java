package com.oops.java;

public class DemoCo {
	class A {
	    private String name;
	    private double salary;

	    public A(String name, double salary) {
	        this.name = name;
	        this.salary = salary;
	    }

	    public String getName() {
	        return name;
	    }

	    public double getSalary() {
	        return salary;
	    }
	}

	class B extends A {
	    private String city;
	    private String technology;

	    public B(String name, double salary, String city, String technology) {
	        super(name, salary);
	        this.city = city;
	        this.technology = technology;
	    }

	    public String getCity() {
	        return city;
	    }

	    public String getTechnology() {
	        return technology;
	    }
	}

	class C extends B {
	    private String place;

	    public C(String name, double salary, String city, String technology, String place) {
	        super(name, salary, city, technology);
	        this.place = place;
	    }

	    public String getPlace() {
	        return place;
	    }
	}

	
	    public static void main(String[] args) {
	         c objectC = new C("John", 50000.0, "New York", "Java", "Office");
	        
	        System.out.println("Name: " + objectC.getName());
	        System.out.println("Salary: " + objectC.getSalary());
	        System.out.println("City: " + objectC.getCity());
	        System.out.println("Technology: " + objectC.getTechnology());
	        System.out.println("Place: " + objectC.getPlace());
	    }
	}


