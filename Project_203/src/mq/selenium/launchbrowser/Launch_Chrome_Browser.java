package mq.selenium.launchbrowser;

import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_Chrome_Browser 
{

	public static void main(String[] args)
	{
		
		/*
		 * Downlaod chromedriver.exe file
		 * 
		 * 		=> https://www.selenium.dev/downloads/
		 * 		=> Scroll down page until find Browsers
		 * 		=> Click Browsers Tab to see list of browser drivers
		 * 		=> Under chrome click on documentation link
		 * 		=> Find chrome browser version and download chromeDriver
		 * 				w.r.t chrome browser version
		 * 				Chrome Browser =>  102.0
		 * 				Chrome Driver  =>  102.0
		 * 		=> Click on latest stable version  ChromeDriver 102.0.5005.61
		 * 		=> Click on ChromeDriver version [It navigate to Index page]
		 * 		=> Downlaod Zip format file w.r.t Operating Systems
		 * 		=> Unzip file to backup folder
		 * 		 => with this action [You receive chromedriver.exe file]
		 * 		=> either set up environment variabe for chromedriver.exe
		 * 			file at system variables or set up runtime environment
		 * 			variable..
		 */
		
		//Setting runtime environment variable to locate chromedriver.exe file
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		
		//Launching chrome browser and storing into reference class
		ChromeDriver chrome=new ChromeDriver();
		
		//Loading a webpage to automation browser window
		chrome.get("https://facebook.com");
		
		//maximize browser window
		chrome.manage().window().maximize();
		
		//Printing Current Window title
		System.out.println(chrome.getTitle());
		
		//Closing automation browser window
		chrome.close();
	}

}
