package com.programs.basic;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int num = sc.nextInt();
		
		long factNum = getFactorialNumber(num);
		
		System.out.println("Factorial of " +num + " is "+ factNum);
		sc.close();
	}
	
	private static long getFactorialNumber(int num){
		if(num==0 || num==1) {
			return 1;
		}
		
		long factNum = 1;
		
		for(int i=2; i<=num; i++) {
			factNum = factNum*i;
		}
		
		return factNum;
	}
}
