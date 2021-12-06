package com.generic;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Utilities {

	public String getFirstName(int length) {

		String getName = "QWERTYUIOPASDFGHJKLZXCVBNMqwertyuiopasdfghjklzxcvbnm";
		String randomString = "";
		for (int index = 0; index < length; index++) {
			int rnum = (int) Math.floor((Math.random() * getName.length()));
			randomString += getName.substring(rnum, rnum + 1);
		}
		return randomString;

	}

	public String getSurname(int length) {
		String getSurname = "QWERTYUIOPASDFGHJKLZXCVBNMqwertyuiopasdfghjklzxcvbnm";
		String randomString = "";
		for (int index = 0; index < length; index++) {
			int rnum = (int) Math.floor((Math.random() * getSurname.length()));
			randomString += getSurname.substring(rnum, rnum + 1);
		}
		return randomString;

	}

	public String getMobileNumber(int length) {
		String getNumber = "123456789";
		String randomString = "";
		for (int index = 0; index < length; index++) {
			int rnum = (int) Math.floor((Math.random() * getNumber.length()));
			randomString += getNumber.substring(rnum, rnum + 1);
		}
		//
		String[] strValues = { "95", "97", "99" };
		Random startNumber = new Random();
		int randomNumber = startNumber.nextInt(strValues.length);
		String strStartNum;
		strStartNum = strValues[randomNumber];
		//

		String getMobileNumber = strStartNum + randomString;
		return getMobileNumber;

	}

	public String getEmailAddress(int length) {
		String getEmail = "qwertyuiopasdfghjkkkklzxcvbnm";
		String randomStringValue = "";
		for (int index = 0; index < length; index++) {
			int rnum = (int) Math.floor((Math.random() * getEmail.length()));
			randomStringValue += getEmail.substring(rnum, rnum + 1);
		}

		//
		String[] strValues = { "@vervesquare.com", "@yahoo.com", "@gmail.com" };
		Random MailId = new Random();
		int randomId = MailId.nextInt(strValues.length);
		String strId;
		String strRandomId = strValues[randomId];
		//

		String getEmailAddress = randomStringValue + strRandomId;
		return getEmailAddress;

	}

	public String getNewPassword(int length) {
		String getNewPassword = "QWERTYUIOPASDFGHJKLZXCVBNMqwertyuiopasdfghjklzxcvbnm";
		String randomString = "";
		for (int index = 0; index < length; index++) {
			int rnum = (int) Math.floor((Math.random() * getNewPassword.length()));
			randomString += getNewPassword.substring(rnum, rnum + 1);
		}
		//
		String[] strValues = { "@", "!", "&" };
		Random passwordChar = new Random();
		int randomId = passwordChar.nextInt(strValues.length);
		String strId;
		String strRandomChar = strValues[randomId];
		//
		String getRandomNum = "7894561230";
		String getRandomN = "";
		for (int index = 0; index < length; index++) {
			int rnum = (int) Math.floor((Math.random() * getRandomNum.length()));
			randomString += getRandomNum.substring(rnum, rnum + 1);
		}
		//

		String getRandomPass = randomString + strRandomChar + getRandomN;

		return getRandomPass;

	}

	public int getBirthDate(int getBirthDate) {

		getBirthDate = ThreadLocalRandom.current().nextInt(1, 31);
		return getBirthDate;

	}

	public String GetBirthMonth(String strGetBirthMonth) {

		String[] strValues = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
		Random monthValue = new Random();
		int randomMonth = monthValue.nextInt(strValues.length);

		strGetBirthMonth = strValues[randomMonth];
		return strGetBirthMonth;

	}

	public int getBirthYear(int getBirthYear) {

		getBirthYear = ThreadLocalRandom.current().nextInt(1905, 2021);
		return getBirthYear;
	}

	public String getGender(String strGetGender) {

		String[] strValues = { "Male", "Female", "Custom" };
		Random genderValue = new Random();
		int randomGender = genderValue.nextInt(strValues.length);

		strGetGender = strValues[randomGender];
		return strGetGender;

	}

	/*
	 * public String getRandomStrings(int length) { String strValue =
	 * "QWERTYUIOPASDFGHJKLZXCVBNMqwertyuiopasdfghjklzxcvbnm"; String
	 * randomString = ""; for (int index = 0; index < length; index++) { int
	 * rnum = (int) Math.floor((Math.random() * strValue.length()));
	 * randomString += strValue.substring(rnum, rnum + 1); } return
	 * randomString; }
	 */

}
