package com.bajddi.generics;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.TreeSet;

public class Test {

	
	public static void main(String[] args) {
		String[] numbers = {"99.35", "1.10"};
		BigDecimal total = BigDecimal.ZERO;

		for (String number : numbers) {
			total = total.add(new BigDecimal(number));
		}

		System.out.println(total.toString());
	   /*
		int i=0;
	    System.out.println(i++);
		ArrayList l = new ArrayList(2);
		l.add(1);
		l.add(1);
		l.add(1);
		System.out.println(l.size());
		*/
		
		/*
		class A {
			
			
		};
		*/
		
		//TreeSet<A> set =new TreeSet<A>();
		//set.add(new A());
		
		/*
		Utilitaire utl = new Utilitaire();
		utl.valeur="valeur1";
		utl.afficher("valeur2");
		*/
		/*
		Pile<String> pile = new Pile<String>();
		pile.empiler("str1");
		pile.empiler("str2");
		
		Test.dupliquerElement(pile);
		*/
	}
	
	
	static <T> void dupliquerElement(Pile<T> p) {
		T t = p.sommet();
		p.empiler(t);
	}
}


