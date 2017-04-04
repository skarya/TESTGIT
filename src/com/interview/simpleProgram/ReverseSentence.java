package com.interview.simpleProgram;

import java.util.StringTokenizer;

public class ReverseSentence {
	
	public static void main(String ...ar){
		
		String input=  "this is my world";
		StringTokenizer str= new StringTokenizer(input, " ");
		String sReversed="";		
		while(str.hasMoreTokens()){
			sReversed = str.nextToken() + " " + sReversed;

		}
		
		System.out.println(sReversed);
		input = "You are an goddess";
		reverse(input);
		
	}

	
	  public static  void reverse(String str) {

		  String[] source= str.split(" ");
	        String dest = "";
	        for (int n = source.length - 1; n >= 0; n--) {
	            dest =dest+ source[n] + " ";
	        }
	        System.out.println(dest);

	    }

}
