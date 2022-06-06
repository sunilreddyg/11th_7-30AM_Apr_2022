package mq.java.methods.instantmethods;

public class ClassA 
{
	
	void method1()
	{
		System.out.println("method1 Executed");
	}
	
	void method2()
	{
		System.out.println("method2 Executed");
	}
	
	void method3()
	{
		method1();
		method2();
	}
	
	public static void main(String args[])
	{
		
		//From Main method any non static method we should call
		//Through object creation only
		
		ClassA ref=new ClassA();
		ref.method3();
		
	}

}
