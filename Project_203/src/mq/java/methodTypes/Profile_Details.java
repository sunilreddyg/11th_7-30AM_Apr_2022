package mq.java.methodTypes;

public class Profile_Details
{
	
	static Profile getDetails()
	{
		return new Profile();
	}
	
	public static void main(String args[])
	{
		
		String StudentName=Profile_Details.getDetails().name;
	}
	

}
