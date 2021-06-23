package com.qa.helloworld;

public class Results {
	public static double cap = 60;
	public static void main(String[] args) {
		System.out.println("Physics mark = 89");
		System.out.println("Chemistry mark = 109");
		System.out.println("Biology mark = 139");
		System.out.println("Total mark: ");
		System.out.println(total(89, 109, 139));
		System.out.println("Overall percentage: ");
		System.out.println(percentage(450, 337));
	}

	public static int total(int phys, int chem, int bio) {
		return(phys + chem + bio);
	}
	
	public static String percentage(double max, double mark) {
		double percentage = ((mark * 100) / max);
		
	
	if (percentage >= cap) {
		System.out.println(percentage);
		return "PASS";
	} else {
		return "FAIL";
	}
}
}