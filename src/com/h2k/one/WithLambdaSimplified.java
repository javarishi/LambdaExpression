package com.h2k.one;

import java.util.Comparator;

public class WithLambdaSimplified {

	public static void main(String[] args) {
		// 4. No need to specify types of parameters
		// 5. No block needed for single line statement
		// 6. No return statement needed
		
		Comparator<String> stringCompare =  
				(o1, o2) ->  o1.compareTo(o2);
			
		int result = stringCompare.compare("hello", "h2kStudents");
		System.out.println("WithLambda Simplified  :: " + result);

	}

}
