package mq.java.variables.library;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

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
	
	
	/*
	 * Keyword:--> Launch Browser [Chrome,Firefox, IE]
	 * Author:-->
	 * Parameters Used:-->  Local Parameter
	 */
	public void LaunchBrowser(String browsername)
	{
		switch (browsername) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", driverpath+"chromedriver.exe");
			driver=new ChromeDriver();
			break;

		case "firefox":
			System.setProperty("webdriver.gecko.driver", driverpath+"geckodriver.exe");
			driver=new FirefoxDriver();
			break;
			
		case "ie":
			System.setProperty("webdriver.ie.driver", driverpath+"IEDriverServer.exe");
			driver=new InternetExplorerDriver();
			break;

		default: System.out.println("Browser name is mismatched");
			break;
		}
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
