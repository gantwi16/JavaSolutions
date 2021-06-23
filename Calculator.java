package com.qa.helloworld;

public class Calculator {
	public static void main(String[] args) {
		System.out.println(add(1, 2));
		System.out.println(multiplication(3, 4));
		System.out.println(sub(6, 5));
		System.out.println(division(8, 2));
	}

	public static int add(int num1, int num2) {
		return num1 + num2;
	}
	
	public static int multiplication(int num3, int num4) {
		return num3 * num4;
	}
	
	public static int sub(int num5, int num6) {
		return num5 - num6;
	}
	
	public static int division(int num7, int num8) {
		if (num7 < num8) {
            System.out.println("First parameter is smaller than second parameter");
        } else {
            System.out.println("Division cannot be performed");
        }
		return num7 / num8;
	}
}
