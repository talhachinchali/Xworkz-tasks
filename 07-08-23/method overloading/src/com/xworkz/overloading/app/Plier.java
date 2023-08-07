package com.xworkz.overloading.app;

public class Plier {

	String material;
	double price;

	public void tool() {
		System.out.println("invocking tool in Plier");
		tool("calcio");
		tool(280);
	}

	public void tool(String material) {
		System.out.println("invocking String in Plier ");
		System.out.println("Material:" + material);
	}

	public void tool(double price) {
		System.out.println("invocking double in Plier ");
		System.out.println("Price:" + price);
	}

	public void tool(String material, double price)
	{
		System.out.println("invocking String,double in Plier ");
		tool(material);
		tool(price);

	}
}
