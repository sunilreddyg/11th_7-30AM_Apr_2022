package waitcommands;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait_Url_To_Verify {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://instagram.com");
		driver.manage().window().maximize();
		
		
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(100));
		
		
		try {
			wait.until(ExpectedConditions.urlToBe("https://www.instagram.com/"));
			System.out.println("instagram page url is verified");
		} catch (Exception e) {
			System.out.println("Instagram page url is not verified");
		}
		
		
	
		wait.until(ExpectedConditions.
				visibilityOfElementLocated(By.linkText("Sign up"))).click();
		
		
		
		try {
			wait.until(ExpectedConditions.urlContains("emailsignup"));
			System.out.println("Url is Presented at browser window");
		} catch (Exception e) {
			System.out.println("Expected url not presented at browser window");
		}
		
		
		

	}

}
