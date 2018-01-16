package com.bajddi.generics;

public class TestCodingGame {

	public static void main(String[] args) {
       
		int[] tab = {2,5,9,7,67,3,53,23,9,52,1,12,32,90,45,43,82,1,22,44};
		
		System.out.println("getMax="+getMax(tab));
		
		/*
		int[][] tab= {
    		   {1,1}, {2,2}, {3,3}, {4,4}    		   
       };		 
       System.out.println(tab.length); 
       for(int i=0;i<tab.length;i++) {
    	for(int j=0;j<tab[i].length;j++) {
    		System.out.println("["+ i +", "+ j +"] = "+ tab[i][j]);
    	}
       }
       */
       
	}
	
	
	public static int getMax(int[] tab) {
		int max = 0;
		int count = 0;
		for(int i=0;i<tab.length;i++) {
			count++;
			if(max<tab[i]) {
				max=tab[i];
			}
		}
		System.out.println("count :"+ count);
		return max;
	}
	
	
	public static int getMaxOpt(int[] tab) {
		int max = 0;
		int count = 0;
		
		
		for(int i=0;i<tab.length;i++) {
			count++;
			if(max<tab[i]) {
				max=tab[i];
			}
		}
		System.out.println("count :"+ count);
		return max;
	}

}
