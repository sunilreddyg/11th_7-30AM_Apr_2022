package mq.java.constructor;

public class ChromeBrowser {

	public ChromeBrowser() 
	{
		System.out.println("Chrome Is Opened");
	}
	
	void openwebsite()
	{
		System.out.println("Site Is Up");
	}
	
	void maximizeBrowser()
	{
		System.out.println("Browser maximized");
	}
	
	void minimizeBrowser()
	{
		System.out.println("Browser minimized");
	}
	
	public static void main(String args[])
	{
		//Calling Methods using instances
		new ChromeBrowser().openwebsite();
		new ChromeBrowser().maximizeBrowser();
		new ChromeBrowser().minimizeBrowser();
		
		System.out.println("\n");  //Escape sequence to print new line
		
		//Storing constructor into reference variable
		ChromeBrowser obj=new ChromeBrowser();
		obj.openwebsite();
		obj.minimizeBrowser();
		obj.maximizeBrowser();
		
	}

}
