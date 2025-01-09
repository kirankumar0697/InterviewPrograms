package com.programs.basic;

import java.util.Scanner;

public class ArmstrongNumber {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num = sc.nextInt();
		if(isArmstrongNumber(num)) {
			System.out.println(num + " is a armstrong number.");
		} else {
			System.out.println(num + " is not a armstrong number.");
		}
		
		sc.close();
	}
	
	private static boolean isArmstrongNumber(int num) {
		int originalNumber = num;
		int sum = 0;
		int digitCount = 0;
		
		while(num != 0) {
			num /= 10;
			digitCount++;
		}
		
		num = originalNumber;
		while(num!=0) {
			int digit = num%10;
			sum += Math.pow(digit, digitCount);
			num /=10;
		}
		
		return originalNumber == sum;
	}

}
