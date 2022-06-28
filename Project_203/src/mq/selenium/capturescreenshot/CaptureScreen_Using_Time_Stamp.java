package capturescreenshot;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class CaptureScreen_Using_Time_Stamp 
{

	public static void main(String[] args) throws Exception {
		
		//setting runtime environment variable
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();   
		driver.get("https://www.instagram.com");
	    driver.manage().window().maximize();
	    Thread.sleep(4000);
	    
	    
	    //Get System Current Date and Time
	    Date d=new Date();    //import java.util;
	    //Create simple date format
	    SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MMM-dd hh-mm-ss");
	    //Convert System date using simple date format
	    String time=sdf.format(d);
	    
	    
	    //Capturing screen and converting into output file format   
		 File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//Copy file into local system
		FileHandler.copy(src, new File("screens//Image"+time+".png")); 
		
		
		/*
		 * Time Stamp Regular Expressions
		 * 
		 * 	yyyy     [year] 	1900 -2022
		 *  MM		 [month] 	01 - 12
		 *  MMM      [month] 	JAN - DEC
		 *  dd		 [day]   	01 - 31
		 *  hh       [hour]  	01 - 24
		 *  mm       [minute]	01 - 60
		 *  ss       [seconds]	01- 60
		 */
		
		
		
	}

}
