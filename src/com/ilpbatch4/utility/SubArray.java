package com.ilpbatch4.utility;
 
public class SubArray {
 
	public static void main(String[] args) {
		int input = 10;
		subArray(input);
 
	}
 
	private static void subArray(int input) {
		int[] arr = { 4, 1, 2, 3, 2, 5, 7, 9, 12 };
		int sum=0;
		for(int i=0; i<arr.length; i++)
		{
			sum=arr[i];
			for(int j=i+1; j<arr.length; j++)
			{
				sum=sum+arr[j];
				if(sum==input)
				{
					System.out.print(i + " and " + j + " ");
				}
			}
		}
		
	}
 
}