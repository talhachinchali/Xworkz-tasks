class Flight {
	public static void main(String[] args) {
	  String flight1 = "Qatar";
	  String flight2 = "Delta";
	  String flight3 = "Emirates";
	  String flight4 = "British AirWays";
	  String flight5 = "AirFrance";
	  String flight6 = "JetBlue";
	  String flight7 = "Continental";
		  
	  String[] flights = {flight1, flight2, flight3, flight4, flight5, flight6, flight7};
		  
	  for (int i = 0; i < flights.length; i++) {
		System.out.println("Flight at " + i + " is " + flights[i]);
	  }
		  
	  System.out.println("==========================");
		  
	  flights[0] = "IndiGo";
	  flights[1] = "SpiceJet";
		  
	  for (int i = flights.length - 1; i >= 0; i--) {
		System.out.println("Flight at " + i + " is " + flights[i]);
	  }
	}
  }
  