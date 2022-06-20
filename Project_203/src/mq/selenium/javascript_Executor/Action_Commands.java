package javascript_Executor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Action_Commands {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com/");
		driver.manage().window().maximize();
		
		//Enable javascript feature on autmation browser
		JavascriptExecutor js=((JavascriptExecutor)driver);
		
		//Type Text into editbox
		js.executeScript("document.getElementById('email').value='Darshan'");
		js.executeScript("document.getElementById('pass').value='Admin@123'");

		//Click Function using javascript
		WebElement LoginBtn=driver.findElement(By.name("login"));
		js.executeScript("arguments[0].click();", LoginBtn);
		
		
		//LoginBtn.click();
		//new Actions(driver).click(LoginBtn).click();
		
		
	}

}
