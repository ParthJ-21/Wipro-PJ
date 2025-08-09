package com.wipro.basic;

public class Switch {

	public static void main(String[] args) {
		char x = 'r';
		switch(x) {
		case 'c':
			System.out.println("Circle");
			break;
		case 's':
			System.out.println("Square");
			break;
		case 'r':
			System.out.println("Rectangle");
			break;
		default:
			System.out.println("Unknown Shape");
		}

	}

}
