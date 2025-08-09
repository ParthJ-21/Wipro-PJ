package com.wipro.thread;

import java.util.ArrayList;

public class MyThread extends Thread{
	public static void main(String[] args) throws InterruptedException {
		ArrayList<String> names = new ArrayList<>();
        names.add("Parth");
        names.add("Rajesh");
        names.add("Jaiswal");
        names.add("Amit");
        names.add("Mansi");
        names.add("Urmil");
        names.add("Jayanta");
        names.add("Esha");
        
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < names.size(); i++) {
                String name = names.get(i);
                char x = Character.toLowerCase(name.charAt(0));
                if (x=='a' || x=='e' || x=='i' || x=='o' || x=='u') {
                    names.set(i, name.toUpperCase());
                 }
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < names.size(); i++) {
                String name = names.get(i);
                char y = Character.toLowerCase(name.charAt(0));
                if (y!='a' || y!='e' || y!='i' || y!='o' || y!='u') {
                    names.set(i, name.toLowerCase());
                }
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();


        for (String name : names) {
            System.out.println(name);
        }
	}
}
