package com.capgemini.decisionmaking;

public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age =15, weight =55;
		
		if(age>=15)
		{
			if(weight>=40 && weight<=110)
			{
				System.out.println("Eligible for Bunjee Jumping");
			}
			else
			{
				System.out.println("Extra ropes will be added");
			}
		}
		else
		{
			System.out.println("Not Eligible for Bunjee Jumping");
		}

	}

}
