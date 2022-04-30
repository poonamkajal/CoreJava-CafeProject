package com.perscholas.cafe1;

import java.util.ArrayList;
import java.util.Scanner;

public class CafeApp {

	private static Store store = new Store();

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		ArrayList<Product> cart = store.getShoppingcart();
		
		String menu = "";
		while (!menu.equals("4")) {
			showMenu();
			menu =scan.next();
			switch(menu)
			{
			case "1" :
				Coffee coffee = new Coffee();
				coffee.setName("Coffee");
				coffee.setPrice(3.49);
		        coffee.addOptions();
		        cart.add(coffee);
		        break;
			case "2":
				Cappuccino cappuccino = new Cappuccino();
				cappuccino.setName("Cappuccino");
                cappuccino.setPrice(4.99);
		        cappuccino.addOptions();
		        cart.add(cappuccino);
		        break;
			case "3":
				Espresso espresso = new Espresso();
				espresso.setName("Espresso");
				espresso.setPrice(3.49);
		        espresso.addOptions();
		        cart.add(espresso);
		        break;
			case "4":
				System.out.println("Proceed to checkout.");
				store.checkout();
				break;
			}
			
			
		}
		scan.close();

	}

	private static void showMenu() {
		System.out.println("Please select from the following menu: "+"\n1: Coffee"+"\n2: Cappuccino"+"\n3: Espresso"+"\n4: Check Out");

		
	}

}
