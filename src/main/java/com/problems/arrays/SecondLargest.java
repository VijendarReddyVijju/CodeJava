package com.problems.arrays;

public class SecondLargest {
	
	
	public static void main(String[] args) {
		int [] arr={1,2,3,4,6,7};
		int secondLargest=secondlargest(arr);
		
		System.out.println(secondLargest);
	}

	private static int secondlargest(int[] arr) {
		
		int largest=arr[0];
		
		int secondLargest=arr[0];
		
		for(int a:arr) {
			
			if(a>largest) {
				
				secondLargest=largest;
				largest=a;
			}
			
			
		}
		return secondLargest;
		
		
		
	}

}
