package com.bajddi.generics;

public final class MaClass {
    public final double PI = 3.14159; // Impossible de modifier la valeur
    public final double[] tailles = {50.2, 60.8};

    public void uneMethode() {
        tailles[0] = 99; // tailles est une référence sur un tableau
    }
    
	public void tester() {
		tailles[2]=6;
	}
}
