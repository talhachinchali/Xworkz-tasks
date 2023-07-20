class Biscuit {
	public static void main(String[] args) {
	  String biscuit1 = "ParleG";
	  String biscuit2 = "Monaco";
	  String biscuit3 = "GoodDay";
	  String biscuit4 = "KrackJack";
	  String biscuit5 = "Orio";
	  String biscuit6 = "DarkFantasy";
	  String biscuit7 = "Sunfeast";
	  
	  String[] biscuits = {biscuit1, biscuit2, biscuit3, biscuit4, biscuit5, biscuit6, biscuit7};
	  
	  for (int pos = 0; pos < biscuits.length; pos++) {
		System.out.println("Biscuit at " + pos + " is " + biscuits[pos]);
	  }
	  
	  System.out.println("==========================");
	  
	  biscuits[0] = "MarieGold";
	  biscuits[1] = "Bourbon";
	  
	  for (int pos = biscuits.length - 1; pos >= 0; pos--) {
		System.out.println("Biscuit at " + pos + " is " + biscuits[pos]);
	  }
	}
  }
  