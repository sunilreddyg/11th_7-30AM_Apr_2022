package waitcommands;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait_Wait_For_Visibility 
{

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://instagram.com");
		driver.manage().window().maximize();
		
		//Enabling explicit timeout at automation browser
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(50));
		
		//Wait until object comes to visible at webpage
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username"))).sendKeys("9030248855");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password"))).sendKeys("Hello@123");
		System.out.println("Object is visible at webpage");
		
		By LoginButton=By.xpath("//button[contains(.,'Log In')]");
		wait.until(ExpectedConditions.elementToBeClickable(LoginButton)).click();
		System.out.println("Element is at clickable ");
		
		By Error_location=By.xpath("//p[@id='slfErrorAlert']");
		String Exp_text="Sorry, your password was incorrect. Please double-check your password.";
		wait.until(ExpectedConditions.textToBePresentInElementLocated(Error_location, Exp_text));
		System.out.println("Text Visible at location");
		
	
	}

}
