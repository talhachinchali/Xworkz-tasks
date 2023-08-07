package com.xworkz.overloading.app;

public class Spects {

	public String type;
	public double power;

	public void lens() {
		System.out.println("invocking lens in spects");
		lens(1.5);
		lens("concave");
	}

	public void lens(double power) {
		System.out.println("invocking lens double in spects");
		System.out.println("power:" + power);
	}

	public void lens(String type) {
		System.out.println("invocking lens String in spects");
		System.out.println("type:" + type);
	}

	public void lens(double power, String type) {
		System.out.println("invocking lens double,string in spects");
		lens(power);
		lens(type);
	}
}
