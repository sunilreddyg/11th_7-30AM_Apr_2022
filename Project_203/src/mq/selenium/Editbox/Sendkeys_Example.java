package mq.selenium.Editbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sendkeys_Example {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();    //Open ChromeBrowser
		driver.get("http://facebook.com");		//Load webpage
		driver.manage().window().maximize(); 

		//OPening registration form by clicking on create New account button
		driver.findElement(By.xpath("//a[contains(.,'Create New Account')]")).click();
		
		
		Thread.sleep(4000);
		driver.findElement(By.name("firstname"))
		.sendKeys("Ajay"+Keys.TAB+"Krishna"+Keys.TAB+"AjayKrisha");
		
		
		
		//Selecting dropdown option using keyboard shortcut
		driver.findElement(By.name("birthday_day")).sendKeys("28");
		
		//Selecting dropdown option using keyboard keys
		driver.findElement(By.name("birthday_month")).sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN);
			
		
		//Selecting Radio button using keyboard shortcuts
		driver.findElement(By.xpath("//input[@value='2']"))
		.sendKeys(Keys.SPACE);
		
		
		/*
		 * Note:--> Dropdown options and Radio button to 
		 * 			select selenium have separate commands
		 * 			No need to follow above syntaxes..
		 */
		
	}

}
