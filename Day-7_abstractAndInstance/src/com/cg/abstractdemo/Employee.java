package com.cg.abstractdemo;

public class Employee extends Person{
	
	
	private int ID;
	public Employee(String name, String gender,int ID) {
		super(name, gender);
		this.ID=ID;
		// TODO Auto-generated constructor stub
	}
	@Override
	public void work() {
		// TODO Auto-generated method stub
		
		if(ID>0)
		{
			System.out.println("Employee  Exists");
		
		}
		else
		{
			System.out.println("Employee Not Exists");
		}
		
	}

}
