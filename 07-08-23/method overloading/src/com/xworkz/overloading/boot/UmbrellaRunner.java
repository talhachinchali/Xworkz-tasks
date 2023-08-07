package com.xworkz.overloading.boot;

import com.xworkz.overloading.app.Ladder;
import com.xworkz.overloading.app.Stapler;
import com.xworkz.overloading.app.Umbrella;
import com.xworkz.overloading.app.Gadget;

public class UmbrellaRunner {

	public static void main(String[] args) {
		System.out.println("invocking main in Umbrella");

		Umbrella umbrella = new Umbrella();
		{
			umbrella.protect();
			umbrella.protect(false, "pink");
			System.out.println("\n");
		}

		Stapler stapler = new Stapler();
		{
			stapler.pin();
			stapler.pin(false, 10);
			System.out.println("\n");
		}
		Ladder ladder = new Ladder();
		ladder.fold();
		ladder.fold("Iron", 6);
		System.out.println("\n");
	}

	Gadget gadget = new Gadget();
	{
		gadget.electronic();
		gadget.electronic("Mobile", 25000);
	}
}
