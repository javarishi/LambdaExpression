package com.h2k.three;

public class LamdaTest {

	public static void main(String[] args) {
		
		StaticAndDefault testInterface = message -> {System.out.println("Only Abstract method matters  " + message);};
		testInterface.useLambdaHere("Yes ! Right!");

	}

}
