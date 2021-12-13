package com.abstraction.abstractClass;

public class TestCarDetails {

	public static void main(String[] args) {

		GetCarDetails objGetCarDetails_1 = new Car_1();
		GetCarDetails objGetCarDetails_2 = new Car_2();
		GetCarDetails objGetCarDetails_3 = new Car_3();


		objGetCarDetails_1.brand();
		objGetCarDetails_1.segment();
		objGetCarDetails_1.model();
		objGetCarDetails_1.varient();
		objGetCarDetails_1.colour();
		System.out.println("********");
		
		objGetCarDetails_2.brand();
		objGetCarDetails_2.segment();
		objGetCarDetails_2.model();
		objGetCarDetails_2.varient();
		objGetCarDetails_2.colour();
		System.out.println("********");
		
		objGetCarDetails_3.brand();
		objGetCarDetails_3.segment();
		objGetCarDetails_3.model();
		objGetCarDetails_3.varient();
		objGetCarDetails_3.colour();
		System.out.println("********");

	}

}
