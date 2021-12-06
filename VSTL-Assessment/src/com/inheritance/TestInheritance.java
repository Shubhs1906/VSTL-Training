package com.inheritance;

public class TestInheritance extends Inheritance {

	public void verifyCalculationIsCorrect() {
		System.out.println("");
		System.out.println("Correct");
	}

	public void verifyCalculation() {

		this.doAddition(5, 6);

		this.doSubstraction(4, 5);

		this.doDivision(16, 2);

		this.doMultiplication(198, 46);

		this.verifyCalculationIsCorrect();

	}

	public static void main(String[] args) {

		TestInheritance objTestInheritance = new TestInheritance();
		objTestInheritance.verifyCalculation();

	}

}
