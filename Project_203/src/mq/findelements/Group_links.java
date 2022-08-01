package findelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Group_links {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SUNIL\\OneDrive\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		//Selecting single option from dropdown..
		new Select(driver.findElement(By.id("searchDropdownBox")))
		.selectByVisibleText("Books");
		
		
		//Clicking on search button..
		WebElement Search_button=driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		Search_button.click();
		
		
		WebElement Books_location=driver.findElement(By.xpath("(//ul[@class='a-unordered-list a-nostyle a-vertical a-spacing-medium'])[3]"));
		List<WebElement> AllBooks=Books_location.findElements(By.tagName("a"));
		System.out.println("List of books available is ==> "+AllBooks.size());
		
		
		//Applying foreach loop
		for (int i = 0; i < AllBooks.size(); i++) 
		{
			
			String BookName=AllBooks.get(i).getText();
			AllBooks.get(i).click();
			System.out.println(BookName+"    "+driver.getTitle());
			/*
			 * driver.navigate().to(EachbookLink.getAttribute("href"));
			 * System.out.println(BookName+"     "+driver.getTitle());
			 */
			
			driver.navigate().back();
			Thread.sleep(5000);
			//Restoring all links
			Books_location=driver.findElement(By.xpath("(//ul[@class='a-unordered-list a-nostyle a-vertical a-spacing-medium'])[3]"));
			AllBooks=Books_location.findElements(By.tagName("a"));
			
		}

	}

}
