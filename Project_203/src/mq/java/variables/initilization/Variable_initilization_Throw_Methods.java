package mq.java.variables.initilization;

public class Variable_initilization_Throw_Methods 
{

	int a;
	int b;
	
	void method1(int x, int y)
	{
		a=x;
		b=y;
	}
	
	
	void method2()
	{
		System.out.println(a+b);
	}
	
	
	public static void main(String[] args) 
	{
		Variable_initilization_Throw_Methods obj=new Variable_initilization_Throw_Methods();
		obj.method1(100, 200);
		obj.method2();

	}

}
