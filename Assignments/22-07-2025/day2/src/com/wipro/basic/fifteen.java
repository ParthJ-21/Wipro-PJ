package com.wipro.basic;

public class fifteen {

	public static void main(String[] args) {
		int t =9;
		int[] num = {11,1,15,8};
	
		for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] + num[j] == t) {
                    System.out.println( i + ", " + j);
                    System.out.println(num[i] + ", " + num[j]);
                    return;
                }
            }
        }
	
	}
}
