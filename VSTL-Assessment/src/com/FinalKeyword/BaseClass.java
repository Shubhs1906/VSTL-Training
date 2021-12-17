package com.FinalKeyword;

public class BaseClass {
	
	final int intTotalMarks = 100;
	
	 public void calculatePercentage(int intRecievedMarks){
		
		int intPercentage = intRecievedMarks*100/intTotalMarks;
		System.out.println("Result"+intPercentage+"%");
	}

}
