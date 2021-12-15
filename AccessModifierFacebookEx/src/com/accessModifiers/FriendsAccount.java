package com.accessModifiers;

public class FriendsAccount {

	public static void main(String[] args) {
		YourAccount objYourAccount = new YourAccount();
		
		// Within Package
		
		System.out.println("Within Package");
		
		objYourAccount.posts_1();
		objYourAccount.posts_2();
		objYourAccount.posts_3();

	}

}
