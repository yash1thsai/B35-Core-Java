package com.cg.streamapidemo;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class BasicStreamDemo {

	public static void main(String[] args) {
		Stream<String>obj=Stream.of("Shweta","Diya","Rupali");
		obj.forEach((i)->System.out.print(i+ " "));
		
		System.out.println(); 

		List<Integer>obj1=Arrays.asList(new Integer[]{22,45,6});
		obj1.forEach((i)->System.out.print(i+ " "));
		
		System.out.println();

		Set<String>obj2=new HashSet<>();
		obj2.add("Nia");
		obj2.add("riya");
		obj2.add("Sia");
		System.out.println(obj2);
		obj2.forEach((i)->System.out.print(i+ " "));

		/*for(String str:obj2)
		{
			System.out.println(str);

		}*/

	}

}
