package com.qa.helloworld;

public class StringEx2 {
	public static void main(String[] args) {
		method1("this is a string");
		method2("today is Friday");
		method3("it is raining tomorrow");
	}

	private static void method1(String string) {
		// TODO Auto-generated method stub
		int wordcount = 1;
		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) == ' ') {
				wordcount ++;
			}
		}
		System.out.println(wordcount);
	}
	
	public static void method2(String string) {
		int z = 0;
		for (int i = 1; i < string.length(); i++) {
			if (string.substring(z, i).contains(" ")) {
				System.out.println(string.substring(z, i));
				z = i;
			}
		}
		System.out.println(string.substring(z));
	}
	
	public static void method3(String string) {
		int z = 0;
		for (int i = 1; i < string.length(); i++) {
			if (string.substring(z, i).contains(" ")) {
				System.out.println(string.substring(z, i));
				z = i;
			}
		}
		System.out.println(string.substring(z -1));
	}
}
