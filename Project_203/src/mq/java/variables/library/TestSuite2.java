package mq.java.variables.library;

import org.openqa.selenium.WebDriver;

public class TestSuite2 {

	public static void main(String[] args) {
		
		Repository obj=new Repository();
		obj.driverpath="C:\\Users\\MINDQ\\Desktop\\recent_drivers\\";
		obj.url="https://opensource-demo.orangehrmlive.com/";

		obj.LaunchBrowser("chrome");
		WebDriver driver;
		driver=obj.getDriver();
		obj.LoadWebpage();
		
		obj.userlogin("Admin","admin123");
		System.out.println(driver.getCurrentUrl());
		
	}

}
