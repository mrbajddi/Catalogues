package com.bajddi;

public abstract class Animal {
     int taille =0;
	public final int poids = 0;
    
    public Animal() {
    	System.out.println("Creation animal - poids : "+ this.poids);
    }
	
    public abstract void faireBruit();

}
