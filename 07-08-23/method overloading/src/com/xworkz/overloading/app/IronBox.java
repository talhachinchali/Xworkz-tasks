package com.xworkz.overloading.app;

public class IronBox {

	int temperature;
	boolean powerStatus;

	public void ironing() {
		System.out.println("invocking IronBox");
		ironing(180);
		ironing(true);
	}

	public void ironing(int temperature) {
		System.out.println("invocking ironing int in IronBox");
		System.out.println("Temperature:" + temperature);
	}

	public void ironing(boolean powerStatus) {
		System.out.println("invocking ironing boolean in IronBox");
		System.out.println("PowerStatus:" + powerStatus);
	}

	public void ironing(int temperature, boolean powerStatus) {
		System.out.println("invocking int boolean in IronBox");
		ironing(temperature);
		ironing(powerStatus);

	}
}
