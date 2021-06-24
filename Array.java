package com.qa.helloworld;

public class Array {
	
	public static int [] tenArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
	
	public static void main(String[] args) {
		for (int i : tenArray) {
			System.out.println("Number: " + i);
		}
		
		int [] tenArray = new int[10];
		tenArray[0] = 10;
		for (int i = 0; i < tenArray.length; i++) {
			System.out.println(tenArray[i] = 10*i);
		}
	}

}

