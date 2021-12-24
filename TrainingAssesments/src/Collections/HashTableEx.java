package Collections;

import java.util.Hashtable;

public class HashTableEx {

	public Hashtable<String, String> objCreta;
	public Hashtable<String, String> objVerna;
	public Hashtable<String, String> objVenue;

	public HashTableEx() {

		objCreta = new Hashtable<String, String>();
		objVerna = new Hashtable<String, String>();
		objVenue = new Hashtable<String, String>();

	}

	public Hashtable<String, String> CretaDetails() {

		objCreta.put("BodyType", "Suv");
		objCreta.put("Model", "Creta");
		objCreta.put("Varient", "SX(O)");
		objCreta.put("FuelType", "CRDI");
		objCreta.put("Colour", "Phantom Black");

		return objCreta;
	}

	public Hashtable<String, String> VernaDetails() {

		objVerna.put("BodyType", "Sedan");
		objVerna.put("Model", "Verna");
		objVerna.put("Varient", "SX(O)");
		objVerna.put("FuelType", "CRDI");
		objVerna.put("Colour", "Black");

		return objVerna;
	}

	public Hashtable<String, String> VenueDetails() {

		objVenue.put("BodyType", "Compact Suv");
		objVenue.put("Model", "Venue");
		objVenue.put("Varient", "SX(O)");
		objVenue.put("FuelType", "CRDI");
		objVenue.put("Colour", "Polar White");

		return objVenue;
	}
}
