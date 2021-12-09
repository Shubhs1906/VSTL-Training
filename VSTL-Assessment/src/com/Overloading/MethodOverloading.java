package com.Overloading;

public class MethodOverloading {

	public void doCalculation() {

		System.out.println("Calculation ");


	}


	public void doCalculation(int intNumberA, int intNumberB, int intNumberC) {

		System.out.println("Addition of Numbers - ");

		System.out.println("Number A : " + intNumberA);

		System.out.println("Number B : " + intNumberB);

		System.out.println("Number C : " + intNumberC);

		System.out.println("Addition is : " + (intNumberA + intNumberB + intNumberC));

	}

	public void doCalculation(int intNumberA, int intNumberB) {

		System.out.println("Substraction of Numbers - ");

		System.out.println("Number A : " + intNumberA);

		System.out.println("Number B : " + intNumberB);

		System.out.println("Substraction is : " + (intNumberA - intNumberB));

	}

	public void doCalculation(String strEmailId, int intNumber, String strMail) {
		
		System.out.println("Mail Id");

		System.out.println("Your Mail Id is - " + (strEmailId + intNumber + strMail));

	}

}
