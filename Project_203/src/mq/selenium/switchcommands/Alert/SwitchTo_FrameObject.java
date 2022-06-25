package switchcommands.Alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SwitchTo_FrameObject {

	public static void main(String[] args) throws Exception {
		
		
		
		//setting runtime environment variable
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();     //Launching browser method
		driver.get("https://www.redbus.in/bushire/?");
	    driver.manage().window().maximize();
	    
	    
	    //Switch to frame using webElement reference
	    WebElement FrameElement=driver.findElement(By.xpath("//object[contains(@width,'430')]"));
	    driver.switchTo().frame(FrameElement);
	    Thread.sleep(3000);
	    
	    WebElement Oustation=driver.findElement(By.xpath("(//div[contains(@class,'u4EAg')])[1]"));
	    new Actions(driver).click(Oustation).perform();
	    
	    
	    
	    

	}

}
