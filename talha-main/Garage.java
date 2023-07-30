package com.bussiness.association.app;

public class Garage {
	public Mechanic mechanic  = new Mechanic();
	
	public void hireMechanic()
	{
		System.out.println("invoking hireMechanic() method in Garage");
		if(mechanic!=null)
		{
			mechanic.repaireVehicle();
		}
		else {
			System.out.println("mechanic has null value, so cann't invoke repaireVehicle()");
		}
	}
	
	public void getMechanicBySpeciality()
	{
		System.out.println("invoking getMechanicBySpeciality() method in Garage");
		if(mechanic!=null)
		{
			mechanic.performMaintenance();
		}
		else {
			System.out.println("mechanic has null value, so cann't invoke performMaintenance()");
		}
	}

}
