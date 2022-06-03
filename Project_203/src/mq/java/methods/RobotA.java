package mq.java.methods;



public class RobotA
{
	//Reusable method
	void turnon()
	{
		System.out.println("Robot is Turned on");
	}
	
	//Reusable method
	void turnoff()
	{
		System.out.println("Robot is turned off");
	}

	//Runnable method
	public static void main(String args[])
	{
		new RobotA().turnon();
		new RobotA().turnoff();
	}
	
	
}
