package com.xworkz.overloading.app;

public class Gadget {

	String name;
	double price;

	public void electronic() {
		System.out.println("invocking fold in electronic");
		electronic("calcio");
		electronic(280);
	}

	public void electronic(String name) {
		System.out.println("invocking String in electronic ");
		System.out.println("Name:" + name);
	}

	public void electronic(double price) {
		System.out.println("invocking double in electronic ");
		System.out.println("Price:" + price);
	}

	public void electronic(String name, double price) {
		System.out.println("invocking String,double in electronic ");
		electronic(name);
		electronic(price);

	}
}
