package com.qa.helloworld;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//import java.util.collections;

public class ArrayLists {
	public static void main(String[] args) {
		List<String> schools = new ArrayList<>();
		
		schools.add("maths");
		schools.add("biology");
		schools.add("psychology");
		schools.add("PE");
		schools.add("music");
		schools.add("art");
		
		System.out.println(schools);
		
		for (String subject : schools) {
			System.out.println(subject);
		}
		
		System.out.println(schools.get(0));
		
		schools.set(5, "drama");
		System.out.println(schools);
		
		schools.remove(3);
		System.out.println(schools);
		
		Collections.sort(schools);
		for (String subjects : schools) {
            System.out.println(subjects);
        }
		
		Collections.reverse(schools);
	    System.out.println("Reversed subjects: " + schools);
	    
	    Collections.swap(schools, 2, 4);
		System.out.println("Swapping subjects: " + schools);
		
//		Collections.clone(schools, 1, schools, 0);
//		System.out.println("Cloning subjects: " + schools);
	}

}
