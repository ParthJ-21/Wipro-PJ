package com.wipro.basic;

public class shortest {
	public static void main(String[] args) {
		String s =" She was so hungry ";
		String[] words = s.split(" ");
		
        String shortest = words[0];
        for (int i = 1; i < words.length; i++) {
            if (words[i].length() < shortest.length()) {
                shortest = words[i];
            }
        }
        System.out.println(shortest);
	}
}
