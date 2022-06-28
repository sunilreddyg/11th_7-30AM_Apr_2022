package capturescreenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenShot_At_WebPage {

	public static void main(String[] args) throws IOException {
		
		//setting runtime environment variable
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();     //Launching browser method
		driver.get("https://www.facebook.com");
	    driver.manage().window().maximize();
	    
		 //Capturing screen and converting into output file format   
		 File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  
		 //Create Folder at local driver
		 FileHandler.createDir(new File("screens"));
		 
		 //Copy file into local system
		 FileHandler.copy(src, new File("screens//screen1.png"));
		 
		 /*
		  * PNG:--> Portable Network Graphic
		  */
		 
	 
	 
	}

}
