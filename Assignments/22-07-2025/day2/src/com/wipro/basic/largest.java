package com.wipro.basic;

public class largest {

	public static void main(String[] args) {
		int[] num = {100,67,98,678,45,123};
		int temp= num[0];
		for(int i=0;i<num.length;i++) {
			if(num[i]>temp) {
				temp = num[i];
			}
			
		}
		System.out.println(temp);
	}

}
