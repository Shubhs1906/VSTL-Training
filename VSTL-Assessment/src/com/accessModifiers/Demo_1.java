package com.accessModifiers;

public class Demo_1 {

	Demo objDemo = new Demo();

	public void demo1M_1() {

		objDemo.strAccessSpec = "ABC";
		objDemo.demoM_1();
		System.out.println("Demo1");
	}

	public static void main(String[] args) {
		
		Demo objDemo = new Demo();
		System.out.println(objDemo.strAccessSpec_2);
		
		
	}

}
