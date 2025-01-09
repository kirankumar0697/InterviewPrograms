package com.programs.basic;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of terms in Fibonacci series: ");
		int num = sc.nextInt();
		getFibonacciSeries(num);
		sc.close();
	}
	
	private static void getFibonacciSeries(int num) {
		int first = 0, second = 1;
		
		if(num >= 1) {
			System.out.println(first + " ");
		}
		
		if(num >= 2) {
			System.out.println(second + " ");
		}
		
		for(int i=3; i<=num; i++) {
			int nextNum = first + second;
			System.out.println(nextNum + " ");
			
			first = second;
			second = nextNum;
		}
		
	}

}
