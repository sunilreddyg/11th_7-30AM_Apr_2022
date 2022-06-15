package mq.selenium.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Verify_Dropdown_is_Multiple_Selection_Type 
{

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();    				//Open ChromeBrowser
		driver.get("http://bridgeqsystems.com/demo.php");		//Load webpage
		driver.manage().window().maximize(); 
		
		
		WebElement SelectMenuLink=driver.findElement(By.xpath("//button[contains(.,'Select Menu')]"));
		SelectMenuLink.click();
		Thread.sleep(3000);
		
		
		WebElement Dropdown1=driver.findElement(By.id("exampleFormControlSelect1"));
		boolean flag1=new Select(Dropdown1).isMultiple();
		System.out.println("Dropdown Multiple selection status is --> "+flag1);
		
		
		WebElement Dropdown2=driver.findElement(By.id("exampleFormControlSelect2"));
		boolean flag2=new Select(Dropdown2).isMultiple();
		System.out.println("Dropdown Multiple selection status is --> "+flag2);
		

	}

}
