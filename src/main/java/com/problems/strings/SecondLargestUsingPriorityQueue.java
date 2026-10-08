package com.problems.strings;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class SecondLargestUsingPriorityQueue {
	
	
	
	public static void main(String[] args) {
		
		
		int arr []= {5,2,1,6,8,3};
		
		Queue<Integer> queue=new PriorityQueue<Integer>(Comparator.reverseOrder());
		
		for(int a:arr) {
			queue.offer(a);
		}
		
		for(Integer a:queue) {
			
			System.out.println(a);
		}
		
//		System.out.println(queue.peek());
//		System.out.println(queue.peek());
//		System.out.println(queue.poll());
//		System.out.println(queue.poll());
		
		
	}

}
