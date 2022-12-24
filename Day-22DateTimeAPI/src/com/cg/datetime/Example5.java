package com.cg.datetime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Example5 {

	public static void main(String[] args) {

		LocalDateTime l=LocalDateTime.now();
		
		DateTimeFormatter df=DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm");
		String x=l.format(df);
		
		System.out.println(x);

	}

}
