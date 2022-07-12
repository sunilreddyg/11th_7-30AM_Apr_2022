package ui_verificationcommands.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Verifying_Dropdown_Is_Accepting_Multiple_Options {

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
			
			int Count=CountrySelector.getAllSelectedOptions().size();
			if(Count > 1)
				System.out.println("Dropdown is accepting multiple options");
			else
				System.out.println("Dropdown is not accepting multiple options");
			
			
			//Read all Selected Optons
			String FirstObject=CountrySelector.getAllSelectedOptions().get(0).getText();
			String SecondObject=CountrySelector.getAllSelectedOptions().get(1).getText();
			
			System.out.println(FirstObject+"\t"+SecondObject);
			
			
		} else 
		{
			System.out.println("Dropdown is  not multiple type");
		}
		

	}

}
