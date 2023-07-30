package com.bussiness.association.app;

public class Hotel {
	public Cook cook = new Cook();
	
	public void getMenu()
	{
		System.out.println("Invoking getMenu() method in Cook");
		if(cook!=null)
		{
			cook.prepareIngredients();
		}
		else
		{
			System.err.println("cook has null value, so can't invoke prepareIngredients()");
		}
		
	}
	
	public void orderFood()

	{
		System.out.println("Invoking orderFood() method in Cook");
		if(cook!=null)
		{
			cook.cookRecipe();
		}
		else
		{
			System.err.println("cook has null value, so can't invoke cookRecipe()");
		}
	}
}
