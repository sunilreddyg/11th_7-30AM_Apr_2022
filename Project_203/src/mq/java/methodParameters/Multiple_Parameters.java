package mq.java.methodParameters;

public class Multiple_Parameters 
{
	
	void userlogin(String name,String password)
	{
		System.out.println(name);
		System.out.println(password);
	}
	
	void userdetails(String name, int Age, double salary)
	{
		System.out.println(name);
		System.out.println(Age);
		System.out.println(salary);
	}

	public static void main(String[] args) {
		
		Multiple_Parameters obj=new Multiple_Parameters();
		obj.userlogin("Sunil", "Sunil@123");
		obj.userdetails("Raju", 23, 50000.00);

	}

}
