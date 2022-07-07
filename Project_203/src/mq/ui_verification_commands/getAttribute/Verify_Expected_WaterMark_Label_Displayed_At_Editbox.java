package ui_verificationcommands.getAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Expected_WaterMark_Label_Displayed_At_Editbox {

	public static void main(String[] args) 
	{
		
		/*
		 * Testcase:--> Verify email and password contains 
		 * 				Expected water mark labels
		 */
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();     
		driver.get("https://www.facebook.com/");
	    driver.manage().window().maximize();
	    
	    
	    WebElement Email=driver.findElement(By.id("email"));
	    WebElement Password=driver.findElement(By.id("pass"));
	    
	    
	   String Email_PlaceHolder= Email.getAttribute("placeholder");
	   String Password_PlaceHolder=Password.getAttribute("placeholder");
	    
		if(Email_PlaceHolder.contains("Email address or phone number"))
			System.out.println("Expected placeholder presetned at Email entry box");
		else
			System.out.println("Expected placholder not presented for Email entry box");

		
		if(Password_PlaceHolder.contains("Password"))
			System.out.println("Expected placeholder presented at password entry box");
		else
			System.out.println("Expected placeholder not presented at password entry box");
	}

}
