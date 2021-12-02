package com.pageFactory;

public class SignUpPage {

	public void enterFirstName(String strFirstName) {
		System.out.print("Name: " + strFirstName);

	}

	public void enterSurname(String strSurname) {
		System.out.println(" " + strSurname);

	}

	public void enterMobileNumber(String strMobileNumber) {

		if (strMobileNumber.length() == 10)
			System.out.println("Mobile Number: " + strMobileNumber);

	}

	public void EmailAddress(String strEmailAddress) {

		// if (strMobileNumber.length() == 10)
		// System.out.println(strMobileNumber);

		if (strEmailAddress.endsWith("@gmail.com") == true)
			System.out.println("EmailAddress: " + strEmailAddress);
		else if (strEmailAddress.endsWith("@yahoo.com") == true)
			System.out.println("EmailAddress: " + strEmailAddress);
		else if (strEmailAddress.endsWith("@vervesquare.com") == true)
			System.out.println("EmailAddress: " + strEmailAddress);
		else
			System.out.println("Enter valid Email Id");

	}

	public void SetNewPassword(String strNewPassword) {

		if (strNewPassword.length() >= 6)
			System.out.println("Password: " + strNewPassword);
		else if (strNewPassword.length() < 6)
			System.out.println(
					"Enter a combination of at least six numbers, letters and punctuation marks (such as ! and &).");
		else
			System.out.println(
					"Enter a combination of at least six numbers, letters and punctuation marks (such as ! and &).");

	}

	public void enterBirthDate(int intBirthDate) {

		if (intBirthDate > 0 && intBirthDate < 31)
			System.out.print("Date of Birth: " + intBirthDate);
		else
			System.out.println(" Please make sure that you use your real date of birth .");

	}

	public void enterBirthMonth(String strBirthMonth) {

		String strMonths[] = { "jan", "feb", "mar", "apr", "may", "jun", "jul", "aug", "sep", "oct", "nov", "dec" };

		for (String element : strMonths) {
			if (element.equalsIgnoreCase(strBirthMonth))
				System.out.print(" " + strBirthMonth);

		}

	}

	public void enterBirthYear(int intBirthYear) {
		if (intBirthYear > 1905 && intBirthYear <= 2021)
			System.out.println(" " + intBirthYear);
		else
			System.out.println(" Please make sure that you use your real date of birth .");

	}

	public void selectGender(String strGender) {
		String strAllGender[] = { "custom", "female", "male" };

		for (String element : strAllGender) {
			if (element.equalsIgnoreCase(strGender))
				System.out.println("Gender: " + strGender);
		}

	}

}
