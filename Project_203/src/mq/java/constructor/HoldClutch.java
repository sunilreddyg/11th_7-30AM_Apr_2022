package mq.java.constructor;

public class HoldClutch 
{

	//Class Constructor /Instance
	public HoldClutch() 
	{
		System.out.println("Holding Clutch");
	}
	
	//Instant Method
	void FirstGear()
	{
		System.out.println("Changed to Fisrst Gear");
	}
	
	//Instant Method
	void SecondGear()
	{
		System.out.println("Changed to SeCond Gear");
	}
	
	//Instant Method
	void ThirdGear()
	{
		System.out.println("Changed to Third Gear");
	}

	public static void main(String[] args) 
	{
		new HoldClutch().FirstGear();
		new HoldClutch().SecondGear();
		new HoldClutch().ThirdGear();
		
		

	}

}
