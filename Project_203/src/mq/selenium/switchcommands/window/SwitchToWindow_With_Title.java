package switchcommands.window;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToWindow_With_Title {

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
	    
	    
	    WebElement Help=driver.findElement(By.linkText("Help"));
	    Help.click();  //Open page at new TAB/Window
			    
	    WebElement Meta=driver.findElement(By.linkText("Meta"));
	    Meta.click();	//Open page at new TAB/Window
	    
	    
	    //Get All window IDs
	    Set<String> AllwindowIDs=driver.getWindowHandles();
	    //Apply foreach loop to read all window Ids
	    for (String EachWindowID : AllwindowIDs) 
	    {
			String WindowTitle=driver.switchTo().window(EachWindowID).getTitle();
			if(WindowTitle.contains("Help Center"))
			{
				break;  //Stop Iteration and keep window controls at same window
			}
		}
	    
	    
	    //Get Current focused window title
	    System.out.println("Current window Title is --> "+driver.getTitle());
	    
	    
	}

}
