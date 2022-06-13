package mq.selenium.Link;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Workingwith_linktext
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();    //Open ChromeBrowser
		driver.get("http://facebook.com");		//Load webpage
		driver.manage().window().maximize(); 
		
		
		//Identifying object using linkname
		driver.findElement(By.linkText("Sign Up")).click();

		
		//Identifying object using linkname
		driver.findElement(By.linkText("Log In")).click();
		
		
		//Navigate to instagram page
		driver.get("http://instagram.com");
		
		//identifying using linktext property
		driver.findElement(By.linkText("Locations")).click();
		
		//Identifying object using partial linktext
		driver.findElement(By.partialLinkText("States")).click();
		
		
		
		
	}

}
