package com.problems.strings;

import java.util.Stack;

public class ValidParanthesis {
	
	
	public static void main(String[] args) {
		boolean isValidParenthesis=valid("a(){}{}({})");
		
		System.out.println(isValidParenthesis);
	}

	private static boolean valid(String string) {
		
		Stack<Character> stack=new Stack<Character>();
		
		for(char c:string.toCharArray()) {
			
			if(c=='('||c=='{'||c=='[') {
				
				stack.push(c);
				
			}else {
			
				if(stack.isEmpty())return false;
			char ch=stack.pop();
			
			if((c==')'&&ch!='(')||c==']'&&ch!='['||c=='}'&&ch!='{') {
				
				return false;
			}
			}
			
			
			
		}
		return true;
	}

}
