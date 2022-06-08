package mq.java.methodParameters;

public class CallByReference 
{

	public void actionmethods(Calculator cal)
	{
		cal.add();
		cal.mul();
	}


	public static void main(String[] args) 
	{
		CallByReference obj=new CallByReference();
		Calculator cal=new Calculator(10, 30);
		obj.actionmethods(cal);
		
		obj.actionmethods(new Calculator(300, 200));

	}

}
