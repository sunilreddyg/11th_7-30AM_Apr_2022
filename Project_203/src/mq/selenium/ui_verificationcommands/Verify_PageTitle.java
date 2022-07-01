package ui_verificationcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_PageTitle {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();     
		driver.get("https://www.instagram.com");
	    driver.manage().window().maximize();
	    
	    
	    //Get Current window of title
	    String PageTitle=driver.getTitle();
	    String Exp_title="Instagram";
	    
	    if(PageTitle.equals(Exp_title))
	    {
	    	System.out.println("Expected title is presented");
	    	
	    	WebElement Signup=driver.findElement(By.linkText("Sign up"));
	    	Signup.click();
	    	
	    	if(driver.getTitle().contains("Login"))
	    	{
	    		System.out.println("Expected title presented");
	    	}
	    	else
	    	{
	    		System.out.println("Login page title is mismatched");
	    	}
	    	
	    }
	    else
	    {
	    	System.out.println("expected title not presented");
	    }
	    

	}

}
