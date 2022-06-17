package interactions.Mouse;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Hover_on_Element 
{

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Performing hover action at selected location
		WebElement AccountList=driver.findElement(By.xpath("//span[contains(.,'Account & Lists')]"));
		new Actions(driver).moveToElement(AccountList).perform();
	
		//Performing click action using mouse commands..
		WebElement CreateList=driver.findElement(By.xpath("//span[contains(.,'Create a List')]"));
		new Actions(driver).click(CreateList).perform();
		
		
		
		
		

	}

}
