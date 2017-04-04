package com.interview.simpleProgram;

//Fibonacci Series using Dynamic Programming
public class fibonacci {
	static int fib(int n) {
		/* Declare an array to store Fibonacci numbers. */
		int f[] = new int[n + 1];
		int i;

		/* 0th and 1st number of the series are 0 and 1 */
		f[0] = 0;
		f[1] = 1;

		for (i = 2; i <= n; i++) {
			/*
			 * Add the previous 2 numbers in the series and store it
			 */
			f[i] = f[i - 1] + f[i - 2];
		}

		return f[n];
	}

	public static void main(String args[]) {
		int n = 9;
		System.out.println(fib(n));
		System.out.println(fibb(n));

	}
	
	
	
	static int fibb(int n){
		if (n<=1)
			return n;
		
		return fibb(n-1)+fibb(n-2);
	}
}
/* This code is contributed by Rajat Mishra */