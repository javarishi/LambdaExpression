package com.h2k.three;

public interface StaticAndDefault {

	// this method can be used in Lambda expression
	public void useLambdaHere(String message);
	
	// Default is new keyword which can be added to give default implementation to interface method
	default public String saySomething(String name) {
		String something = "Hello " + name;
		return something;
	}
	
	// Interface can have static methods as well
	static void staticExample(String takeParam) {
		System.out.println("This method just needs Interface Reference - no instance");
	}
}
