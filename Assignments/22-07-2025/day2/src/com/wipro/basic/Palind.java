package com.wipro.basic;

public class Palind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x = "Madam";
		/*String reversed = "";
		int y = x.length() - 1;
        for (int i = y; i >= 0; i--) {
            reversed += x.charAt(i);
        }*/
		String reversed = new StringBuilder(x).reverse().toString();

		if (x.equalsIgnoreCase(reversed)) {
            System.out.println("Is palindrome.");
        } else {
            System.out.println("Noi a palindrome.");
        }
	}

}
