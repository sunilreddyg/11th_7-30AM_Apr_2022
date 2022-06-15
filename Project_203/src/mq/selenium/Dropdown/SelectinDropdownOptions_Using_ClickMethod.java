package mq.selenium.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectinDropdownOptions_Using_ClickMethod 
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();    	//Open ChromeBrowser
		driver.get("https://www.amazon.com/");		//Load webpage
		driver.manage().window().maximize(); 
		
		//By Identifying xpath for dropdown option we can use click method for dropdown selection
		WebElement ComputerOption=driver.findElement(By.xpath("//option[contains(.,'Computers')]"));
		ComputerOption.click();
	}

}
