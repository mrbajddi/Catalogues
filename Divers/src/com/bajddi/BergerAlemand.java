package com.bajddi;

public class BergerAlemand extends Dog {

	public BergerAlemand() {
		super();
		System.out.println("Creation BergerAlemand - poids : "+ this.poids);
	}

	@Override
	public void faireBruit() {
		System.out.println("BergerAlemand fait Wouf Wouf");
	}
	
	

}
