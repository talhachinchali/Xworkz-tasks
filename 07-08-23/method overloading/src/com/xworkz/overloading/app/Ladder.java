package com.xworkz.overloading.app;

public class Ladder {

	String material;
	double height;

	public void fold() {
		System.out.println("invocking fold in Ladder");
		fold("wood");
		fold(5.5);
	}

	public void fold(String material) {
		System.out.println("invocking String in Ladder ");
		System.out.println("Material:" + material);
	}

	public void fold(double height) {
		System.out.println("invocking double in Ladder ");
		System.out.println("Height:" + height);
	}

	public void fold(String material, double height) {
		System.out.println("invocking String,double in Ladder ");
		fold(material);
		fold(height);

	}

}
