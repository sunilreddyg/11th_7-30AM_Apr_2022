package ui_verificationcommands.getCssValue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class ColorTesting 
{

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
		
		//Only Selenium 4 have this option
		Color Code=Color.fromString(BGColor);
		System.out.println("Color in Hex format ---> "+Code.asHex());

		
		//Exected Color
		String Exp_color="#1877f2";
		if(Exp_color.equals(Code.asHex()))
			System.out.println("Expected color available");
		else
			System.out.println("Different Color displayed");
		
		
		
		/*
		 * Find more thing about Color Testing
		 * https://www.selenium.dev/documentation/webdriver/additional_features/colors/
		 */
	}

}
