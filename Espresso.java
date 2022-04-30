package com.perscholas.cafe1;

import java.util.Scanner;

public class Espresso extends Product {
	private boolean extraShot;
	private boolean macchiato;
	
	Espresso()
	{
		super();
		this.extraShot=false;
		this.macchiato=false;
	}
	Espresso(String name, double price, String description,boolean sugar, boolean milk)
	{
		super(name,price,description);
		this.extraShot=milk;
		this.macchiato=sugar;
	}
	

	public boolean isExtraShot() {
		return extraShot;
	}
	public void setExtraShot(boolean extraShot) {
		this.extraShot = extraShot;
	}
	public boolean isMacchiato() {
		return macchiato;
	}
	public void setMacchiato(boolean macchiato) {
		this.macchiato = macchiato;
	}
	
	public double calculateProductSubtotal() {
		double producttotal = quantity*price;
		if(extraShot)
		{
			producttotal += quantity*2;
		}
		
		if(macchiato)
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
		System.out.println("Would you like extra shot with the Espresso");	
        String answer2 = scan.nextLine();
        boolean yn2 = (answer2.equalsIgnoreCase("Yes")?true:false);
        setExtraShot(yn2);
		//espresso.calculateProductTotal();
        System.out.println("Would you like macchiato  with the Espresso");	
        String answer3 = scan.nextLine();
        boolean yn3 = (answer3.equalsIgnoreCase("Yes")? true:false);
        setMacchiato(yn3);		
	}
	@Override
	public void printOptions() {
		System.out.println("Extra Shot: "+ (isExtraShot() ? "Yes(Add $2)" : "No") + " " + "Macchiato: " + (isMacchiato() ? "Yes (Add $1)" : "No"));
	}

}
