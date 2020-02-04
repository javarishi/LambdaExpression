package com.h2k.fourth;

public class LamdaTest {
	
	static String staticVaraible = "Static Variable";
	private String instanceVaraible = "Instance Variable";

	public static void main(String[] args) {
		
		final String localVaraible = "Local Variable";
		
		TestVariables localVarAccess = message -> { System.out.println(message + localVaraible);};
		// try changing value of localVaraible
		// localVaraible = "New Value"; 
		// localVaraible needs effectively final
		localVarAccess.testMethod("Hello World");
		
		TestVariables staticVarAccess = message -> {System.out.println(message + staticVaraible);};
		
		// Change staticVaraible 
		staticVaraible = "New Static Variable Value";
		staticVarAccess.testMethod("Hello World");
	}
	
	public void checkInstanceVar() {
		
		TestVariables instanceVarAccess= message -> { System.out.println(message + instanceVaraible);};
		// Change staticVaraible 
		instanceVaraible = "New Instance Variable Value";
		instanceVarAccess.testMethod("Hello World");
		
	}

}
