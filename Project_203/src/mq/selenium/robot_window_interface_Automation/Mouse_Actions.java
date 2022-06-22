package robot_window_interface_Automation;

import java.awt.Robot;
import java.awt.event.InputEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Mouse_Actions 
{

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.selenium.dev/downloads/");
		driver.manage().window().maximize();
		
		
		WebElement Download_Button=driver.findElement(By.xpath("(//a[contains(.,'4.2.2')])[1]"));
		Download_Button.click();
		Thread.sleep(5000);
		
		
		Robot robot=new Robot();
		robot.setAutoDelay(1000);
		
		robot.mouseMove(474, 347);
		
		//Press Left click on mouse
		robot.mousePress(InputEvent.BUTTON1_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_MASK);
		
		
	}

}
