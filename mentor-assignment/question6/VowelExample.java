package com.example.question6;

import java.util.Scanner;

public class VowelExample {

	public static int countVowels(char[] arr) throws Exception {

		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 'x' || arr[i] == 'X') {
				throw new Exception("checked Exception error!! not valid");
			}
			if (arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u') {
				count++;
			}

		}

		return count;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Enter the String:");
		String str = s.nextLine();

		str = str.toLowerCase();

		char[] arr = new char[str.length()];
		arr = str.toCharArray();

		int output = 0;

		try {
			output = countVowels(arr);
			System.out.println("No of vowels in a character array: " + output);
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

}
