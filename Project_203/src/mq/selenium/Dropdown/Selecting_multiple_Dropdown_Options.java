package mq.selenium.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selecting_multiple_Dropdown_Options {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();    				//Open ChromeBrowser
		driver.get("http://bridgeqsystems.com/demo.php");		//Load webpage
		driver.manage().window().maximize(); 
		
		WebElement SelectMenuLink=driver.findElement(By.xpath("//button[contains(.,'Select Menu')]"));
		SelectMenuLink.click();
		Thread.sleep(3000);
		
		//Get Dropdown Status Single Option or Multiple option type
		WebElement Country=driver.findElement(By.id("exampleFormControlSelect2"));
		boolean flag=new Select(Country).isMultiple();
		
		
		if (flag) 
		{
			Select CountrySelector=new Select(Country);
			CountrySelector.deselectAll();
			CountrySelector.selectByIndex(1);
			CountrySelector.selectByIndex(3);
			
			//Deselcting any single option from dropdown
			CountrySelector.deselectByIndex(1);
			
		} else 
		{
			System.out.println("Dropdown is  not multiple type");
		}
		
		
		
	}

}
