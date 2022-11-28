package com.cg.abstractdemo;

public class EmployeePersonExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1=new Employee("Eren","Male",24);
		Person p2=new Employee("Mikasa","Female",0);
		
		//to return the data we inserted
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		p1.work();
		p2.work();
		
		

	}

}
