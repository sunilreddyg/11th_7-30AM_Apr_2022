package mq.java.variables;

public class String_Comparision_Commands {

	public static void main(String[] args) 
	{
		
		
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
		
		
		/*
		 * SubString:-->
		 * 		This method will get substring characters from 
		 * 		main string..
		 */
		String Account_Number="123485854444";
		String LastDigits=Account_Number.substring(6);
		System.out.println("last 6 Digits are --> "+LastDigits);
		
		String MiddleDigits=Account_Number.substring(4,8);
		System.out.println("Middle 6 Digits are ---> "+MiddleDigits);
		
		
		/*
		 * length:-->
		 * 		Method return number of characters available 
		 * 		in String..
		 */
		String MobileNumber="9030248855";
		boolean len=MobileNumber.length()==10;
		System.out.println("MobileNuber available in 10 Digits --> "+len);
		
		
		/*
		 * trim:-->
		 * 		Method trim extra spaces available at string
		 * 		=> Only trim left and right spaces
		 */
		String ZipCode="    500037     ";
		System.out.println("Before trim zipcode length is ---> "+ZipCode.length());
		String NewZipCode=ZipCode.trim();
		System.out.println("After trim zipcode length is ---> "+NewZipCode.length());
		

		/*
		 * isempty:-->
		 * 		method return characters available status in 
		 * 		boolean format
		 * 		=> Return true when string doesn't have any charactes
		 * 		=> Return false when string has characters
		 */
		String var="";
		String var1="Hello";
		System.out.println("var empty status is ---> "+var.isEmpty());
		System.out.println("Var1 empty statu is ---> "+var1.isEmpty());
		
		
		/*
		 * charsAt:-->
		 * 		Method return single character using index number
		 */
		String browsername="Chrome,Firefox";
		char ch=browsername.charAt(7);
		System.out.println("charcters available at 7th index number is =>"+ch);
		

		/*
		 * startswith:-->
		 * 			Method verify given string started with expected characters
		 * 			and return boolean value
		 */
		String IFSC_Code="HDFC000178";
		boolean flag5=IFSC_Code.startsWith("HDFC");
		System.out.println("Starts with Comparision is --> "+flag5);
		
		/*
		 * endswith:-->
		 * 			Method verify given string ends with expected characters
		 * 			and return boolean value
		 */
		boolean flag6=IFSC_Code.endsWith("000178");
		System.out.println("ends with Comparision is --> "+flag6);
		
		
		/*
		 * tolowercase:-->
		 * 			Convert all uppercase characters in lowercase
		 */
		String toolname="WebDriver";
		System.out.println(toolname.toLowerCase());
		System.out.println(toolname.toUpperCase());
		
		/*
		 * replace:-->
		 * 		Replace old characters with New characters 
		 */
		String Price="$40,000";
		String NewPrice=Price.replace("$", "").replace(",", "");
		System.out.println("Price after replace characters is --> "+NewPrice);
		
		
		/*
		 * Concat:-->
		 * 			Add new string to existing charactes
		 */
		String New_browser=browsername.concat(",Safari");
		System.out.println(New_browser);
		
		String f="Hi";
		String s="Users";
		System.out.println(f+s);
		System.out.println(f.concat(s));
		
		
	}

}
