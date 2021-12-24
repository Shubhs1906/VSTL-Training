package Collections;

import java.util.Hashtable;

public class TestHashTableEx {

	public static void main(String[] args) {

		HashTableEx objHashTableEx = new HashTableEx();
		Hashtable<String, String> objGetCreta;
		Hashtable<String, String> objGetVerna;
		Hashtable<String, String> objGetVenue;

		objGetCreta = objHashTableEx.CretaDetails();
		objGetVerna = objHashTableEx.VernaDetails();
		objGetVenue = objHashTableEx.VenueDetails();

		System.out.println("");

		System.out.println(objGetCreta.get("BodyType"));
		System.out.println(objGetCreta.get("Model"));
		System.out.println(objGetCreta.get("Varient"));
		System.out.println(objGetCreta.get("FuelType"));
		System.out.println(objGetCreta.get("Colour"));

		System.out.println("");

		System.out.println(objGetVerna.get("BodyType"));
		System.out.println(objGetVerna.get("Model"));
		System.out.println(objGetVerna.get("Varient"));
		System.out.println(objGetVerna.get("FuelType"));
		System.out.println(objGetVerna.get("Colour"));

		System.out.println("");

		System.out.println(objGetVenue.get("BodyType"));
		System.out.println(objGetVenue.get("Model"));
		System.out.println(objGetVenue.get("Varient"));
		System.out.println(objGetVenue.get("FuelType"));
		System.out.println(objGetVenue.get("Colour"));
	}

}
