package mq.java.methodTypes;

public class MethodTypes 
{
	//Void method doesn't return any values
	void method1()
	{
		int a=10;
	}
	
	/*
	 * => Other than void all methods return values
	 * => Return value should match with method type
	 * => Return value should be declare at end of the method
	 * => Finally It Return value to method name
	 */
	int method2()
	{
		int b=200;
		return b;	
	}
	
	String method3()
	{
		String name="Ajay";
		return name;
	}
	
	boolean method4()
	{
		return true;
	}
	
	double method5()
	{
		return 1200.23;
	}

	public static void main(String[] args) {
		
		MethodTypes obj=new MethodTypes();
		obj.method1();
		
		//Integer return method
		int x=obj.method2();
		System.out.println(x);
		
		//String return method
		String y=obj.method3();
		System.out.println(y);
		
		//Boolean return method
		boolean flag=obj.method4();
		System.out.println(flag);
		
		//Decimal return type 
		double price=obj.method5();
		System.out.println(price);
	}

}
