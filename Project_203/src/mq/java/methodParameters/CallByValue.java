package mq.java.methodParameters;

public class CallByValue 
{
	//Method with integer parameter
	void method1(int varname)
	{
		System.out.println(varname);
	}
	
	//method with String parameter
	void method2(String varname)
	{
		System.out.println(varname);
	}
	
	//Method With boolean parameter
	void  method3(boolean varname)
	{
		System.out.println(varname);
	}
	
	//method with double parameter
	void method4(double varname)
	{
		System.out.println(varname);
	}
	
	//Method with char parameter
	void method5(char varname)
	{
		System.out.println(varname);
	}

	public static void main(String[] args) 
	{
		CallByValue obj=new CallByValue();
		obj.method1(100); 		//Passing integer argument
		obj.method2("Iphone"); //Passing Characters as arguments
		obj.method3(true);     //Passing boolean argument
		obj.method4(1200.00);
		obj.method5('A');
	}

}
