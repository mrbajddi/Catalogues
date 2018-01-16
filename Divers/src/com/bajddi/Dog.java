package com.bajddi;

public class Dog extends Animal {
 
	public Dog() {
		super();
		System.out.println("Creation Dog - poids : "+ this.poids);
	}

	@Override
	public void faireBruit() {
		System.out.println("Dog fait Wouf Wouf");
	}

}
