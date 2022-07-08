package ui_verificationcommands.getCssValue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Object_Styles {

	public static void main(String[] args) 
	{
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		
		
		WebElement LoginButton=driver.findElement(By.xpath("//button[@name='login']"));
		
		
		//Get styles of login button
		String BGColor=LoginButton.getCssValue("background-color");
		System.out.println("BackGround Color displayed is --> "+BGColor);

		String FontSize=LoginButton.getCssValue("font-size");
		System.out.println("Font size displayed --. "+FontSize);
		
		
		String TextAlign=LoginButton.getCssValue("text-align");
		System.out.println("Text aligned at ---> "+TextAlign);

	}

}
