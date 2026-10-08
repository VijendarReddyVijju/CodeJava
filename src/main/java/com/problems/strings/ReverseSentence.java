package com.problems.strings;

public class ReverseSentence {
	
	public static void main(String[] args) {
		
		String reverseWords=reverseSentence("hello java");
		
		System.out.println(reverseWords);
		
	}

	private static String reverseSentence(String string) {
		String [] arr=string.split(" ");
		
		String s="";
		
		for(int i=arr.length-1;i>=0;i--) {
			s=s+arr[i]+" ";
			
		}
		
		return s;
	}

}
