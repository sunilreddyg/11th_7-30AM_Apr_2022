package mq.java.variables.library;

import org.openqa.selenium.WebDriver;

public class TestSuite1 
{
	
	public static void main(String[] args) 
	{
		
		Repository obj=new Repository();
		obj.driverpath="C:\\Users\\MINDQ\\Desktop\\recent_drivers";
		obj.url="https://opensource-demo.orangehrmlive.com/";
		
		obj.setupbrowser();
		
		WebDriver driver=null;
		driver=obj.getDriver(); 
		//This method get browser refence from repository class and assign to Current WebDriver class
	
		obj.userlogin("Admin","admin123");
		
		
		
	}

}
