package com.accessModifiers;

public class YourAccount {
	
	
	
	
	private void posts () {                           // Private method
		
		System.out.println(" Private Pictures ");
		System.out.println(" Private Videos ");
	}
	
   
	
	void posts_1 () {                                 // Default method
		
		
		System.out.println(" Default Pictures ");
		System.out.println(" Default Videos ");
		
	}
	
	
	
	protected void posts_2 () {                       //  Protected method
		
		System.out.println(" Protected Pictures ");
		System.out.println(" Protected Videos ");
	}
	
	
	
	
	public void posts_3 () {                          // Public method
		
		System.out.println(" Public Pictures ");
		System.out.println(" Public Videos ");
	}
	
	
	public static void main(String[] args) {
		YourAccount objYourAccount = new YourAccount();
		
		// Within class
		
		System.out.println("Within class");
		
		objYourAccount.posts();
		objYourAccount.posts_1();
		objYourAccount.posts_2();
		objYourAccount.posts_3();

		

	}

}
