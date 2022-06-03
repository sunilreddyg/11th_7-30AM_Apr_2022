package mq.java.variables;

public class Sample_Variables 
{
	int a=100;
	String name="ma";
	
	void method1()
	{
		boolean flag=true;
		System.out.println(flag);
	}
	
	public static void main(String[] args) 
	{
		
		System.out.println(new Sample_Variables().a);
		System.out.println(new Sample_Variables().name);
		new Sample_Variables().method1();

	}



}
