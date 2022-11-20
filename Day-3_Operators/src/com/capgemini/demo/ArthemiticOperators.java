package com.capgemini.demo;

import java.util.Scanner;

public class ArthemiticOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		System.out.println("additon :"+(a+b));
		System.out.println("subtraction :"+(a-b));
		System.out.println("multiplication :"+(a*b));
		System.out.println("division :"+(a/b));
		System.out.println("mod :"+(a%b));
		s.close();
		

	}

}
