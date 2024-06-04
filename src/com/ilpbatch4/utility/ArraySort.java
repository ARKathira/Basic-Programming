package com.ilpbatch4.utility;
 
public class ArraySort {
	public static void main(String[] args) {
		int[] arr = { 0, 1, 2, 1, 2, 0, 1, 0, 2 };
 
		int k = 0, l = 0, m = arr.length - 1;
 
		for (l=0; l <= m;) {
			switch (arr[l]) {
			case 0:
				swap(arr, k, l);
				k++;
				l++;
				break;
			case 1:
				l++;
				break;
			case 2:
				swap(arr, l, m);
				m--;
				break;
			}
		}
 
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
	}
 
	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
 
}
 
