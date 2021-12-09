package com.MethodOverriding;

public class TestCalculation {

	public static void main(String[] args) {

		Utilities objUtilities = new Utilities();

		String strNameUT = objUtilities.getRandomNameUT();
		String strNameFE = objUtilities.getRandomNameFE();
		int intMarksUT = objUtilities.getRandomMarksUT();
		int intMarksFE = objUtilities.getRandomMarksFE();

		System.out.println("Unit Test");
		UnitTest objUnitTest = new UnitTest();
		objUnitTest.getPercentage(strNameUT, intMarksUT, 10);

		System.out.println("********");
		System.out.println("Final Exam");

		FinalExam objFinalExam = new FinalExam();
		objFinalExam.getPercentage(strNameFE, intMarksFE, 100);

	}

}
