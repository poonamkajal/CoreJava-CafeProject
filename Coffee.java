package com.perscholas.cafe1;

import java.util.Scanner;

public class Coffee extends Product{
		private boolean sugar;
		private boolean milk;
		
		Coffee()
		{
			super();
			this.milk=false;
			this.sugar=false;
		}
		Coffee(String name, double price, String description,boolean sugar, boolean milk)
		{
			super(name,price,description);
			this.milk=milk;
			this.sugar=sugar;
		}

		public boolean isSugar() {
			return sugar;
		}
		public void setSugar(boolean sugar) {
			this.sugar = sugar;
		}
		public boolean isMilk() {
			return milk;
		}
		public void setMilk(boolean milk) {
			this.milk = milk;
		}
		
		public double calculateProductSubtotal() {
	       double producttotal = quantity*price;
			return producttotal;
		    
		}
		@SuppressWarnings("resource")
		@Override
		public void addOptions() {
			Scanner scan = new Scanner(System.in);
			System.out.println("Quantity: ");
			setQuantity(scan.nextInt());
	        scan.nextLine();
			System.out.println("Would you like sugar with the coffee");	
	        String answer = scan.nextLine();
	        boolean yn = (answer.equalsIgnoreCase("Yes")?true:false);
	        setSugar(yn);
	        System.out.println("Would you like milk with the coffee");	
	        String answer1 = scan.nextLine();
	        Boolean yn1 = (answer1.equalsIgnoreCase("Yes")?true:false);
	        setMilk(yn1);
		}
		
		@Override
		public void printOptions() {
			System.out.println("Sugar: "+ (isSugar() ? "Yes" : "No") + " " + "Milk: " + (isMilk() ? "Yes" : "No"));
		}

}
