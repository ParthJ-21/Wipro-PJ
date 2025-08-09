package com.wipro.oop;

public class Human extends Animal {
	
	public Human(int cmHeight, String color, int legs, String name) {
		super(cmHeight, color, legs, name);
	}

	@Override
	public void makeSound() {
        System.out.println(Name + " chirps: Tweet tweet!");		
	}

	@Override
	public void move() {
        System.out.println(Name + " flies in the sky.");		
	}
	

}
