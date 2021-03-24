package com.example.question3;

import java.util.Collections;
import java.util.Scanner;

public class StringArrayExample {
	
	public static String concatenatingStrings(String[] array) {
		StringBuilder sb = new StringBuilder();
		for(String str: array) {
			if(str != null && array.length>0) {
				sb.append(str.trim());
			}
		}
		
		return sb.toString();
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of strings in an array:");
		int n = scanner.nextInt();
		String[] strArray = new String[n];
		
		scanner.nextLine();
		System.out.println("Enter the strings into an array: ");
		
		for(int i=0;i<n;i++) {
			strArray[i]=scanner.nextLine();
		}
		
		String output = concatenatingStrings(strArray);
		
		System.out.println("Concatenating the strings: "+output);
	}

}
