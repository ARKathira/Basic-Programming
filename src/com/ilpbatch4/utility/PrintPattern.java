package com.ilpbatch4.utility;
 
public class PrintPattern {
 
	public static void main(String[] args) {
		int input=4;
		printPatternZ(input);
	}
	public static void printPatternZ(int input) {
		for(int i=1;i<=input;i++) {
			if(i==1 || i==input) {
				for(int j=1;j<=input;j++) {
					System.out.print("*");
				}
				
			}
			else {
				for(int j=1;j<=input-i;j++) {
					System.out.print(" ");
				}
				System.out.print("*");	
			}
			System.out.println("");
			
		}
	}
 
}