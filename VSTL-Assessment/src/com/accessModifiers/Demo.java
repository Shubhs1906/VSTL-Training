package com.accessModifiers;

public class Demo {
	
	public String strAccessSpec = "Public";
	
	
	 String strAccessSpec_2 = "Private";
	
	
	public void demoM_1 () {
		
		System.out.println("Test");
		
	}
	
	public static void main(String[] args) {
		
		
		Demo objDemo = new Demo();
		System.out.println(objDemo.strAccessSpec_2);
	}

}
