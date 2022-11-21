package com.capgemini.decisionmaking;

import java.util.Scanner;

public class Example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		switch(a)
		{
		case 1:
			System.out.println("Alpha");
			break;
		case 2:
			System.out.println("Beta");
			break;
		case 3:
			System.out.println("gamma");	
			break;
		default:
			System.out.println("Invalid Input");
		}

	}

}
