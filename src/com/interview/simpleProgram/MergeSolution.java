package com.interview.simpleProgram;

public class MergeSolution {

	public static void main(String ...strings ){
		int [] array= {52,34,86,17,66,10};
		int [] temp= new int[array.length-1];
		mergeSort(array,temp,0,array.length-1);
	}

	private static void mergeSort(int[] array,int[] temp,int left, int right) {
		// TODO Auto-generated method stub
		if(left < right){
			int mid=(left+right)/2;
			mergeSort(array,temp, left, mid);
			mergeSort(array,temp, mid+1,right);
			merge(array,temp,left,mid,right);
			
		}
	}

	private static void merge(int[] array, int[] temp,int left, int mid, int right) {
		// TODO Auto-generated method stub
		int k;
	}
}
