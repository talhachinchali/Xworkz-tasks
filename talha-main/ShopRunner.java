package com.bussiness.association.boot;

import com.bussiness.association.app.Shop;

public class ShopRunner {

	public static void main(String[] args) {
		System.out.println("Invoking main in ShopRunner");
		
		Shop shop  = new Shop();
		shop.sellProduct();
		shop.addProduct();

	}

}
