package com.bussiness.association.boot;

import com.bussiness.association.app.Hotel;

public class HotelRunner {

	public static void main(String[] args) {
		System.out.println("Invokinf main in HotelRunner");
		
		Hotel hotel = new Hotel();
		hotel.getMenu();
		hotel.orderFood();

	}

}
