package org.capgemini.datatypes;

import java.util.Scanner;

//Demo On User Input Integer
public class IntegerUserInputDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a Number :");
		int x=s.nextInt();
		System.out.println("Enter a Number :");
		float y=s.nextFloat();
		System.out.println("Enter a char :");
		char c=s.next().charAt(0);
		System.out.println("Enter a String :");
		//String str=sc.next();
		String str=s.nextLine();
		System.out.println("The Integer is :"+x);
		System.out.println("The float is :"+y);
		System.out.println("The Char is :"+c);
		System.out.println("The String is :"+str);
		s.close();

	}

}
