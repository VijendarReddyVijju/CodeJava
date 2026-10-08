package com.problems.strings;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatingCharacter {
	
	
	public static void main(String[] args) {
		
		String data="aabbcdef";
		
		
		
		char [] arr=data.toCharArray();
		
		
		Character ch=data.chars()
				.mapToObj(c->(char)c).
				collect(Collectors.groupingBy(
						Function.identity(),
						LinkedHashMap::new,Collectors.counting())).entrySet().stream().filter(n->n.getValue()==1).map(n->n.getKey()).findFirst().orElse(null);
			
		
		System.out.println(ch);
	}

}
