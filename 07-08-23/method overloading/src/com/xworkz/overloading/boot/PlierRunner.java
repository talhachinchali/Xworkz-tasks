package com.xworkz.overloading.boot;

import com.xworkz.overloading.app.Elevator;
import com.xworkz.overloading.app.Mouse;
import com.xworkz.overloading.app.Plier;

public class PlierRunner {

	public static void main(String[] args) {
		System.out.println("invocking main in PlierRunner");
		
		Plier plier=new Plier();
		plier.tool();
		plier.tool("Rod",600);
		System.out.println("\n");
		
		Mouse mouse =new Mouse();
		mouse.click();
		mouse.click(false,450);
		System.out.println("\n");
		
		Elevator elevator=new Elevator();
		elevator.move();
		elevator.move("moving down",7);
	}
	
}
