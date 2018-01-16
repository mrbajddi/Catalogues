package com.bajddi;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unused")
public class Sample {

	public static void main(String[] args) {
		
		Animal b = new BergerAlemand();
		Dog d = (Dog) b;
		d.faireBruit();
		
		/*
		Animal b = new Dog();
		Dog d = (Dog) b;
		d.faireBruit();
		
		BergerAlemand ba = (BergerAlemand) d;
		ba.faireBruit();
		*/
		
		/*
		Animal b = new BergerAlemand();
		Dog d = (Dog) b;
		d.faireBruit();
		
		BergerAlemand ba = (BergerAlemand) d;
		ba.faireBruit();
		*/ 
		
		/*
		Animal d = new Dog();
		Animal c = new Cat();
		List<Animal> list = new ArrayList<>();
		list.add(d);
		list.add(c);
		for(Animal a : list) {
			a.faireBruit();
		}
		*/
	}
}
