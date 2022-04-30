package com.perscholas.cafe1;

import java.util.ArrayList;

public class Store {
	ArrayList<Product> shoppingcart = new ArrayList<>();

	public ArrayList<Product> getShoppingcart() {
		return shoppingcart;
	}
	
	public void checkout() {
		double salesTaxPct = 0.07;
		double purchaseTotal = 0;
		for (Product p : shoppingcart) {
			System.out.println("Item: " + p.getName() + " " + "Qty: " + p.getQuantity() + " " + "Subtotal: " + p.calculateProductSubtotal());
			p.printOptions();
			purchaseTotal += p.calculateProductSubtotal();
		}
		
		System.out.println("Purchase Subtotal: " + purchaseTotal);
		double salesTax = ((double)Math.round(purchaseTotal * salesTaxPct * 100))/100;

		System.out.println("Sales Tax: " + salesTax);
		
		System.out.println("Purchase Total: " + ((double)Math.round((purchaseTotal + salesTax) * 100))/100);
			
	}
}

