package com.bajddi.generics;

public class MyThread extends Thread {
    public String text;
    
    public void run() {
    	System.out.println(text);
    }
	
	
	public static void main(String[] args) {
		for(int i=0;i<1000;i++) {
			  System.out.println("Start" + i);
			  MyThread t1 = new MyThread();
			  t1.text="one ";
			  
			  MyThread t2 = new MyThread();
			  t2.text="two ";
			  
			  t1.start();
			  t2.start();
			  System.out.println("three ");
			  
			  System.out.println("End" + i);
		}
	  
		
	}

}
