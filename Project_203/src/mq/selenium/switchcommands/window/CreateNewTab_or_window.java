package switchcommands.window;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateNewTab_or_window 
{

	public static void main(String[] args) throws Exception 
	{
	
		//setting runtime environment variable
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();     //Launching browser method
		driver.get("https://instagram.com");
	    driver.manage().window().maximize();
	    Thread.sleep(4000);
	    
	    String MainwindowID=driver.getWindowHandle();
	    
	    //This feature only available in selneium3
	    WebDriver Meta= driver.switchTo().newWindow(WindowType.WINDOW);
	    Meta.get("https://about.facebook.com/");
	   
	    System.out.println("Meta window title is --> "+driver.getTitle());
	   
	    //Switch to Main window
	    driver.switchTo().window(MainwindowID);
	    System.out.println(driver.getTitle());
	    
	    
	}

}
