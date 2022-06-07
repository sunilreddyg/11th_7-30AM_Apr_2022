package mq.java.methods.staticmethods;

public class MouseCommands 
{
	
	public static void LeftClick()
	{
		System.out.println("Left Click performed");
	}
	
	public static void RightClick()
	{
		System.out.println("Right Click Perfomed");
	}
	
	public static void DoubleClick()
	{
		System.out.println("Double click performed");
	}

	public static void main(String[] args) 
	{
		LeftClick();
		RightClick();
		DoubleClick();

	}

}
