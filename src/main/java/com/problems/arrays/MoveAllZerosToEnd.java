package com.problems.arrays;

public class MoveAllZerosToEnd {
	
	
	public static void main(String[] args) {
		int [] arr={0,0,3,0,5,6,7};
		moveAllZerosToEnd(arr);
		
		for(int a:arr) {
			System.out.println(a);
		}
		
	}

	private static void moveAllZerosToEnd(int[] arr) {
		// TODO Auto-generated method stub
		
		int index=0;
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]!=0) {
				
				arr[index]=arr[i];
				index++;
			}
			
		}
		for(int i=index;i<arr.length;i++) {
			
			arr[i]=0;
		}
		
	}

}
