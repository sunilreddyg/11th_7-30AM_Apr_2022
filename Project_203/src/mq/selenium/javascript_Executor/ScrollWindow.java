package javascript_Executor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollWindow {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php");
		
		//Enabling javascript on automation browser
		JavascriptExecutor js=((JavascriptExecutor)driver);
		
		//Scroll Window vertical
		js.executeScript("window.scroll(100,600)");

		
		//Scroll window horizontal
		js.executeScript("window.scroll(600,100)");
		
		
		
	}

}
