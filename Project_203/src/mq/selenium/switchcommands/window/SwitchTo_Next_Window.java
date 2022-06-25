package switchcommands.window;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_Next_Window {

	public static void main(String[] args) throws Exception 
	{
		//setting runtime environment variable
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();     //Launching browser method
		driver.get("https://instagram.com");
	    driver.manage().window().maximize();
	    
	    
	    WebElement jobs=driver.findElement(By.linkText("Blog"));
	    jobs.click();  //Open page at new TAB/Window
	    Thread.sleep(4000);
	    
	    //Get Windows Handles
	    Set<String> AllWindowsIDs=driver.getWindowHandles();
	    
	    //Converting set of string values into iterators
	    Iterator<String> itr=AllWindowsIDs.iterator();
	    
	    //Reading each iterator with next keywords.
	    
	    String WindowID1=itr.next();       //Read first window ID
	    String WindowID2=itr.next();	   //Read Second window ID
	    
	    driver.switchTo().window(WindowID2);
	    
	    System.out.println("Second window title is --> "+driver.getTitle());
	    driver.close();   //It Close only active window..
	    
	    //Get Controls back to main window
	    driver.switchTo().window(WindowID1);
	    System.out.println("Main Window Title is ---> "+driver.getTitle());

	}

}
