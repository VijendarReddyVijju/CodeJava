package com.problems.strings;

public class CountWordsInSentence {
	
	
	public static void main(String[] args) {
		int count=countOfWordsInSentence("hello java ");
		System.out.println(count);
	}

	private static int countOfWordsInSentence(String string) {
		
		if(string.isEmpty())return 0;
		
		return string.split(" ").length;
	}

}
