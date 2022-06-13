package mq.selenium.Editbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearText_method 
{

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();    //Open ChromeBrowser
		driver.get("http://facebook.com");		//Load webpage
		driver.manage().window().maximize(); 
		
		//Clear Exisiting text at entry box
		driver.findElement(By.id("email")).sendKeys("Darshan");
		driver.findElement(By.id("email")).clear();
		
		
		//Note:--> Clear method only works for editboxes
		
	}

}
