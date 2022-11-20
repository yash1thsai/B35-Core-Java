package com.capgemini.demo;

import java.util.Scanner;

public class LogicalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter age and weight :");
		int age=s.nextInt();
		int weight=s.nextInt();
		boolean result=(age>18) && (weight>50);// '||'=or , '!'=not
		System.out.println("The result is :"+result);

	}

}
