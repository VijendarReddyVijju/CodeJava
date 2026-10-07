package com.problems.arrays;

public class LongestSubarrayWithSumK {
	
	
	public static void main(String[] args) {
        int []arr = {2, 3, 1, 2, 4, 3};
		
		int target =10;
		
		
		int left=0;
		
		int maxLength=0;
		int currentSum=0;
		
		int maxStart=0;
		
		int maxEnd=0;
		
		for(int right=0;right<arr.length;right++) {
			
			currentSum=currentSum+arr[right];
			
			while(currentSum>target&&left<=right) { //do sum from left current if sum exceeded remove left
				
               currentSum=currentSum-arr[left];
				left++;
			}
			
			if(currentSum==target) {
				int currentLength=right-left+1;
				if(maxLength<currentLength) {
					maxLength=currentLength;
					maxStart=left;
					maxEnd=right;
				}
			}
			
			
		}
		
		System.out.println(maxLength);
		
		// note this is for possitve numbers only
		
		
	}

}
