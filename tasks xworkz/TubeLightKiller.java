class TubeLightKiller
{
	public static void main(String[] args)
	{
		System.out.println("Invoking main in TubeLightKiller");
		TubeLight tubeLight= new TubeLight();
		System.out.println("compantName "+tubeLight.compantName);
	    System.out.println("volts "+tubeLight.volts);
	    System.out.println("price "+tubeLight.price);
	    System.out.println("=============================");
	
	    TubeLight tubeLight1 = new TubeLight("Neon TubeLight",40,30);
	    System.out.println("compantName "+tubeLight1.compantName);
	    System.out.println("Volts "+tubeLight1.volts);
	    System.out.println("Price "+tubeLight1.price);
	
	}
}