package switchcommands.window;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_Second_Window {

	public static void main(String[] args) throws Exception {
		
		//setting runtime environment variable
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();     //Launching browser method
		driver.get("https://instagram.com");
	    driver.manage().window().maximize();
	    
	    //Get Mainwindow ID
	    String MainWindowID=driver.getWindowHandle();
	    
	    
	    WebElement jobs=driver.findElement(By.linkText("Blog"));
	    jobs.click();  //Open page at new TAB/Window
	    Thread.sleep(4000);
	    
	    //Get Windows Handles
	    Set<String> AllWindowsIDs=driver.getWindowHandles();
	    
	    //Applying foreach to read all set of strings
	    for (String EachWindow : AllWindowsIDs) 
	    {
			driver.switchTo().window(EachWindow);
		}
	    
	    //Here is the assumption when iteration is finished
	    //By default controls will be available at second window
	    System.out.println("Second window title is --> "+driver.getTitle());
	    driver.close();   
	    
	    
	    //Switch Controls back to main window
	    driver.switchTo().window(MainWindowID);
	    System.out.println("Main window title is --->"+driver.getTitle());
	    
	    
	}

}
