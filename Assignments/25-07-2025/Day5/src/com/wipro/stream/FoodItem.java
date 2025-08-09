package com.wipro.stream;

public class FoodItem {
	String Name;
    String Type;
    String cuisine;
    double price;
	public FoodItem(String name, String type, String cuisine, double price) {
		super();
		Name = name;
		Type = type;
		this.cuisine = cuisine;
		this.price = price;
	}
	@Override
	public String toString() {
		return "FoodItem [Name=" + Name + ", Type=" + Type + ", cuisine=" + cuisine + ", price=" + price + "]";
	}
    
}
