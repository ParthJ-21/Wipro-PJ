package com.wipro.basic;

public class reverse {

	public static void main(String[] args) {
		int[] num = {1,2,3,4,5};
		int[] num1 = {0,0,0,0,0};
		int j = num.length;
		for(int i =0;i<=num.length;i++) {
			num1[i] = num[j];
			j--;
		}
	
	

}
}
