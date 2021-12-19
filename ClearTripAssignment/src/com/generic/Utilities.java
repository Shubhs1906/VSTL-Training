package com.generic;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Utilities {

	public String GetRandomCitiesFrom() {

		String[] strCities = { "Pune", "Mumbai", "Nashik", "Nagpur" };
		
		Random cities = new Random();
		int intrandomCities = cities.nextInt(strCities.length);
		String strGetCities = strCities[intrandomCities];
		
		return strGetCities;

	}

	public String GetRandomCitiesTo() {

		String[] strCities = { "Bangalore", "Mangalore", "Belgaum", "Mysore" };
		Random cities = new Random();
		int intrandomCities = cities.nextInt(strCities.length);

		String strGetCities = strCities[intrandomCities];
		return strGetCities;

	}

	public String getRandomNoOfAdults() {

		int intgetRandomNoOfAdults = ThreadLocalRandom.current().nextInt(1, 10);
		String strNoOfAdults = new Integer(intgetRandomNoOfAdults).toString();

		return strNoOfAdults;

	}

	public String getRandomNoOfChildren() {

		int intgetRandomNoOfChildren = ThreadLocalRandom.current().nextInt(0, 9);
		String strNoOfChildren = new Integer(intgetRandomNoOfChildren).toString();

		return strNoOfChildren;

	}

	public String getRandomNoOfInfants() {

		int intgetRandomNoOfInfants = ThreadLocalRandom.current().nextInt(0, 2);
		String strNoOfInfants = new Integer(intgetRandomNoOfInfants).toString();

		return strNoOfInfants;

	}

}
