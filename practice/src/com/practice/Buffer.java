package com.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Buffer {
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		 try {
	            System.out.print("Enter your name: ");
	            String name = reader.readLine();
	            System.out.println(name);
		 }
	        catch (IOException e) {
	            e.printStackTrace();
        } 
}
}
