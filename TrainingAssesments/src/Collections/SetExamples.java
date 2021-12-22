package Collections;

import java.util.HashSet;

public class SetExamples {

	public void carDetailsSet() {
		
		// Created HashSet
		HashSet<String> Hyundai = new HashSet<String>();

		// Adding elements to the HashSet
		Hyundai.add("Suv");
		Hyundai.add("Creta");
		Hyundai.add("SX(O)");
		Hyundai.add("CRDI");
		Hyundai.add("Phantom Black");
		
		// Printing HashSet
				System.out.println("HashSet");
				System.out.println("");
				System.out.println(Hyundai);
				 System.out.println("****************************************");
		
		
		
		// Addition of duplicate elements not allowed in HashSet
		Hyundai.add("Creta");
		
		// Printing Now
	    System.out.println("Duplicate elements not allowed");
        System.out.println(Hyundai);
	    System.out.println("****************************************");
	}
}
