package com.programs.basic;

import java.util.Scanner;

public class CountVowelsAndConsonants {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String inputString = sc.nextLine();
		
		int[] count = getVowelsConsonantsCount(inputString);
		
		System.out.println("The count of Vowels is " +count[0]+ " and consonants is " +count[1]);
		sc.close();
	}
	
	private static int[] getVowelsConsonantsCount(String inputString) {
		int vowelsCount = 0, consonantsCount = 0;
		inputString = inputString.toLowerCase();
		
		for(int i=0; i<inputString.length(); i++) {
			char ch = inputString.charAt(i);

			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
				vowelsCount += 1;
			} else if(ch>='a' && ch<='z') {
				consonantsCount += 1;
			}
		}

		return new int[] {vowelsCount, consonantsCount};
	}
}
