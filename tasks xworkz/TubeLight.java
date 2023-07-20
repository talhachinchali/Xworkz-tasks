class TubeLight
{
	String compantName;
	int volts;
	int price;
	
	TubeLight()
	{
		System.out.println("invoking no-argument constructor in TubeLight");
		this.compantName="LED";
		this.volts=50;
		this.price=100;
	}
	
	TubeLight(String compantName,int volts,int price)
	{
		System.out.println("invoking String, int, int constructor in TubeLight");
		this.compantName=compantName;
		this.volts=volts;
		this.price=price;
	}
	
}