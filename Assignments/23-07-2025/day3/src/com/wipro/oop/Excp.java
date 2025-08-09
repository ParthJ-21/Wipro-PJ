package com.wipro.oop;

public class Excp {
	public static void main(String[] args) {
		String fName = null;

        try {
            // This will throw a NullPointerException
            String upperName = fName.toUpperCase();
            System.out.println("Upper case name: " + upperName);
        } catch (NullPointerException e) {
            System.out.println("Name is null.");
        }

        System.out.println("Program continues.");
	}

}
