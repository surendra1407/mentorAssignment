package com.example.question1and2;

import java.util.Scanner;

public class StringExample {

	public static String replaceAllPositions(String input) {
		char[] array = input.toCharArray(); // it converts String to character Array.
		for (int i = 0; i < input.length() - 4; i++) {
			array[i] = 'X';
		}
		return String.valueOf(array); // it can converts any type value into String
	}

	public static StringBuilder replaceAllPositionsUsingStringBuilder(StringBuilder sb) {
		
		for(int i=0;i<sb.length()-4;i++) {
			sb.setCharAt(i, 'X');
		}
		
		return sb;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String:");
		String text = scanner.nextLine();

		System.out.println("Replace all positions with 'X' character except last four positions");
		String output = replaceAllPositions(text);

		System.out.println(output);

		StringBuilder stringBuilder = new StringBuilder(text);
		
		System.out.println("Using String Builder: ");
		
		StringBuilder output1 = replaceAllPositionsUsingStringBuilder(stringBuilder);
		
		System.out.println(output1);

	}

}
