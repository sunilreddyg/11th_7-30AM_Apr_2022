package ui_verificationcommands.getAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRuntime_Behaviour {

	public static void main(String[] args) throws Exception 
	{
		/*
		 * Scenario:--> Verifying Double Seat fares Disabled
		 * 				on roundtrip selection
		 * 
		 * 		Give site url is  http://makemytrip.com
		 * 		When User Select Roundtrip Radio button
		 * 		And verify roundtrip is selected
		 * 		Then Verify Double fares checkbox is disabled
		 */
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();     
		driver.get("https://www.makemytrip.com/");
	    driver.manage().window().maximize();
	    Thread.sleep(10000);
	    
	    
	    WebElement Roundtrip=driver.findElement(By.xpath("//li[contains(@data-cy,'roundTrip')]"));
	    Roundtrip.click();
	    
	    
	    //Get Runtime Property of Roundtirp
	    String RuntimeClass1=Roundtrip.getAttribute("class");
	    if(RuntimeClass1.contains("selected"))
	    {
	    	System.out.println("Roundtrip is Selected");
	    	
	    	
	    	//Reading Runtime Class Property
	    	WebElement DoubleSeat=driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div[2]/div[2]/div[1]/ul/li[5]"));
	    	String RuntimeClass2=DoubleSeat.getAttribute("class");
	    	if(RuntimeClass2.contains("isItemDisabled"))
	    		System.out.println("As expected Object is disabled");
	    	else
	    		System.out.println("Object is Not Disabled");
	    }
	    else
	    {
	    	System.out.println("Roundtrip option is not selected");
	    }
	    
	    
	    
	    
	    
	    
	    

	}

}
