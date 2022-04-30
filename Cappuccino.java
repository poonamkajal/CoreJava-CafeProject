package com.perscholas.cafe1;

import java.util.Scanner;

public class Cappuccino extends Product {
	private boolean peppermint;
	private boolean whippedCream;
	
	Cappuccino()
	{
		super();
		this.peppermint=false;
		this.whippedCream=false;
	}
	Cappuccino(String name, double price, String description, boolean peppermint, boolean whippedCream)
	{
		super(name,price,description);
		this.peppermint=peppermint;
		this.whippedCream=whippedCream;
	}
	

	
	public boolean isPeppermint() {
		return peppermint;
	}
	public void setPeppermint(boolean peppermint) {
		this.peppermint = peppermint;
	}
	public boolean isWhippedCream() {
		return whippedCream;
	}
	public void setWhippedCream(boolean whippedCream) {
		this.whippedCream = whippedCream;
	}
	
	public double calculateProductSubtotal() {
		double producttotal = quantity*price;
		if(peppermint)
		{
			producttotal += quantity*2; 
		}
		
		if(whippedCream)
	    {
			
	    	producttotal += quantity*1;
	    }
		return producttotal;
	}
	@SuppressWarnings("resource")
	@Override
	public void addOptions() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Quantity: ");
		setQuantity(scan.nextInt());
        scan.nextLine();
		System.out.println("Would you like  peppermint with the Cappuccino");	
        String answer4 = scan.nextLine();
        boolean yn4 = (answer4.equalsIgnoreCase("Yes")?true:false);
        setPeppermint(yn4);
        System.out.println("Would you like whipped cream  with the Cappuccino");	
        String answer5 = scan.nextLine();
        boolean yn5 = (answer5.equalsIgnoreCase("Yes")? true:false);
        setWhippedCream(yn5);	
	}
	@Override
	public void printOptions() {
		System.out.println("Peppermint: "+ (isPeppermint() ? "Yes(Add $2)" : "No") + " " + "Whipped Cream: " + (isWhippedCream() ? "Yes (Add $1)" : "No"));
	}

	}


