package com.bajddi.generics;

public class Test2 {

	private enum SwitchOption {
		A,B,C
	}
	
	private static void switchs() {
		SwitchOption opt = SwitchOption.A;
		try {
		switch(opt) {
		case C:
			 System.out.print(SwitchOption.C); break;
		case A:
			 System.out.print(SwitchOption.A); break;
		case B:
			 System.out.print(SwitchOption.B); break;

		default:
	   		 System.out.print(opt);
		}	
		} catch (Exception e) {
			System.out.println(opt);
		}
	}
	
	
	public static void main(String[] args) {
		switchs();

	}

}
