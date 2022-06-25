package switchcommands.Frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SwitchToFrame_Using_NavigationMethod {

	public static void main(String[] args) {
		
		//setting runtime environment variable
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();     //Launching browser method
		driver.get("https://www.redbus.in/bushire/?");
	    driver.manage().window().maximize();
	      
	    //Navigate to frame using url
	    driver.navigate().to("https://www.redbus.in/ryde/req.html?hideBackArrow=true&isDesktop=true");

	    WebElement Oustation=driver.findElement(By.xpath("(//div[contains(@class,'u4EAg')])[1]"));
	    new Actions(driver).click(Oustation).perform();
	    
	    //Select Options
	    driver.findElement(By.xpath("(//div[@class='llEWHIN0JBjiJgjIcuyh'])[1]")).click();
	    
	    
	    //Navigate back to main page
	    driver.navigate().back();
	    
	}

}
