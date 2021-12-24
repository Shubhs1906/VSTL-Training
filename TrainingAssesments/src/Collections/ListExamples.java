package Collections;

import java.util.ArrayList;

public class ListExamples {

	public ArrayList<String> carDetailsList() {

		// Created ArrayList

		ArrayList<String> Hyundai = new ArrayList<String>();
		Hyundai.add("Suv");
		Hyundai.add("Creta");
		Hyundai.add("SX(O)");
		Hyundai.add("CRDI");
		Hyundai.add("Phantom Black");
		

		// Printing ArrayList
		System.out.println("ArrayList");
		System.out.println("");
		System.out.println(Hyundai);
		 System.out.println("****************************************");
		
		// Removing elements in Arraylist
		Hyundai.remove("Phantom Black");
		
		    // Printing Now
		System.out.println("Removing elements");
		    System.out.println(Hyundai);
		    System.out.println("****************************************");
		    
		//Adding elements in Arraylist
		Hyundai.add("Polar White");
		
		     // Printing Now
		System.out.println("Adding elements");
		     System.out.println(Hyundai);
			    System.out.println("****************************************");

		// Adding element in Arraylist using index
		Hyundai.add(4, "AT");

		    // Printing Now
		System.out.println("Adding element using index");
		    System.out.println(Hyundai);
		    System.out.println("****************************************");

		
		// Removing element in Arraylist using index
		Hyundai.remove(0);

		    // Printing Now
		System.out.println("Removing element using index");
		    System.out.println(Hyundai);
		    System.out.println("****************************************");

		// Changing element in Arraylist using index
		Hyundai.set(0, "Venue");
		
		    // Printing Now
		System.out.println("Changing element using index");
	        System.out.println(Hyundai);
		    System.out.println("****************************************");
		    
		    
		// Duplicate elements are allowed in ArrayList
		    Hyundai.add("Phantom Black");   
		 
		 // Printing Now
		    System.out.println("Duplicate elements allowed");
	        System.out.println(Hyundai);
		    System.out.println("****************************************");
		    
		    System.out.println("");
		    System.out.println("");
		    System.out.println("");
			return Hyundai;
		    
			
			
	}

}
