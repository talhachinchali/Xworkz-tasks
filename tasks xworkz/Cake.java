class Cake
{
	static void tasty(String name, String type, String bakeryName, int price, int noOfPieces)
	{
		System.out.println("Invoking  method tasty() in class Cake ");
		if(name=="Honey Cake")
		{
			System.out.println("This is Honey Cake");
		}
		else
		{
		  System.out.println("Different from Honey Cake");	
		}
		
		if(price<50)
		{
			System.out.println("Buy a Cake");
		}
		else{
			System.out.println("Go for another cake");
		}
		
		if(noOfPieces<5)
		{
			System.out.println("Only 4 members can share the Cake");
		}
		else
			System.out.println("Any number of people can Share the cake");
	}
	
}