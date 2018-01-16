package com.bajddi.generics;

public class Noeud<T> {

	T val;
	Noeud<T> suivant;
	Noeud(T v){
		val = v;
	}
}
