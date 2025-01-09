package com.programs.basic;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String: ");
		String inputString = sc.next();
		
		String reversedString = reverseString(inputString);
		
		System.out.print("Reversed string is " + reversedString);
		sc.close();
	}
	
	/*private static String reverseString(String givenString) {
		StringBuilder str = new StringBuilder(givenString);
		
		return str.reverse().toString();
	}*/
	
	private static String reverseString(String givenString) {
		
		String reversedString = "";
		for(int i=givenString.length(); i>0; i--) {
			reversedString += givenString.charAt(i-1);
		}
		
		return reversedString;
	}
}
