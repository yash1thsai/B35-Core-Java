package com.capgemini.demo;

import java.util.Scanner;

public class BitwiseOperatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a and b :");
		int a=s.nextInt();//5
		int b=s.nextInt();//2
		System.out.println(a&b);
		System.out.println(a|b);
		System.out.println(a^b);
		System.out.println(a&b);
		System.out.println(8>>1);
		System.out.println(8<<1);

	}

}
