package mq.java.methods.staticmethods;

public class RunMouseCommands 
{

	public static void main(String[] args) 
	{
		/*
		 * In order to call Static methods from different
		 * class we should follow bellow syntax
		 * 
		 * 		Syntax:-->  ClassName.Methodname();
		 */
		MouseCommands.LeftClick();
		MouseCommands.RightClick();
		MouseCommands.DoubleClick();

	}

}
