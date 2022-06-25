package switchcommands.Frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SwitchTo_Frame_Using_IndexNumber 
{

	public static void main(String[] args) 
	{
		//setting runtime environment variable
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();     //Launching browser method
		driver.get("https://jqueryui.com/menu/");
	    driver.manage().window().maximize();
	    
	    //switch to frame using index number..
	    driver.switchTo().frame(0);
	    
	    
	    WebElement Ele=driver.findElement(By.id("ui-id-4"));
	    new Actions(driver).moveToElement(Ele).perform();
	    
	    
	   

	}

}
