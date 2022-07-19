package mq.java.Arrays;

public class Runtime_Single_Dimensional_Array {

	public static void main(String[] args)
	{
		
		
		
		//Store group of strings
		String browser[]= {"chrome","firefox","safari","opera","edge","ie","epic","netscape"};
		System.out.println(browser[3]);
		
		for (String string : browser) 
		{
			System.out.println(string);
			
		}
		
		
		//Store group of integers
		int num[]= {100,200,300,400,500,600};
		System.out.println(num[4]);
		
		
		
		//How to store Different values like int,String,boolean in one array
		Object obj[]= {"iphone",74000.00,5,false};
		
		//Casting object to required Datatype
		String phone=(String)obj[0];
		double price=(double)obj[1];
		int quantity=(int) obj[2];
		boolean status=(boolean) obj[3];
		
		System.out.println(phone+"  "+price+"    "+quantity+"    "+status);
		
		

	}

}
