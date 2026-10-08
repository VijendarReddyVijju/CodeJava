package com.problems.strings;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class StringCompression {
	
	public static void main(String[] args) {
		
		
		
//		Queue<Integer> mug5=new ArrayBlockingQueue<Integer>(5);
//		Queue<Integer> mug3=new ArrayBlockingQueue<Integer>(3);
//		
//		for(int i=0;i<5;i++) {
//			mug5.add(1);
//		}
//		
//		for(int i=0;i<3;i++) {
//			mug3.add(mug5.remove());
//		}
//		
//		System.out.println(mug5.size());
		
		
		String compressedString=compress("aaabbccaccdd");
		
		System.out.println(compressedString);
		
	}

	private static String compress(String string) {
		
		StringBuilder compressed=new StringBuilder();
		
		int i=0;
		
		while(i<string.length()) {
			
			char c=string.charAt(i);
			
			int count=0;
			while(i<string.length()&&c==string.charAt(i)) {
				
				count++;
				i++;
			}
			
			compressed.append(c).append(count);
			
			
		}
		
		
		// TODO Auto-generated method stub
		return compressed.toString();
	}

}
