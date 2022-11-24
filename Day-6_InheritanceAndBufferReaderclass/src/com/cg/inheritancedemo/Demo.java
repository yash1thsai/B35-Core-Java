package com.cg.inheritancedemo;

import java.util.Scanner;

public class Demo {
	
	public static void main(String[] args)  {
		
		System.out.println("Enter the name :");
		Scanner s=new Scanner(System.in);
		String name1=s.nextLine();
		System.out.println("Enter the Breed: ");
		String breed1=s.nextLine();
		
		Childclass d=new Childclass();
		d.name=name1;
		d.breed=breed1;
		d.display();
		d.print();
	}

}
