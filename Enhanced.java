package com.qa.helloworld;

public class Enhanced {
	public static void main(String[] args) {
		String [] strings = {"I", "am", "hungry."};
		for (String word : strings ) {
			System.out.println(word);
		}
		
		int [] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8 ,9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
		for (int i : numbers) {
			System.out.println(i * i);
		}
		
		for (int i : numbers) {
            if (oddoreven(i)) {
                System.out.println("Even: " + i * i);
            } else {
                System.out.println("Odd: " + i * i * i);
            }
        }
	}
    public static boolean oddoreven(int num) {
        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }


}