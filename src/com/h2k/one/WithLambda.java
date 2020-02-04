package com.h2k.one;

import java.util.Comparator;

public class WithLambda {
	//  1. Single Method Interface implementation
	// 2. method name not needed
	// -> is symbol for lambda expression
	public static void main(String[] args) {
		
		Comparator<String> stringCompare =  
				(String o1, String o2) -> {
					System.out.println("Lambda Block");
					return o1.compareTo(o2);
				};
				
		int result = stringCompare.compare("hello", "h2kStudents");
		System.out.println("With Lambda :: " + result);

	}

}
