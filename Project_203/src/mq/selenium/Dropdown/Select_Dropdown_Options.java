package mq.selenium.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_Dropdown_Options 
{

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();    //Open ChromeBrowser
		driver.get("http://facebook.com");		//Load webpage
		driver.manage().window().maximize(); 
		
		//Clicking on registration link
		WebElement SignupLink=driver.findElement(By.linkText("Sign Up"));
		SignupLink.click();
		
		//Selecting dropdown using Option Name
		WebElement DOB_day=driver.findElement(By.id("day"));
		new Select(DOB_day).selectByVisibleText("29");
		
		//Selecting dropdown using Option value property
		WebElement DOB_month=driver.findElement(By.id("month"));
		new Select(DOB_month).selectByValue("10");
		
		//Selecting dropdown using Option index number
		WebElement DOB_year=driver.findElement(By.id("year"));
		new Select(DOB_year).selectByIndex(22);
		

	}

}
