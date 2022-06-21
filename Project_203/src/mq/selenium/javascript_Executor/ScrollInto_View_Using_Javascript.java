package javascript_Executor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollInto_View_Using_Javascript {

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.skyscanner.co.in/");
		driver.manage().window().maximize();
		
		
		//Enable javascript execution at automation browser
		JavascriptExecutor js=((JavascriptExecutor)driver);
		Thread.sleep(4000);
		
		//Scroll Into View port..
		WebElement Header2=driver.findElement(By.xpath("//h2[contains(.,'Plan your perfect trip')]"));
		js.executeScript("arguments[0].scrollIntoView()", Header2);
		
		
		//scrollIntoView(true)  Align into top of the webpage
		//scrollIntoView(false) Align into bottom of the page

	}

}
