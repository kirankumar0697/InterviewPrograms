package com.programs.intermediate;

import java.util.Arrays;
import java.util.OptionalInt;

public class SmallestAndLargestNumber {
	
	public static void main(String[] args) {
		
		int[] arr = {23,1,5,-34,53,2,3,42};

		findLargestAndSmallestNumber(arr);
	}
	
	private static void findLargestAndSmallestNumber(int[] arr) {
		
		//OptionalInt largest = Arrays.stream(arr).max();
		//OptionalInt smallest = Arrays.stream(arr).min();
		
		//largest.ifPresent(l -> System.out.println("Largest Number is " + l));
		//smallest.ifPresent(s -> System.out.println("Largest Number is " + s));
		
		int largest = arr[0];
		int smallest = arr[0];
		for(int num : arr) {
			if(largest < num) {
				largest = num;
			}
			if(smallest > num) {
				smallest = num;
			}
		}
		
		System.out.println("Largest Number: " + largest + " Smallest Number: " + smallest);
				
	}
	
}
