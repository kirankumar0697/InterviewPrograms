package com.programs.intermediate;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;
import java.util.Scanner;

public class SecondLargestNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of array: ");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		
		System.out.println("Enter elements in array: ");
		for(int i=0; i<size; i++) {
			arr[i] = sc.nextInt();
		}
		
		Optional<Integer> secondLargestNum = Arrays.stream(arr).boxed().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst();

		if(secondLargestNum.isPresent()) {
			System.out.println("Second Largest Number is "+ secondLargestNum.get());
		}
	}

}
