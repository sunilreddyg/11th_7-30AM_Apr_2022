package mq.java.Arrays;

public class StaticArray_Single_Dimensional_Array 
{

	public static void main(String[] args) 
	
	{
		//How to store group of strings
		String browsers[]=new String[4];
		browsers[0]="chrome";
		browsers[1]="firefox";
		browsers[2]="edge";
		browsers[3]="safari";
		
		
		String selectedBrowser=browsers[2];
		System.out.println(selectedBrowser);
		
		
		//How to store group of integer values
		int num[]=new int[5];
		num[0]=100;
		num[1]=200;
		num[2]=300;
		num[3]=400;
		num[4]=500;
		
		
		System.out.println(num[3]);
		
		
		
		//How to store Different values like int,String,boolean in one array
		Object obj[]=new Object[4];
		obj[0]="iphone";
		obj[1]=75000.00;
		obj[2]=5;
		obj[3]=true;
		
		//Print output had default casting
		System.out.println(obj[0]);
		System.out.println(obj[1]);
		System.out.println(obj[2]);
		System.out.println(obj[3]);
		
		
		//Casting object to required Datatype
		String phone=(String)obj[0];
		double price=(double)obj[1];
		int quantity=(int) obj[2];
		boolean status=(boolean) obj[3];
		
		System.out.println(phone+"  "+price+"    "+quantity+"    "+status);
		
		
		
		

	}

}
