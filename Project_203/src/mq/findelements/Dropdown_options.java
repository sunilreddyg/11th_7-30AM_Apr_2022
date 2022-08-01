package findelements;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown_options {

	public static void main(String[] args) throws Exception {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SUNIL\\OneDrive\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/reg");
		driver.manage().window().maximize();
		
		
		WebElement Year_Dropdown=driver.findElement(By.name("birthday_year"));
		List<WebElement> AllOptions=Year_Dropdown.findElements(By.tagName("option"));
		System.out.println("Option count is --> "+AllOptions.size());
		
		
		//Applying foreach loop to read all objects
		for (WebElement EachOption : AllOptions) 
		{
			EachOption.click();
			Thread.sleep(100);
		}
		
		
		WebElement Month_Dropdown=driver.findElement(By.name("birthday_month"));
		List<WebElement> AllMonthOptions=Month_Dropdown.findElements(By.tagName("option"));
		System.out.println("Month Option Count is ---> "+AllMonthOptions.size());
		
		
		//Apply for loop to read all Collection objects
		for (int i = 0; i < AllMonthOptions.size(); i++) 
		{
			//Get Single obejct from list using it's index number
			AllMonthOptions.get(i).click();
			Thread.sleep(100);
		}
		
		
	}

}
