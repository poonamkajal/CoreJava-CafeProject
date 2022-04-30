package com.perscholas.cafe1;

public abstract class Product {
	private String name;
	   protected double price;
	   private String description;
	   protected int quantity;
	   public abstract double calculateProductSubtotal();
		public abstract void addOptions();
		public abstract void printOptions();
	   Product()
	   {
		   
	   }
	   Product(String name, double price, String description)
	   {
		   this.name = name;
		   this.price = price;
		   this.description=description;
	   }
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	

}
