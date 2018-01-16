package com.bajddi.generics;

public class Pile<E> {
	
	Noeud<E> sommet;
	
	void empiler(E x) {
	Noeud<E> e = new Noeud<E>(x);
	e.suivant = sommet;
	sommet = e;	
	}
	
	E sommet() {
		return sommet.val;
	}

}
