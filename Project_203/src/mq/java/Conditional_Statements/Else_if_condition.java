package mq.java.Conditional_Statements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Else_if_condition 
{

	public static void main(String[] args) 
	{
		
		/*
		 * else-if:-->
		 * 			multiple decision statement take place here
		 */
		
		String browser="firefox";
		
		if(browser.equals("chrome"))
		{
			System.out.println("Chrome Browser is Selected");
		}
		else if (browser.equals("firefox")) 
		{
			System.out.println("Firefox Browser is selected");
		}
		else if (browser.equals("ie")) 
		{
			System.out.println("Ie browser is selected");
		}
		else
		{
			System.out.println("No browser is selected");
		}
		
		
		
		//Cross Browser Test
		WebDriver driver=null;
		String drivers_path="C:\\Users\\MINDQ\\Desktop\\recent_drivers\\";
		String BrowserName="chrome";
		
		if(BrowserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", drivers_path+"chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(BrowserName.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", drivers_path+"geckodriver.exe");
			driver=new FirefoxDriver();
		}
		
		
		driver.get("http://facebook.com");
		System.out.println(driver.getTitle());
		
		
				
		
		

	}

}
