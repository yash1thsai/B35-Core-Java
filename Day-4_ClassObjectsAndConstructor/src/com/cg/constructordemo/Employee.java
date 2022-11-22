package com.cg.constructordemo;

public class Employee {
	
	public int salary;
	public String name;
	
	Employee()
	{
		System.out.println("Default Constructor");
	}
    //parameterized constructor
	public Employee(int salary, String name) {
		super();
		this.salary = salary;
		this.name = name;
		
	
	}
	//method
    public void print()
    {
    	System.out.println("The Salary of "+name+" is:"+salary);
    }
}
