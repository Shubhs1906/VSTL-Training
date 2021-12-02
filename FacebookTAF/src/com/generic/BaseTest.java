package com.generic;

public class BaseTest {

	public void itializeWebEnvironment(String strURL) {
		System.out.println("Open URL : " + strURL);

	}

	public void tearDown() {
		System.out.println("Close Browser");
	}

}
