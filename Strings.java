package com.qa.helloworld;

public class Strings {
	public static void main(String [] args) {
		String str1 = "yesterday it was raining";
		String str2 = "today it is sunny";
		
		System.out.println(str2.toUpperCase() + ", " + str1.toUpperCase());
		System.out.println(str2.substring(0,12) + str1.substring(17,24));
		
	}
}
