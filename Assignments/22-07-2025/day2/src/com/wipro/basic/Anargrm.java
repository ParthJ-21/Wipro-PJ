package com.wipro.basic;

import java.util.Arrays;

public class Anargrm {

	public static void main(String[] args) {
		String str1 = "Earth";
		String str2 = "Heart";
		
		char[] arr1 = str1.toCharArray();
		Arrays.sort(arr1);
		char[] arr2 = str1.toCharArray();
		Arrays.sort(arr2);
		
		for(int i =0;i<arr1.length;i++) {
			if(arr1[i] ==arr2[i]) {
				System.out.println("is anagram");
			}
			else {
				System.out.println("is not anagram");
			}
		}
	}

}
