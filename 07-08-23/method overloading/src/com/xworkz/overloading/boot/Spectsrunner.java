package com.xworkz.overloading.boot;

import com.xworkz.overloading.app.Hotel;
import com.xworkz.overloading.app.IronBox;
import com.xworkz.overloading.app.Spects;

public class Spectsrunner {

	public static void main(String[] args) {
		System.out.println("invocking main Spectsrunner");

		Spects spects = new Spects();
		spects.lens();
		spects.lens(1.3, "convex");

		System.out.println("\n");

		IronBox ironBox = new IronBox();
		ironBox.ironing();
		ironBox.ironing(210, false);

		System.out.println("\n");

		Hotel hotel = new Hotel();
		hotel.prepFood();
		hotel.prepFood(5, "Bavangudi");
	}

}
