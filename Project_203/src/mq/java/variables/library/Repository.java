package mq.java.variables.library;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Repository 
{
	public WebDriver driver=null;
	public String driverpath;
	public String url;
	
	public void openchrome()
	{
		System.setProperty("webdriver.chrome.driver", driverpath+"\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
	}
	
	public void LoadWebpage()
	{
		driver.get(url);
	}
	
	
	public void setupbrowser()
	{
		openchrome();
		LoadWebpage();
	}
	
	
	public WebDriver getDriver()
	{
		return driver;
	}
	
	
	public void userlogin(String uid,String pwd)
	{
		driver.findElement(HRM_OBJ.Login_UID).sendKeys("Admin");
		driver.findElement(HRM_OBJ.Login_PWd).sendKeys("admin123");
		driver.findElement(HRM_OBJ.Login_Submit_button).click();
	}
	

}
