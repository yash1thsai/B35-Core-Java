package com.capgemini.classdemo;

import java.util.Scanner;

public class ClassAndObjectDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Speed of the car :");
		int speed=s.nextInt();
		
		Car obj=new Car();
		
		//obj.speed=45;
		obj.speed(speed);
		s.close(); 
		

	}

}
