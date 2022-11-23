package com.cg.accessspecifiersdemo;

public class DefaultDemo {
	
	//def data-mem
	int speed;
	
	//constructor
	DefaultDemo(int speed) {
		super();
		this.speed = speed;
	}
	
	//method
	void display()
	{
		System.out.println("The Speed is :"+speed);
	}

}
