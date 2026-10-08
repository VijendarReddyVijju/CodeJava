package com.problems.arrays;

public class MaxSubArray {

	
	public static void main(String[] args) {
		int [] arr={2,-1,11,13,1};
	   int [] newArray=	maxMumSub(arr);
	   
	   for(int a:newArray) {
		   System.out.println(a);
	   }
	}

	private static int[] maxMumSub(int[] arr) {
		
		int currentSum=arr[0];
		
		int maxSum=arr[0];
		
		int start=0;
		
		int end=0;
		
		int temp=0;
				
		
		
		
		for(int i=1;i<arr.length;i++) {
			
			if(arr[i]>currentSum+arr[i]) {
				temp=i;
				currentSum=arr[i];
			}else {
				
				currentSum=currentSum+arr[i];
			}
			
			if(maxSum<currentSum) {
				
				start=temp;
				end=i;
				maxSum=currentSum;
			}
			
		}
		
		
		
		
		
		
		// TODO Auto-generated method stub
		return new int[] {start,end};
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

//	private static int[] maxMumSub(int[] arr) {
//		
//		
//		int currentSum=arr[0];
//		
//		int maxSum=arr[0];
//		
//		int tempStart=0;
//		int start=0;
//		int end=0;
//		
//		for(int i=1;i<arr.length;i++) {
//			
//			if(arr[i]>currentSum+arr[i]) {
//				
//				currentSum=arr[i];
//				tempStart=i;
//				
//			}else  {
//				currentSum=currentSum+arr[i];
//			}
//			
//			if(maxSum<currentSum) {
//				maxSum=currentSum;
//				
//				start=tempStart;
//				end=i;
//			}
//			
//			
//		}
//		
//		return new int[] {start,end};
//	}
}
