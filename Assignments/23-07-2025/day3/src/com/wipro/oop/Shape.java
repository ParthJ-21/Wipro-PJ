package com.wipro.oop;

public class Shape {
	public boolean empty;
	public String color;
	public Shape(boolean empty, String color) {
		super();
		this.empty = empty;
		this.color = color;
		
		
	}
	public boolean isEmpty() {
		return empty;
	}
	public void setEmpty(boolean empty) {
		this.empty = empty;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Shape [empty=" + empty + ", color=" + color + "]";
	}
	
}
