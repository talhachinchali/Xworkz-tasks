class Grocery {
  public static void main(String[] agrs) {
    String grocery1 = "Apple";
    String grocery2 = "Banana";
    String grocery3 = "Onion";
    String grocery4 = "Peas";
    String grocery5 = "Tomato";
    String grocery6 = "Bringjal";
    String grocery7 = "Grapes";
	
    String[] groceries = {grocery1, grocery2, grocery3, grocery4, grocery5, grocery6, grocery7};
	
    for (int i = 0; i < groceries.length; i++) {
      String gro = groceries[i];
      System.out.println("Grocery at " + i + " is " + gro);
    }
	
    System.out.println("==============================");
	
    groceries[0] = "Strawberry";
    groceries[1] = "Wheat";
	
    for (int i = groceries.length - 1; i >= 0; i--) {
      String gro = groceries[i];
      System.out.println("Grocery at " + i + " is " + gro);
    }
  }
}
