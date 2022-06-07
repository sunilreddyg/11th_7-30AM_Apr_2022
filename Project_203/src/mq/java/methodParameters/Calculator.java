package mq.java.methodParameters;

public class Calculator 
{
	int a;
	int b;
	
	public Calculator(int var1, int var2) 
	{
		a=var1;
		b=var2;
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
		Calculator obj=new Calculator(20, 10);
		obj.add();
		obj.mul();
		obj.sub();
	}

}
