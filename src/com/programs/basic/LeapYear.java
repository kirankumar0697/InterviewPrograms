package com.programs.basic;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Year: ");
		int year = sc.nextInt();
		if(isLeapYear(year)) {
			System.out.println(year + " is a leap year.");
		} else {
			System.out.println(year + " is not a leap year.");
		}
		
		sc.close();
	}
	
	private static boolean isLeapYear(int year) {

		if((year%4==0 && year%100!=0) || (year%400==0)) {
			return true;
		}
		
		return false;
	}

}
