package com.xworkz.overloading.app;

public class Hotel {

	double rating;
	String address;
	
	public void prepFood()
	{
		System.out.println("invocking prepFood in Hotel");
		prepFood(4.5);
		prepFood("Malleswaram");
	}
	public void prepFood(double rating)
	{
		System.out.println("invocking double in prepFood ");
		System.out.println("Rating:"+rating);
	}
	public void prepFood(String address)
	{
		System.out.println("invocking String in prepFood ");
		System.out.println("Adress:"+address);
	}
	public void prepFood(double rating,String address)
	{
		System.out.println("invocking double,String in prepFood ");
		prepFood(rating);
		prepFood(address);
		
	}
	
}
