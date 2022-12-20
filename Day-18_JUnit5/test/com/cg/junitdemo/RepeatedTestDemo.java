package com.cg.junitdemo;

import org.junit.jupiter.api.RepeatedTest;

class RepeatedTestDemo {

	@RepeatedTest(3)
	void test() {
		
		System.out.println("Welcome Dear Students");
		
	}

}
