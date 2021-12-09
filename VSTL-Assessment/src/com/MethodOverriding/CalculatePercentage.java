package com.MethodOverriding;

public class CalculatePercentage {

	public void getPercentage(String strName, double intMarksObtained, double intTotalMarks) {

		double dblNumber = 100;
		double dblPercentage = intMarksObtained / intTotalMarks * dblNumber;

		System.out.print(strName + "'s Result - ");
		System.out.println(dblPercentage + " %");

	}

}
