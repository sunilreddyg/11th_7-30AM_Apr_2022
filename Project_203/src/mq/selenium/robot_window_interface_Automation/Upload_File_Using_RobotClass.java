package robot_window_interface_Automation;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Upload_File_Using_RobotClass {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();    		
		driver.get("http://bridgeqsystems.com/demo.php");		
		driver.manage().window().maximize(); 
		
		
		WebElement UploadMenutab=driver.findElement(By.xpath("//button[contains(.,'Upload & Download')]"));
		UploadMenutab.click();
		Thread.sleep(4000);
		
		
		WebElement UploadButton=driver.findElement(By.xpath("//input[@id='uploadFile']"));
		((JavascriptExecutor)driver).executeScript("arguments[0].click()", UploadButton);
		
		
		String path="D:\\Sample_Resume\\3year_EXP\\MyResume.docx";
		
		//Selecting Required String
		StringSelection spath=new StringSelection(path);
		
		//Get Access of system clipboard memory
		Clipboard clipboard=Toolkit.getDefaultToolkit().getSystemClipboard();
		
		//Set Selected Content To Clicpbaord memory
		clipboard.setContents(spath, spath);
		
		
		//Create object fo robot class
		Robot robot=new Robot();
		robot.setAutoDelay(500);
		
		//Press Control+V 
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		
		//Release Control Key
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		
		//Press Enter key
		robot.keyPress(KeyEvent.VK_ENTER);
	}

}
