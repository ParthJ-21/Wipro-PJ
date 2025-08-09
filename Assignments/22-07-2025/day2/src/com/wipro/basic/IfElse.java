package com.wipro.basic;
//import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		/*Scanner s = new Scanner(System.in);
		System.out.println("Enter Shape:");
		String Shape1 = s.nextLine();*/
		char x = 'c';
		if(x == 'c') {
			System.out.println("Shape: Circle");
		}else if(x=='r') {
			System.out.println("Shape: rectangle");
		}else if(x == 's') {
			System.out.println("Shape: square");
		}else {
			System.out.println("Shape Unknown");
		}
	}
}	

