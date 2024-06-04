package com.ilpbatch4.utility;
 
public class Pair {
 
	public static void main(String[] args) {
		int input = 10;
		pair(input);
 
	}
 
	private static void pair(int input) {
		int[] arr = { 6, 1, 4, 3, 2, 5, 7, 9, 12 };
		int n=0;
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i]+arr[j] == input)
				{
					n++;
				}
			}
		}
		System.out.print("number of pairs whose sum is " + input + " = " +n);
		
	}
 
}
 