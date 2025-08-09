package com.wipro.basic;

public class array {

	public static void main(String[] args) {
		int[] numbers = {1,5,74,213,11};

        

        // Double each value
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = numbers[i] * 2;
        }

        // Print the new values
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Value at index " + i + ": " + numbers[i]);
        }
    }

	}


