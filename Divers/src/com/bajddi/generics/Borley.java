package com.bajddi.generics;

import java.io.IOException;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class Borley extends Thread {
 
	public static void main(String[] args) {
		//Borley b = new Borley();
        //b.start();
		try {
			exceptions();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		 System.out.println("Running");
	}
	

	private static void exceptions() throws Exception {
		System.out.print("A");
		Integer i = null;
		
		try {
			
			try {
				try {
					throw new IOException("B");
				} catch (RuntimeException e) {
					 System.out.println(e.getMessage());
				}finally {
					System.out.println("C");
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			System.out.println(i.longValue());
		} finally {
			System.out.println("D");
		}
		System.out.println("E");
	}
	
}
