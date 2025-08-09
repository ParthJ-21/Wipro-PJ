package com.wipro.basic;

public class sir {
	public static void main(String[] args) {
		int[] arr= {7, 11, 15,23};
	    int target=9;
	    int[] output= {0,0};
	    

		for(int i=0;i<arr.length;i++)
		{
			if(((i+1)<arr.length)&&(arr[i]+arr[i+1]==target))
			{
				

				output[0]=i;
				output[1]=i+1;
			}
			
		}
	
		System.out.println(output[0]+"-"+output[1]);
	}
}
