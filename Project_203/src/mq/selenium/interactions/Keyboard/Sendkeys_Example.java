package interactions.Keyboard;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sendkeys_Example {

	public static void main(String[] args) 
	{
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");    
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.sampledomain.com");
		driver.manage().window().maximize();
		
		
		
		//Sendkeys from WebElemnet class
		WebElement Element=driver.findElement(By.id("X"));
		Element.sendKeys(Keys.TAB,Keys.TAB);
		
		
		//Sendkeys from action class
		new Actions(driver).sendKeys(Keys.TAB).pause(2000)
		.sendKeys(Keys.TAB).perform();
		
		//Sendkeys Command on selected location
		new Actions(driver).sendKeys(Element, "HYD").pause(3000)
		.sendKeys(Keys.ARROW_DOWN).pause(1000).sendKeys(Keys.ENTER).perform();
		
	}

}
