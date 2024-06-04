package com.ilpbatch4.utility;
 
public class MissingNumber {
 
	public static void main(String[] args) {
		float input = 10;
		missingNumber(input);
 
	}
 
	private static void missingNumber(float input) {
		int[] arr = { 1, 6, 8, 9, 3 , -10};
		int l = 0;
		for (int i = -10; i <=input; i++) {
			l = 0;
			for (int j = 0; j < arr.length; j++) {
				
				if (arr[j] == i) {
//					if (i%2 == 0) {
//						l=0;
//					}
//					else{
//						l = 1;
//					}
					l = 1;
				}
				
			}
			if (l == 0) {
				if (i%2 != 0) {
	

				System.out.print(i + " ");
			}
		}
 
	}
 
}}