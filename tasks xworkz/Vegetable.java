class Vegetable {
	public static void main(String[] args) {
	  int priceCarrot = 40;
	  int priceBroccoli = 20;
	  int priceSpinach = 50;
	  int priceZucchini = 35;
	  int priceCelery = 10;
	  int priceEggplant = 15;
	  int priceCabbage = 24;
	  
	  int[] vegetablePrices = {priceCarrot, priceBroccoli, priceSpinach, priceZucchini, priceCelery, priceEggplant, priceCabbage};
	  
	  for(int i = 0; i < vegetablePrices.length; i++) {
		System.out.println("Price at " + i + " is " + vegetablePrices[i]);
	  }
	  
	  System.out.println("===========================");
	  
	  vegetablePrices[0] = 60;
	  vegetablePrices[1] = 70;
	  
	  for(int i = vegetablePrices.length-1; i >=0; i--) {
		System.out.println("Price at " + i + " is " + vegetablePrices[i]);
	  }
	}
 }
 