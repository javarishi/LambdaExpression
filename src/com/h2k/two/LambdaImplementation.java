package com.h2k.two;

public class LambdaImplementation {

	// Lambda expressions can be used with Interfaces having single abstract methods
	public static void main(String[] args) {
		// InterfaceReference objRef = (arguments) -> {implementation};
		
		InterfaceOne one = () -> { System.out.println("InterfaceOne :: Paranthesis is needed for No Arguments"); };
		
		InterfaceTwo two = paramOne -> {System.out.println("Single Parameter dont need a Paranthesis " + paramOne);};
		
		InterfaceThree three = (paramOne, paramTwo) -> 
						{ 
							String result = paramOne + " " + paramTwo;
							System.out.println("More than one param again need a Paranthesis "  + result);
							return result;
						};
								
						
		one.simpleMethod();
		two.simpleMethod("First");
		three.simpleMethod("First", "and Second");
	}

}
