package mq.java.variables;

public class Sample_Variables 
{
	//Global variable [Instant Variable]
	int a=100;          
	String name="mq";
	
	//Global Variable [Static Variable]
	static double price=13000.00;
	
	void method1()
	{
		boolean flag=true;     //Local Variable
		System.out.println(flag);
	}
	
	public static void main(String[] args) 
	{
		
		System.out.println(new Sample_Variables().a);
		System.out.println(new Sample_Variables().name);
		System.out.println(Sample_Variables.price);
		new Sample_Variables().method1();

	}



}
