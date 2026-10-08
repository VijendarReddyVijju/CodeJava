package com.problems.arrays;

import java.util.HashMap;
import java.util.Map;

import javax.swing.text.html.HTML.Tag;

public class PairSum {
	
	
	public static void main(String[] args) {
		int [] arr={2,7,11,13};
		int target=9;
	   int [] newArray=	pairSum(arr,target);
	   
	   for(int a:newArray) {
		   System.out.println(a);
	   }
	}

	private static int[] pairSum(int[] arr, int target) {
		
		Map<Integer, Long> seen=new HashMap<Integer, Long>();
		
		
		for(int a:arr) {
			
			int required=target-a;
			
			if(seen.containsKey(required)) {
				
				return new int [] {required,a};
			}
			seen.put(a, (long) 0);
			
			
		}
		
		
		return new int [] {} ;
	}
	
	
private static int[] pairSumWorseCase(int[] arr, int target) {
		
		
		
		
		for(int i=0;i<arr.length;i++) {
			
			
			for(int j=i+1;j<arr.length;j++) {
				
				if(arr[i]+arr[j]==target)return new int [] {arr[i],arr[j]};
				
			}
			
		}
		
		
		return new int [] {} ;
	}

}
