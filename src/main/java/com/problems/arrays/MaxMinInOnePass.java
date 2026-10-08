package com.problems.arrays;

public class MaxMinInOnePass {
	
	
	public static void main(String[] args) {
		int [] arr={1,6,7,4,2,3,0};
		findMaxAndMin(arr);
	}

	private static void findMaxAndMin(int[] arr) {
		
		int min=arr[0];
		
		int max=arr[0];
		
		for(int a:arr) {
			
			if(a>max)max=a;
			
			if(a<min)min=a;
			
			
		}
		
		System.out.println("min "+min);
		
		System.out.println("max "+max);
	}

}
