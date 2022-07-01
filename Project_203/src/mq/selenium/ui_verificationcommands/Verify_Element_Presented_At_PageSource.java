package ui_verificationcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Verify_Element_Presented_At_PageSource 
{

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\MINDQ\\Desktop\\recent_drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://outlook.live.com/owa/");
		
		
		//Get Current window PageSource
		String Pagesource=driver.getPageSource();
		
		if(Pagesource.contains("Sign in"))
		{
			WebElement Signin_button=driver.findElement(By.xpath("(//a[contains(.,'Sign in')])[1]"));
			Signin_button.click();
			Thread.sleep(5000);
		}
		else
		{
			System.out.println("Element Not presented at source");
		}
		
		
		
		//To Handle Dynamic Elements we can also use try-catch block..
		try {
			driver.findElement(By.xpath("//input[@id='i0116']")).sendKeys("info");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Run Continued");
		
		
		
		

	}

}
