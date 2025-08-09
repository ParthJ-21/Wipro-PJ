package com.wipro.basic;

public class ANDOR {
	public static void main(String[] args) {
		float x = 21.00f;

		if((x>0) && (x>100000)) {
			System.out.println("Positive and Large");
		}
		else if((x>0) && (x<100000)) {
			System.out.println("Positive");
		}
		else if((x>0) && (x<1)) {
			System.out.println("Positive and Small");
		}
		else if((x<0) && (Math.abs(x)<1)) {
			System.out.println("Negative and Small");
		}
		else if((x<0) && (Math.abs(x)>1)) {
			System.out.println("Negative ");
		}
		else if((x<0) && (Math.abs(x)>100000)) {
			System.out.println("Negative and Large");
		
	}
		else  {
			System.out.println(x);
		
	}
}
}
