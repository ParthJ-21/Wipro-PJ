package com.wipro.basic;

public class removeduplicate {
	 public static void main(String[] args) {
		int[] num = {1,33,33,45,47};
		int j = 0;

        for (int i = 0; i < num.length; i++) {
            if (num[i] != num[j]) {
                j++;
                num[j] = num[i];
            }
        }
        int Len = j + 1;

        System.out.println(Len);

        System.out.print("resulting array: ");
        for (int i = 0; i < Len; i++) {
            System.out.print(num[i] + ",");
        }
	}
}
