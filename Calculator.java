package com.qa.helloworld;

public class Calculator {
	public static void main(String[] args) {
		System.out.println(add(1, 2));
		System.out.println(multiplication(3, 4));
		System.out.println(subtraction(6, 5));
		System.out.println(division(8, 16));
	}

	public static int add(int num1, int num2) {
		return num1 + num2;
	}
	
	public static int multiplication(int num3, int num4) {
		return num3 * num4;
	}
	
	public static int subtraction(int num5, int num6) {
		return num5 - num6;
	}
	
	public static String division(double num7, double num8) {
		String result;
		if (num7 < num8) {
			result = "" + num7 / num8;
			return result;
        } else {
            result = ("Division cannot be performed");
            return result;
        }
	}
}
