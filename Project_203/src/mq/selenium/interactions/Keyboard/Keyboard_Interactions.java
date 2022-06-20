package interactions.Keyboard;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard_Interactions {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");    
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/travel/flights");
		driver.manage().window().maximize();
		
		
		WebElement From=driver.findElement(By.xpath("(//input[contains(@type,'text')])[1]"));
		new Actions(driver).click(From)
		.pause(3000)
		.sendKeys(Keys.BACK_SPACE)
		.pause(2000)
		.sendKeys("Delhi")
		.pause(2000)
		.sendKeys(Keys.ARROW_DOWN)
		.sendKeys(Keys.ENTER).perform();
		
		
		WebElement To=driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		new Actions(driver).click(To)
		.sendKeys("HYD")
		.pause(1000)
		.sendKeys(Keys.ARROW_DOWN)
		.pause(1000)
		.sendKeys(Keys.ENTER)
		.perform();
	}

}
