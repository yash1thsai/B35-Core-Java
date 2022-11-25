package com.cg.bufferreaderdemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//Demo on bufferedReader class

public class BufferReaderDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader b=new BufferedReader(new
				InputStreamReader(System.in));
		String name=b.readLine();
		System.out.println(name);

	}

}
