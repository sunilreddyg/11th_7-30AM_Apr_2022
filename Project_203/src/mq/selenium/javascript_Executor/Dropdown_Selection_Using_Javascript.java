package javascript_Executor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown_Selection_Using_Javascript 
{

	public static void main(String[] args) throws Exception
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com/");
		driver.manage().window().maximize();
		
		
		//Enable javascript execution at automation browser
		JavascriptExecutor js=((JavascriptExecutor)driver);
		
		//Click Function using javascript
		WebElement CreateButton=driver.findElement(By.xpath("//a[contains(.,'Create New Account')]"));
		js.executeScript("arguments[0].click()", CreateButton);
		Thread.sleep(4000);
		
		
		//Selecting Dropdown option using javascript
		js.executeScript("document.getElementById('day').selectedIndex =10");
		js.executeScript("document.getElementById('month').value='12'");

	}

}
