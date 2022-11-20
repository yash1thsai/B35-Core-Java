package com.capgemini.demo;

import java.util.Scanner;

public class TernaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a and b :");
		int a=s.nextInt();
		int b=s.nextInt();
		int result=(a>b)?a:b;
		System.out.println("result is :"+result);
		s.close();

	}

}
