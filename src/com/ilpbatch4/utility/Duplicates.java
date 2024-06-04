package com.ilpbatch4.utility;
 
public class Duplicates {
 
	public static void main(String[] args) {
		float input = 5;
		missingNumber(input);
	}
 
	private static void missingNumber(float input) {
		int[] arr = { 1, 6, 6, 9, 1 };
		for (int i = 0; i < input; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[j] == arr[i]) {
					System.out.print(arr[j] + " ");
					break;
				}
			}
		}
 
	}
}
 