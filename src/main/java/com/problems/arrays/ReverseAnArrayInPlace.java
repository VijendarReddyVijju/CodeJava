package com.problems.arrays;

public class ReverseAnArrayInPlace {

	public static void main(String[] args) {
		int [] arr={1,2,3,4,5,6,7};
		reverseArray(arr);
		
		for(int a:arr) {
			System.out.println(a);
		}
		
	}

	private static void reverseArray(int[] arr) {
		
		int left=0;
		int right=arr.length-1;
		
		while(left<right) {
			
			int temp=arr[left];
			
			arr[left]=arr[right];
			arr[right]=temp;
			
			left++;
			right--;
			
		}
		
	}
	
	
}
