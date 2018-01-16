package com.bajddi.generics;

public class TestOverriding {

	
	public static void main(String[] args) {
		Super superRef = new Sub();
		Sub subRef = new Sub();
		Super suRef = new Super();
		
		superRef.tests();
		subRef.tests();
		suRef.tests();
	}
	
	
	static class Super {
		public static void tests() {
			System.out.println("Super static");
		}
	}
	
	static class Sub extends Super {
		public static void tests() {
			System.out.println("Sub static");
		}
	}
	
}
