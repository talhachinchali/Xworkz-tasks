package com.xworkz.overloading.app;

public class Umbrella {

	boolean isOpen;
	String color;

	public void protect() {
		System.out.println("invocking protect in Umbrella");
		protect(true);
		protect("Red");
	}

	public void protect(boolean isOpen) {
		System.out.println("invocking boolean in protect ");
		System.out.println("Is Open:" + isOpen);
	}

	public void protect(String color) {
		System.out.println("invocking String in protect ");
		System.out.println("Color:" + color);
	}

	public void protect(boolean isOpen, String color) {
		System.out.println("invocking boolean,String in protect ");
		protect(isOpen);
		protect(color);

	}

}
