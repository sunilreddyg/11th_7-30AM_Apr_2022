package robot_window_interface_Automation;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class CopyStringTo_Clipboard {

	public static void main(String[] args) throws Exception {
		
		//Opening Notepad file at runtime
		Runtime.getRuntime().exec("notepad.exe");
		Thread.sleep(5000);
		
		//Create object for Robot Interface
		Robot robot=new Robot();
		robot.setAutoDelay(200);
		
		String text="Welcome to selenium automation demo";
		
		//Select String 
		StringSelection Stext=new StringSelection(text);
		//Get System Clipbaord
		Clipboard clipboard=Toolkit.getDefaultToolkit().getSystemClipboard();
		//Set memory to clipbaord
		clipboard.setContents(Stext, Stext);
		
		
		//Press Control+V shortcut
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		//Release control V
		robot.keyRelease(KeyEvent.VK_CONTROL);

	}

}
