package com.bussiness.association.app;

public class PowerBank {
	public Battery battery = new Battery();
	
	public void providePower()
	{
		System.out.println("Invoking providePower() method in PowerBank");
		if(battery != null)
		{
			battery.chargPowerBank();
		}
		else {
			System.err.println("battery has null value, so can't invoke chargPowerBank() method");
		}
		
	}
	
	public void rechargePowerBank()
	{
		System.out.println("Invoking rechargePowerBank() method in PowerBank");
		if(battery != null)
		{
			battery.getBatteryChargeLevel();
		}
		else {
			System.err.println("battery has null value, so can't invoke getBatteryChargeLevel() method");
		}
	}

}
