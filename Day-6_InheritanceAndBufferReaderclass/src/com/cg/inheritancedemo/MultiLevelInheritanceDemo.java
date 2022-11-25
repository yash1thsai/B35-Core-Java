package com.cg.inheritancedemo;

import java.util.Scanner;

public class MultiLevelInheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Vehicle Name :");
		String veh_name=s.nextLine();
		Tire t=new Tire();
		t.name=veh_name;
		t.display();	
		
		System.out.println("Enter the brand Name :");
		String brand=s.nextLine();
		t.setName1(brand);
		t.display1();
		
		System.out.println("Enter the tyre Name :");
		String t_name=s.nextLine();
		t.setName1(t_name);
		t.display2();
		s.close();

	}

}
