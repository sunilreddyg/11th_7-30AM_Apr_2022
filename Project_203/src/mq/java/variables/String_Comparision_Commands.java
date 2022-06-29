package mq.java.variables;

public class String_Comparision_Commands {

	public static void main(String[] args) {
		
		
		/*
		 * String:-->
		 * 			=> String allow to store group of characters
		 * 			=> String is a non primitive
		 * 			=> string is not only datatype also called as class
		 * 			=> String class contains set of events to validate
		 * 				stored characters
		 */
		
		
		/*
		 * Eqauls:-->
		 * 			Method verify equal comparison between two strings
		 * 			and return boolena value true/false.
		 * 
		 * 		Note:-- comparision is case sensitive..
		 */
		
		String Exp_res="Transaction Completed";
		String Act_res="Transaction completed";
		
		boolean flag=Exp_res.equals(Act_res);
		System.out.println("Equal Comparision is ---> "+flag);
		
		
		/*
		 * EqualIgnorecase:-->
		 * 		Method verify equla comparision between two
		 * 		string by ignoring casesensitive.
		 */
		boolean flag1=Exp_res.equalsIgnoreCase(Act_res);
		System.out.println("Ignorecase comparision is --> "+flag1);
		
		
		/*
		 * Contains:-->
		 * 		Method verify partial sequence characters available
		 * 		at overall characters and return boolean value true/false
		 */
		String Status="Ammount 10,000 transfered";
		boolean flag3=Status.contains("transfered");
		System.out.println("Partial characters available is --> "+flag3);
		
		
		
	}

}
