package com.xworkz.overloading.app;

public class Mouse {

	boolean working;
	int quantity;
	
	public void click()
	{
		System.out.println("invocking click in Mouse");
		click(true);
		click(100);
	}

	public void click(boolean working) {
		System.out.println("invocking boolean in Mouse ");
		System.out.println("Working:" + working);
	}

	public void click(int quantity) {
		System.out.println("invocking int in Mouse ");
		System.out.println("Quantity:" + quantity);
	}

	public void click(boolean working, int quantity) {
		System.out.println("invocking String,double in Mouse ");
		click(working);
		click(quantity);

	}	
}

