package com.xworkz.overloading.app;

public class Elevator {

	String direction;
	int noOfFloors;
	
	public void move()
	{
		System.out.println("invocking move in Mouse");
		move("moving up");
		move(6);
	}

	public void move(String direction) {
		System.out.println("invocking String in Mouse ");
		System.out.println("Direction:" + direction);
	}

	public void move(int quantity) {
		System.out.println("invocking int in Mouse ");
		System.out.println("No of Floors:" + noOfFloors);
	}

	public void move(String working, int quantity) {
		System.out.println("invocking String,int in Mouse ");
		move(direction);
		move(noOfFloors);

	}	
}
