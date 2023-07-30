package com.bussiness.association.app;

public class Browser {
	public Internet internet = new Internet();
	
	public void open()
	{
		System.out.println("Invoking open() method in Browser");
		if(internet != null)
		{
			internet.connect();
		}
		else {
			System.err.println("internet has null value, so can't invoke connect() method");
		}
	}
	
	public void goBack()
	{
		System.out.println("invoking goBack() method in Browser");
		if(internet != null)
		{
			internet.disconnect();
		}
		else {
			System.err.println("internet has null value, so can't invoke disconnect() method");
		}
		
	}

}
