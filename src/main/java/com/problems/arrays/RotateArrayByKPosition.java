package com.problems.arrays;

public class RotateArrayByKPosition {
	
	
	public static void main(String[] args) {
		int [] arr={1,2,3,4,5,6,7};
		rotate(arr,3);
		
		System.out.println(3%10);
		
		for(int a:rotate(arr,3)) {
//			System.out.println(a);
		}
	}

	private static int[] rotate(int[] arr, int k) {
		
		int [] newArray=new int [arr.length];
		
		
		for(int i=0;i<arr.length;i++) {
			
			int newIndex=(i+k)%arr.length;
			
			
			newArray[newIndex]=arr[i];
			
		}
		
		return newArray;
		
		
		
		
	}

}
