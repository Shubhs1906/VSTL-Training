package com.accessSpecifiers;

import com.accessModifiers.YourAccount;

public class OtherAccountUser extends YourAccount {

	public static void main(String[] args) {
		YourAccount objYourAccount = new YourAccount();
		OtherAccountUser objOtherAccountUser = new OtherAccountUser();
		
		// Outside Package by subclass only
		
		System.out.println("Outside Package by subclass only");
		
		objYourAccount.posts_3();
		objOtherAccountUser.posts_2();
		
		
		
		// Outside Package
		
		System.out.println("Outside Package");
		
		objYourAccount.posts_3();
		

	}

}
