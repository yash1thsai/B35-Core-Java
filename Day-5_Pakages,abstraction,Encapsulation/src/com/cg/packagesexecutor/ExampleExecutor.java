package com.cg.packagesexecutor;

import java.util.Scanner;

//importing the class of another package
import com.cg.packagesdemo.Example; //import pkg-name+class-name

public class ExampleExecutor {
	
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the card no :");
		String card_no=s.nextLine();
		Example obj=new Example();
		obj.display(card_no);
		s.close();
	}

}
