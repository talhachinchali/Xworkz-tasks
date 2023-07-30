package com.bussiness.association.boot;

import com.bussiness.association.app.PowerBank;

public class PowerBankRunner {

	public static void main(String[] args) {
		System.out.println("Invoking main in PowerBankRunner");
		
		PowerBank powerBank = new PowerBank();
		powerBank.providePower();
		powerBank.rechargePowerBank();
		

	}

}
