package com.h2k.one;

import java.util.Comparator;

public class WithoutLambda {

	public static void main(String[] args) {
		// Lets create a simple example of Anonymous Inner Class
		Comparator<String> stringCompare = new Comparator<String>() {
			
			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		};
		
		int result = stringCompare.compare("hello", "h2kStudents");
		System.out.println("Wihout Lambda :: " + result);

	}

}
