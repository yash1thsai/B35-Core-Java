package com.cg.superkeyworddemo;

public class Example extends Fruit{
	
	public String name="banana";
	
	public void accept()
	{
		System.out.println(name);
		System.out.println(super.name);
	}

}
