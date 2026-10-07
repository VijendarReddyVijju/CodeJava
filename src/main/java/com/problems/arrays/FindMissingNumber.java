package com.problems.arrays;

public class FindMissingNumber {
	public static void main(String[] args) {
		int [] arr={1,2,3,4,6,7};
		int missed=findMissingNumber(arr);
		
		System.out.println(missed);
	}

	private static int findMissingNumber(int[] arr) {
		
		int max=arr[arr.length-1];
		
		int requiredSum=max*(max+1)/2; //sum of natural numbers is n*(n+1)/2
		
		int actulSum=0;
		for(int a:arr) {
			actulSum=actulSum+a;
			
		}
		
		int missed=requiredSum-actulSum;
		return missed;
		
		
		
	}
}
