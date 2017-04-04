
package com.interview.simpleProgram;

public class Recursion {

	
	public static void main(String ...strings ){
		Recursion r= new Recursion();
		System.out.println(r.sum(5));
		
		System.out.println( fib(9));
	}
	
	public int sum( int i){
	System.out.println("  "+i);	
		int sum=0;
		if(i==1)
			return 1;
		sum= i + sum(i-1);
		return sum;
		
	}
	
	

		 static int fib(int n)
		    {
		    if (n <= 1)
		       return n;
		    return fib(n-1) + fib(n-2);
		    }
		
		
		
	
}
