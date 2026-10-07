package com.problems;

public class IntToRoman {
	
	
	
	public static void main(String[] args) {
		
		System.out.println(intToRoman(3749));
	}
	
public static String intToRoman(int num) {

	int [] values={1000,900,500,400,100,90,50,40,10,9,5,4,1}; // all possible roman values
	
	// and their equalant roman symbols
    String [] romans={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
    
    
    String roman=""; // taking empty string to add romans
    for(int i=0;i<values.length;i++) {
    	
    	while(values[i]<num) {  // for ever value , if it less than actual number update roman and untill possibilities 1000s,500s, 100s,10s
    		roman=roman+romans[i];
    		
    		num=num-values[i]; // after updating roman check if still same roman required
    		
    		System.out.println(num);
    		
    	}
    	System.out.println(roman);
    	
    	
    }
    
    return roman;
	
	
}

}
