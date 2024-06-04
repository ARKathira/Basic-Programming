package com.ilpbatch4.utility;

public class SumOfSeries {

	public static void main(String[] args) {
		int n = 10;
		sumOfSeries(n);

	}

	private static void sumOfSeries(int n) {

		int sum = 0, j = 1;
		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0) {
				sum = sum - j;
			} else {
				sum = sum + j;
			}
			j = j + 2;
		}

		System.out.println("Sum is: " + sum);

	}

}
