package com.tdemo;

public class SumDemo {

	public static void main(String[] args) {
		
		int [] x = {23,47,12,58,27};
		int sum = 0;
		
		for (int i = 0; i < x.length; i++) {
			
			sum = sum + x[i];
			
		}
		
		System.out.println("Sum of elements of Array: "+sum);
	}
}
