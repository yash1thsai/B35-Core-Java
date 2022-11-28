package com.cg.abstractdemo;

public abstract class Person {
	//data members
	private String name;
	private String gender;
	
	//constructor
	public Person(String name, String gender) {
		super();
		this.name = name;
		this.gender = gender;
	}
	
	//abstract method
	public abstract void work();

	@Override
	public String toString() {
		return "Person [name=" + name + ", gender=" + gender + "]";
	}
	
	//user-defined method
	
	void changeName(String newname)
	{
		name=newname;
	}
	
}
