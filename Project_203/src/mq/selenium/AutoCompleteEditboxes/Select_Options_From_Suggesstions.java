package mq.selenium.AutoCompleteEditboxes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Select_Options_From_Suggesstions {

	public static void main(String[] args) throws Exception 
	{
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/resources/demos/autocomplete/default.html");
		driver.manage().window().maximize();
		
		WebElement Editbox=driver.findElement(By.xpath("//input[@id='tags']"));
		Editbox.sendKeys("JAVA");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[contains(.,'JavaScript')]")).click();
		
	}

}
