package mq.java.Conditional_Statements;

public class Switch_Command {

	public static void main(String[] args) 
	{
	
		/*
		 * Switch is also support multile decision
		 * same as else-if. But only differnece
		 * switch execute only required case instead
		 * of all decisions...
		 */
		
		String month="feb";
		
		switch (month) 
		{
		case "jan":
			System.out.println("10% Discount");
			break;
			
		case "feb":
			System.out.println("20% Discount");
			break;
			
		case "mar":
			System.out.println("30% Discount");
			break;

		default: System.out.println("No Offer");
			break;
		}
		
		

	}

}
