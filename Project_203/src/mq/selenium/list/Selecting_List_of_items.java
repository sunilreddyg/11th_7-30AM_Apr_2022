package mq.selenium.list;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selecting_List_of_items 
{

	public static void main(String[] args) throws Exception 
	{
		
		/*
		 * Note:--> In webpages list boxes look like dropdowns,
		 * 			In this case we can't use select methods
		 * 			on list of items selection..	
		 */
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();   			 //Open ChromeBrowser
		driver.get("https://www.hdfcbank.com/");		//Load webpage
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		//Step1:--> Click on listbox to display list of items
		driver.findElement(By.linkText("Select Product Type")).click();
		
		//Step2:--> Selecting one of listbox item using click method
		driver.findElement(By.xpath("//li[@value='4'][contains(.,'Loans')]")).click();
		
		
		//Step1:--> Open List of items using click method
		driver.findElement(By.xpath("//a[contains(.,'Select Product')]")).click();
		//Step2:--> Selecting one of listbox item using click method
		driver.findElement(By.xpath("//li[@value='4'][contains(.,'SmartEMi')]")).click();
		
		
		
		
	}

}
