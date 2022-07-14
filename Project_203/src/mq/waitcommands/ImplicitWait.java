package waitcommands;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		
		//setting implicit wait until object load at DOM [Document OBject Model]
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		//Setting page load timeout 
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(200));
		
		
	
		long starttime=System.currentTimeMillis();
	
		try {
			driver.findElement(By.id("email1234"));
			System.out.println("Object is Found");
			System.out.println(System.currentTimeMillis()-starttime);
			
		} catch (Exception e) {
			System.out.println("Object Not found");
			System.out.println(System.currentTimeMillis()-starttime);
		}
	
	
	
	
	
	
	
	
	
	
	

	}

}
