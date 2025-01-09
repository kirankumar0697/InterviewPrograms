package com.programs.intermediate;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of array: ");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		
		System.out.println("Enter elements in array: ");
		for(int i=0; i<size; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("Original order is as " + Arrays.toString(arr));
		bubbleSort(arr);
		System.out.println("Sorted oredr is as " + Arrays.toString(arr));
	}
	
	public static void bubbleSort(int[] arr) {
		
		for(int i=0; i<arr.length-1; i++) {
			for(int j=0; j<arr.length-i-1; j++) {
				
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}

}
