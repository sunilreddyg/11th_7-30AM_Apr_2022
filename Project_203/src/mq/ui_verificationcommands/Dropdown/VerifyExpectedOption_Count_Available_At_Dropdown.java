package ui_verificationcommands.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class VerifyExpectedOption_Count_Available_At_Dropdown {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();    				//Open ChromeBrowser
		driver.get("http://facebook.com/reg");		//Load webpage
		driver.manage().window().maximize(); 
		
		
		WebElement MonthDropdown=driver.findElement(By.id("month"));
		int OptionCount=new Select(MonthDropdown).getOptions().size();
		if(OptionCount==12)
			System.out.println("Expected OptionCount available");
		else
			System.out.println("Expected OptionCount not available");
		

	}

}
