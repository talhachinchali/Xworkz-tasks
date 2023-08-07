package com.xworkz.overloading.app;

public class Stapler {

	boolean isLoadded;
	int capacity;

	public void pin() {
		System.out.println("invocking pin in Stapler");
		pin(true);
		pin(5);
	}

	public void pin(boolean isLoadded) {
		System.out.println("invocking boolean in Stapler ");
		System.out.println("Is Loadded:" + isLoadded);
	}

	public void pin(int capacity) {
		System.out.println("invocking int in Stapler ");
		System.out.println("Capacity:" + capacity);
	}

	public void pin(boolean isLoadded, int capacity) {
		System.out.println("invocking boolean,int in Stapler ");
		pin(isLoadded);
		pin(capacity);

	}

}
