package com.wipro.basic;

public class secondLargest {
	public static void main(String[] args) {
		int[] arr = {100, 67, 98, 678, 45, 123};

        int largest = arr[0];
        int secondLargest = arr[0];

        // Find the largest number first
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        // Now find the second largest
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > secondLargest && arr[i] < largest) {
                secondLargest = arr[i];
            }
        }

        System.out.println("Second largest number is: " + secondLargest);
    }
	
}
