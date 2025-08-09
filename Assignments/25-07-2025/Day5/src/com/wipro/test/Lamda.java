package com.wipro.test;

import com.vipro.any.Greet;

public class Lamda {
	public static void main(String[] args) {
		Greet greet =()->{System.out.println("Hello Lambda");};
		greet.sayHello();
	}
}
