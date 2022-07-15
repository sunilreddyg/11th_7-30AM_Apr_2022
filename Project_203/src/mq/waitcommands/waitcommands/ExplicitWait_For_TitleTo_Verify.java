package waitcommands;



import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait_For_TitleTo_Verify {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		
		
		
	//Explicit wait to load expected title at browser window
	new WebDriverWait(driver, Duration.ofSeconds(100))
		.until(ExpectedConditions.titleContains("Facebook"));
		System.out.println("Facebook page is verified");
		
		
		
		WebElement Messenger=driver.findElement(By.linkText("Messenger"));
		Messenger.click();
		
		
		try {
			new WebDriverWait(driver, Duration.ofSeconds(100))
			.until(ExpectedConditions.titleIs("Messenger"));
			System.out.println("Messenger title is verified");
			
		} catch (Exception e) {
			System.out.println("Title Not presented at Webpage");
		}
		
		
		
		
		
		
		

	}

}
