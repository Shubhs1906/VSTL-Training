package com.abstraction.interfaceEx;

public class Car_2 implements GetCarDetails {

	@Override
	public void brand() {
		System.out.println("Hyundai ");
		
	}

	@Override
	public void segment() {
		System.out.println("Compact SUV");
		
	}

	@Override
	public void model() {
		System.out.print("VENUE    ");
		
	}

	@Override
	public void varient() {
		System.out.println("Sx(O) MT");
		
	}

	@Override
	public void colour() {
		System.out.println("Denim Blue");
		
	}

	@Override
	public void other() {
		// TODO Auto-generated method stub
		
	}

}
