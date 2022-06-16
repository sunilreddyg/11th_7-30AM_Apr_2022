package mq.selenium.AutoCompleteEditboxes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Example_AutoComplete_Editbox {

	public static void main(String[] args) throws Exception 
	{
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/travel/flights/search");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		new Actions(driver).keyDown(Keys.LEFT_SHIFT).sendKeys(Keys.TAB).sendKeys(Keys.BACK_SPACE).perform();
		Thread.sleep(2000);
		
		WebElement FromEB=driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		new Actions(driver).sendKeys(FromEB,"Delhi").perform();
		Thread.sleep(2000);
		WebElement DelhiCity=driver.findElement(By.xpath("//div[@class='zsRT0d'][contains(.,'New Delhi')]"));
		new Actions(driver).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
		
	}

}
