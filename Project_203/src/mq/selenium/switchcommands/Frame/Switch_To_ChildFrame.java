package switchcommands.Frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switch_To_ChildFrame {

	public static void main(String[] args) {
		
		
		//setting runtime environment variable
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();     //Launching browser method
		driver.get("https://www.redbus.in/bus-tickets/");
	    driver.manage().window().maximize();
	    
	    
	    WebElement HelpLink=driver.findElement(By.xpath("//a[@href='https://www.redbus.in/info/redcare']"));
	    HelpLink.click();
	    
	    
	    WebElement ParentFrameObj=driver.findElement(By.xpath("//iframe[@class='modalIframe']"));
	    driver.switchTo().frame(ParentFrameObj);
	    
	    
	    WebElement ChildFrame=driver.findElement(By.xpath("//iframe[@title='Sign in with Google Button']"));
	    driver.switchTo().frame(ChildFrame);
	    
	    //Click Link under child frame
	    WebElement GoogeLink=driver.findElement(By.xpath("(//span[contains(.,'Sign in with Google')])[1]"));
	    GoogeLink.click();
	    
	    
	    //Get controls back to parent frame from child frame
	    driver.switchTo().parentFrame();
	    //Get Controls back to Mainpage from parent frame
	    driver.switchTo().defaultContent();
	    
	    
	    //Click on close icon
	    WebElement CloseIcon=driver.findElement(By.xpath("//i[@class='icon-close']"));
	    CloseIcon.click();
	    
	    
	    
	}

}
