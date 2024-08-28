package com.tdemo;

import java.util.Arrays;

public class ArrayDemo {

	public static void main(String[] args) {
		
		int [] a1 = {10,23,45,67,58};
		int [] a2 = {21,9,47,78,35};
		
		if(Arrays.equals(a1, a2)) {
			
			System.out.println("Arrays are Equal");
			
		} else {
			
			System.out.println("Arrays are not Equal");
		}
	}
}
