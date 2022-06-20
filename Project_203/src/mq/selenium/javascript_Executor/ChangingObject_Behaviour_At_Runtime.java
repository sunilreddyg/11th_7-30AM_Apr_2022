package javascript_Executor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChangingObject_Behaviour_At_Runtime {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com/");
		driver.manage().window().maximize();
		
		
		//Enable javascript execution at automation browser
		JavascriptExecutor js=((JavascriptExecutor)driver);
		Thread.sleep(4000);
		
		//Identifying object using Webdriver
		WebElement Email=driver.findElement(By.xpath("//input[@id='email']"));
		
		//Hide object using Javascript
		js.executeScript("arguments[0].style.visibility='hidden'", Email);
		Thread.sleep(2000);
		
		//Get Object to Visible using javascript
		js.executeScript("arguments[0].style.visibility='visible'", Email);
		Thread.sleep(2000);
		
		
	}

}
