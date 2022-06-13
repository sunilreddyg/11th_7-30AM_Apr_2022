package mq.selenium.Editbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TypeText_into_Editbox {

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();    //Open ChromeBrowser
		driver.get("http://outlook.com");		//Load webpage
		driver.manage().window().maximize();    //Maxmize window
		
		
		//Clicking on Sign in button
		driver.findElement(By.xpath("(//a[contains(.,'Sign in')])[1]")).click();
		
		
		//Type Text into Editbox and Press Enter Keyboard key
		driver.findElement(By.name("loginfmt"))
		.sendKeys("sunilreddy.gajjala@outlook.com"+Keys.ENTER);

		Thread.sleep(5000);
		
		//Type Text into Editbox and Press Enter Keyboard key
		driver.findElement(By.name("passwd"))
		.sendKeys("Hello@12345"+Keys.ENTER);
		
		
	}

}
