package robot_window_interface_Automation;


import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureScreenWith_Robot_Interface {

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");
		
		//Creating object fo robot class
		Robot robot=new Robot();
		robot.setAutoDelay(2000);
		
		BufferedImage image=robot.createScreenCapture(new Rectangle(800, 600));
		ImageIO.write(image, "PNG", new File("D:\\images\\img.png"));
		
		

	}

}
