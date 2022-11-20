package com.capgemini.demo;

import java.util.Scanner;

public class RelationalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a and b :");
		int a=s.nextInt();
		int b=s.nextInt();
		//boolean result=a>b;
		boolean result=(a==b);
		System.out.println("The res:"+result);
		s.close();
	}

}
