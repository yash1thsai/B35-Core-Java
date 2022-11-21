package com.capgemini.looping;

import java.util.Scanner;

public class DoWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the value of x :");
		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		
		do
		{
			System.out.println(" Value of X :"+x);
			x++;
		}while(x<=100); 
		
		 

	}

}
