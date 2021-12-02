package Assessment;

public class OpenFacebook {
	public void ExampleOfMethods() {

		// Give input below -

		String strCompanyName_1 = "www.Facebook.com ";

		// System

		String strCompanyName_2 = "www.Facebook.com";
		String strCompanyName_3 = strCompanyName_1.trim();

		// use of equals

		if (strCompanyName_1.equals(strCompanyName_2))
			System.out.println("Welcome to FACEBOOK");

		// use of trim & ignorecase

		else if (strCompanyName_3.equalsIgnoreCase(strCompanyName_2))
			System.out.println("Welcome to FACEBOOK");

		else {
			System.out.println("Invalid URL");
			System.out.println("Please enter a valid URL");
		}
		
		//
	}

}
