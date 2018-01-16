package com.bajddi;

public class Cat extends Animal {

	public Cat() {
		super();
		System.out.println("Creation Cat - poids : "+ this.poids);
		System.out.println("Creation Cat - taille : "+ this.taille);  
	}

	@Override
	public void faireBruit() {
		System.out.println("Cat fait Miaou Miaou");
	}

}
