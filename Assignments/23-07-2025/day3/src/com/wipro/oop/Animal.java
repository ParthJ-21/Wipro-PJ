package com.wipro.oop;

public abstract class Animal {
	int cmHeight;
	String Color;
	int Legs;
	String Name;
	public Animal(int cmHeight, String color, int legs,String name) {
		super();
		this.cmHeight = cmHeight;
		Color = color;
		Legs = legs;
		Name = name;
	}
	
	 public void eat() {
	        System.out.println(Name + " is eating.");
	    }

	    public void sleep() {
	        System.out.println(Name + " is sleeping.");
	    }

	    public void breathe() {
	        System.out.println(Name + " is breathing.");
	    }

	    // Abstract methods
	    public abstract void makeSound();
	    public abstract void move();
}

