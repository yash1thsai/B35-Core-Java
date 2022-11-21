package com.capgemini.decisionmaking;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=7,b=9,c=11;
		if(a>b && a>c)
		{
			System.out.println(a);
		}
		else
		{
			if(b>a && b>c)
			{
				System.out.println(b);
			}
			else
			{
				System.out.println(c);
			}
		}
		
	}

}
