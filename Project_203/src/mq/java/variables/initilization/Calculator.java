package mq.java.variables.initilization;

public class Calculator 
{
	
	int a;
	int b;
	
	public Calculator(int x, int y) 
	{
		//Assigning value to global variable through constructor..
		a=x;
		b=y;
	}
	
	
	public void add()
	{
		System.out.println(a+b);
	}
	
	public void sub()
	{
		System.out.println(a-b);
	}
	
	public void mul()
	{
		System.out.println(a*b);
	}

	public static void main(String[] args)
	{
		
		new Calculator(100, 200).add();
		new Calculator(12, 6).sub();
		new Calculator(100, 5).mul();

	}

}
