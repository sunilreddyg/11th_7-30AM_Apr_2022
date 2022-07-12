package ui_verification_commands.getText;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import ui_verificationcommands.Page_Verification_Commands;

public class Verify_TextVisible_At_Webpage 
{

	public static void main(String[] args) throws Exception 
	{
		/*
		 * Scenario:  Verify Email validation using blank
		 * 		Given site url is "http://outlook.com"
		 * 		And click on Sign in button
		 * 		When User Enter invalid email
		 * 		And click on next button
		 * 		Then verify Error message displayed "Enter a valid email address, phone number, or Skype name."
		 */
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://outlook.com");
		driver.manage().window().maximize();
		
		
		WebElement Signin_btn=driver.findElement(By.xpath("(//a[contains(.,'Sign in')])[1]"));
		Signin_btn.click();
		Thread.sleep(3000);
		
		WebElement Email=driver.findElement(By.xpath("//input[@id='i0116']"));
		Email.sendKeys("info.dsnr@gmail.com");
		
		WebElement Next_btn=driver.findElement(By.xpath("//input[@id='idSIButton9']"));
		Next_btn.click();
		Thread.sleep(3000);
	
		String Exp_text="That Microsoft account doesn't exist. Enter a different account or get a new one.";
		
		
		String pageVisibleText=driver.findElement(By.tagName("body")).getText();
		System.out.println(pageVisibleText);
		
		if(pageVisibleText.contains(Exp_text))
			System.out.println("Testpass. Expected text visible at webpage");
		else
			System.out.println("Testfail, Expected text not visible at webpage");
		
		
	}
}
