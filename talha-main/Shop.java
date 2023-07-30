package com.bussiness.association.app;

public class Shop {
	 public Salesman salesman = new Salesman();
	 
	 public void sellProduct()
	 {
		 System.out.println("Invoking sellProduct() method in Shop");
		 if(salesman!=null)
		 {
			 salesman.makeSale();
			 
		 }
		 else
		 {
			 System.err.println("salesman has null vlaue, so can't invoke makeSales()");
		 }
	 }
	 
	 public void addProduct()
	 {
		 System.out.println("Invoking addProduct() method in Shop");
		 if(salesman!=null)
		 {
			 salesman.checkInventory();
			 
		 }
		 else
		 {
			 System.err.println("salesman has null vlaue, so can't invoke checkInventory()");
		 }
	 }

}
