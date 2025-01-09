package com.programs.basic;
import java.util.Scanner;


public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num = sc.nextInt();
		
		if(isPrime(num)) {
			System.out.println("This is a prime number.");
		} else {
			System.out.println("This is not a prime number.");
		}
		
		sc.close();
	}
	
	private static boolean isPrime(int num) {
		if(num <= 1) {
			return false;
		}
		
		for(int i=2; i<=Math.sqrt(num); i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}
}
