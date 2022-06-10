package objectidentification;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicObjectIdentifications {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();    //Open ChromeBrowser
		driver.get("http://facebook.com");		//Load webpage
		driver.manage().window().maximize();    //Maxmize window
		
		//Identifying objects using hmtl identifires
		driver.findElement(By.id("email")).sendKeys("darshan");
		driver.findElement(By.id("pass")).sendKeys("Hello@123");
		driver.findElement(By.name("login")).click();
		
		
		

		
	}

}
