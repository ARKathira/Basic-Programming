package com.ilpbatch4.utility;

public class SumOfCubeOfFibonnacciSeries {

	public static void main(String[] args) {
		int n = 3;
		sumOfCubicSeries(n);

	}

	private static void sumOfCubicSeries(int n) {
		int sum1 = 0, sum2 = 1, newsum = 0, sum = 0, cube=1;
		for (int i=1;i<=n;i++) {
			newsum = sum1 + sum2;
			sum1 = sum2;
			sum2 = newsum;
			cube = newsum * newsum * newsum;
			sum = sum + cube;
		}
		System.out.println("Sum is: "+sum);
	}

}
