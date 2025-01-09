package com.programs.intermediate;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class SortArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of array: ");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		
		System.out.println("Enter elements in array: ");
		for(int i=0; i<size; i++) {
			arr[i] = sc.nextInt();
		}
		
		int[] ascendingArray = Arrays.stream(arr).sorted().toArray();
		
		System.out.println("Ascending sorted Array: " + Arrays.toString(ascendingArray));
		
		int[] descendingArray = Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).mapToInt(Integer::intValue).toArray();
		
		System.out.println("Descending sorted Array: " + Arrays.toString(descendingArray));

	}

}
