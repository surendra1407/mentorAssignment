package com.example.question4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class EnhancedLoopExample {
	
	public static void alternateElements(int[] arr) {
		int count=0;
		for(int i:arr) {
			if(count % 2 == 0) {
				System.out.print(i +" ");
			}
			count++;
		}
		
	}
	public static void reverseArray(int[] arr) {
		List<Integer> list = new ArrayList<>();
		
		for(int i: arr) {
			list.add(i);
		}
		Collections.reverse(list);
		System.out.println(list);
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the number:");
		int n = s.nextInt();
		
		int[] arr = new int[n];
		
		System.out.println("Enter the elements of an array");
		for(int i=0;i<n;i++) {
			arr[i] =s.nextInt();
		}
		
		alternateElements(arr);
		System.out.println("Reverse elements of an array:");
		reverseArray(arr);
	}

}
