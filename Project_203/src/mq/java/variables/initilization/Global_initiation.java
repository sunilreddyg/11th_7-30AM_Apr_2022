package mq.java.variables.initilization;

public class Global_initiation 
{
	

	public static void main(String[] args) 
	{
		//Initiating variable and storing value
		int a=100;
		a=200;
		System.out.println(a);
		
		
		//Initiating variable globally and later assign value
		int b;
		b=300;
		b=400;
		System.out.println(b);
		
		//Initiating group of global variables
		int x,y,z;
		x=100; y=200; z=300;
		System.out.println(x+y+z);
		
		
		boolean flag=true;
		String name = null;
		if(flag)
		{
			name="Webdriver";
		}
		System.out.println(name);
		
		
		
		
		
		
	}

}
