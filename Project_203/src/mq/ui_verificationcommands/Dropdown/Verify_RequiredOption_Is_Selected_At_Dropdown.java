package ui_verificationcommands.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Verify_RequiredOption_Is_Selected_At_Dropdown {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();     
		driver.get("https://www.facebook.com/reg/");
	    driver.manage().window().maximize();
	    
	    
	    
	    WebElement MonthDropdown=driver.findElement(By.xpath("//select[@id='month']"));
	    String Value=new Select(MonthDropdown).getFirstSelectedOption().getText();
	    if(Value.equals("Jul"))
	    	System.out.println("Expected month populated at Month Dropdown");
	    else
	    	System.out.println("Wrong month is populated at month dropdown");
	    
	    
	    
	    
	    

	}

}
