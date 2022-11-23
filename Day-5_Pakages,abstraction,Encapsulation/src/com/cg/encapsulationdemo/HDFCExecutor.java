package com.cg.encapsulationdemo;

import com.cg.accessspecifiersdemo.PublicDemo;

public class HDFCExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//setters method - to set a value
		HDFC h=new HDFC();
		h.setAmount(665224);
		//getters - to return a value
		System.out.println("Te Amount is :"+h.getAmount());
		
		//if any data-mem is ddeclared as public we can access anywhere
		PublicDemo p=new PublicDemo();
		p.print(56223.00);
		
	}

}
