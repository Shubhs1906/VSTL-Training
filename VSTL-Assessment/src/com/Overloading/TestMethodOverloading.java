package com.Overloading;

public class TestMethodOverloading {

	public static void main(String[] args) {
		
		MethodOverloading objMethodOverloading = new MethodOverloading();
		objMethodOverloading.doCalculation();
		System.out.println("********");
		objMethodOverloading.doCalculation(25, 54, 32);
		System.out.println("********");
		objMethodOverloading.doCalculation(24, 16);
		System.out.println("********");
		objMethodOverloading.doCalculation("Abcd", 1234, "@gmail.com");
		System.out.println("********");


	}

}
