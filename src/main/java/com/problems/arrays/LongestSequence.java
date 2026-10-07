package com.problems.arrays;

import java.util.HashSet;
import java.util.Set;

public class LongestSequence {
	
    public static void main(String[] args) {
    	int [] arr= {100, 4, 200, 1, 3, 2, 8, 6, 7, 5};
    	
    	int length=longestSequence(arr);
    	
    	System.out.println(length);
	}

	private static int longestSequence(int[] arr) {
		
		// longest sequence means the number will will have next values when add 1
		// and given is unsorted. so we will find start if . for that we assume one number as start if array is having it before number it not starting .
		//so we will move  to next. And if it does not have before number will check forward number until map does not contains
		
		// to check before and after numbers exist we need Set. we can find o=in o(1)
		Set<Integer> set=new HashSet<Integer>();
		for(int a:arr) {
			set.add(a);
		}
		
		int maxLength=0;
		
		for(int i=0;i<arr.length;i++) {
			
			if(!set.contains(arr[i]-1)) {
			int current=arr[i];
			int currentlength=1;
			
			
			while(set.contains(current+1)) {
				
				current=current+1;
				
				currentlength++;
				
			}
			
			maxLength=Math.max(maxLength, currentlength);
			}
		}
		
		
		
		// TODO Auto-generated method stub
		return maxLength;
	}

}
