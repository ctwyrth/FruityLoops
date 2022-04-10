package com.ctwyrth.fruityloops.models;

public class Item {
	// MEMBER VARIABLES
	private String name;
	private double price;
	
	// CONSTRUCTOR
	public Item(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	// METHODS
	
	// GETTERS & SETTERS
	public String getName() {
		return this.name;
	}
	public void setName(String n) {
		this.name = n;
	}
	
	public double getPrice() {
		return this.price;
	}
	public void setPrice(double p) {
		this.price = p;
	}

}
