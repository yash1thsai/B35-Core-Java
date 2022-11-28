package com.cg.instanceofdemo;

abstract class Animal
{
	abstract void accept();
}

class Lion extends Animal
{

	@Override
	void accept() {
		// TODO Auto-generated method stub
		System.out.println("Lion Roars");
		
	}
	
}
public class InstanceOfDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lion l=new Lion();
		l.accept();
		System.out.println(l instanceof Lion);
		System.out.println(l instanceof Animal);

	}

}
