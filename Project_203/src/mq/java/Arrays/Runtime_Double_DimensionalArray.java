package mq.java.Arrays;

public class Runtime_Double_DimensionalArray {

	public static void main(String[] args) 
	{
		
		
		String userinfo[][]=
			{
					{"Ajay","903024881"},
					{"Aakash","909090909"},
					{"Harish","989989898"},
			};
		
		System.out.println(userinfo[1][1]);
		
		
		
		
		//Double Dimensional runtime array to store group of values
		Object obj[][]= 
			{
				new Object[] {"Iphone",75000.00},	
				new Object[] {"Samsung",50000.00},	
				new Object[] {"Oneplus",45000.00},	
			};
		
		
		System.out.println(obj[1][0]);
		
		
		

	}

}
