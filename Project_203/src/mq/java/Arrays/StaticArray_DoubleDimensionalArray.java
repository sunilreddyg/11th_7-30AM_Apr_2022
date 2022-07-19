package mq.java.Arrays;

public class StaticArray_DoubleDimensionalArray {

	public static void main(String[] args) 
	{
		//Declaration of Static Double dimensional array
		String data[][]=new String[3][2];
		
		//assigning first row data
		data[0][0]="Ajay";
		data[0][1]="Ajay@gmail.com";
		
		//assigning first row data
		data[1][0]="Nizam";
		data[1][1]="Nizam@gmail.com";
		
		//assigning first row data
		data[2][0]="Raj";
		data[2][1]="Raj@gmail.com";
		
		
		System.out.println(data[2][1]);
		
		System.out.println("Number of rows data available is --> "+data.length);
		
		
	}

}
