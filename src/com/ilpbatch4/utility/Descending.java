package com.ilpbatch4.utility;

public class Descending {

	public static void main(String[] args) {
		int input1 = 1, input2 = 2, input3 = 3;
		descendingOrder(input1, input2, input3);
		

	}

	private static void descendingOrder(int input1, int input2, int input3) {
		if((input3 > input1) && (input3 > input2)) {
			if(input2 > input1) {
				System.out.println(input3);
				System.out.println(input2);
				System.out.println(input1);
			}
			else {
				System.out.println(input3);
				System.out.println(input1);
				System.out.println(input2);
			}
		}
		else if((input2 > input1) && (input2 > input3)){
			if(input3 > input1) {
				System.out.println(input2);
				System.out.println(input3);
				System.out.println(input1);
				
			}
			else {
				System.out.println(input2);
				System.out.println(input1);
				System.out.println(input3);
				
			}
			
			
		}
		else {
			System.out.println(input1);
			if(input2 > input3) {
				System.out.println(input2);
			System.out.println(input3);
			}
			else {
				System.out.println(input3);
			System.out.println(input2);
			}
		}
			
		
		
	}

}
