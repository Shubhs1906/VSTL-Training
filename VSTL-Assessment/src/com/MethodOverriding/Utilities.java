package com.MethodOverriding;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Utilities {

	public int getRandomMarksUT() {

		int intMarks;

		intMarks = ThreadLocalRandom.current().nextInt(7, 10);
		return intMarks;
	}

	public String getRandomNameUT() {

		String[] strValues = { "Shubham", "Sachin", "Mahesh", "Preeti", "Divya" };
		Random Name = new Random();
		int intRandomName = Name.nextInt(strValues.length);

		String strRandomName = strValues[intRandomName];

		return strRandomName;
	}

	public int getRandomMarksFE() {

		int intMarks;

		intMarks = ThreadLocalRandom.current().nextInt(70, 100);
		return intMarks;
	}

	public String getRandomNameFE() {

		String[] strValues = { "Divya", "Preeti", "Mahesh", "Sachin", "Shubham" };
		Random Name = new Random();
		int intRandomName = Name.nextInt(strValues.length);

		String strRandomName = strValues[intRandomName];

		return strRandomName;
	}

}
