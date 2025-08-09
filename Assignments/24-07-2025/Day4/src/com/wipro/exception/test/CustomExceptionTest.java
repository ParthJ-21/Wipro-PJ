package com.wipro.exception.test;

import exception.CustomExp;

public class CustomExceptionTest {
	public static void main(String[] args) {
		try {
			checkMonth(4);
		}catch (CustomExp e) {
			e.printStackTrace();
		}
	}
	static void checkMonth(int x) throws CustomExp {
		if((x<1) || (x>12)) {
			throw new CustomExp("Invalid Month");
		}
		else {
			System.out.println("Valid Month");
		}
	}
}
