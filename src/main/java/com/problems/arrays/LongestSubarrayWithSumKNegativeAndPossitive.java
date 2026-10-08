package com.problems.arrays;

import java.util.HashMap;
import java.util.Map;

public class LongestSubarrayWithSumKNegativeAndPossitive {

	
	public static void main(String[] args) {
		 int []arr = {2, -1, 1, 2, 4, 3};
		             //2, 1, 2, 4, 8, 11
			
			int k =1;
			
			int sum=0;
			
			int maxLength=0;
			
			int count=0;
			
			Map<Integer, Integer> map=new HashMap<Integer, Integer>();
			
		       map.put(0, -1);
			
			for(int i=0;i<arr.length;i++) {
				
				sum=sum+arr[i];
				
				if(map.containsKey(sum-k)) {
					System.out.println("current index is "+i );
					int indexOfPrefix=map.get(sum-k);
					System.out.println("indexOfPrefix "+indexOfPrefix);
					
					int length=i-indexOfPrefix;
					
					System.out.println("length "+length);
					if(length>maxLength) {
						maxLength=length;	
						count++;
					}
					
					
					
				}
				
				map.put(sum, i);
				
			}
			
			System.out.println(maxLength);
			
			System.out.println("count "+count);
			
			System.out.println(map);
	}
}
