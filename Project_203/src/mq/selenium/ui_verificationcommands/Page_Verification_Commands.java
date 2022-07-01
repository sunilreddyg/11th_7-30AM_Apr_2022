package ui_verificationcommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Page_Verification_Commands 
{
	
	public static void main(String args[])
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();     
		driver.get("https://www.skyscanner.co.in/");
	    driver.manage().window().maximize();
	    
	    
	    //Get Current window of title
	    String PageTitle=driver.getTitle();
	    System.out.println(PageTitle);
	    
	    //Get Current Window URL
	    String Pageurl=driver.getCurrentUrl();
	    System.out.println(Pageurl);
	    
	    //Get Current Window ID
	    String WindowID=driver.getWindowHandle();
	    System.out.println(WindowID);
		
		//Get Current window page source
	    String PageSoruce=driver.getPageSource();
	    System.out.println(PageSoruce);
	}

}
