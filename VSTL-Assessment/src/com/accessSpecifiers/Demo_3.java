package com.accessSpecifiers;

import com.accessModifiers.Demo;

public class Demo_3 {

	Demo objDemo = new Demo();

	public void demo3M_1() {
		
		// objDemo.demoM_1();
		System.out.println("Get data from Demo class( other Pkg ) :" + objDemo.strAccessSpec);

	}

	public static void main(String[] args) {

		//Demo_3 objDemo = new Demo_3();
		//objDemo.demo3M_1();
		
		Demo objDemo = new Demo();
		//System.out.println(objDemo.strAccessSpec_2);

	}

}