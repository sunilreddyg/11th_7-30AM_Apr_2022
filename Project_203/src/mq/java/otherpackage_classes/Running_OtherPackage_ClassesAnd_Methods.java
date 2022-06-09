package otherpackage_classes;


import mq.java.methods.instantmethods.ClassA;
import mq.java.methods.staticmethods.MouseCommands;


public class Running_OtherPackage_ClassesAnd_Methods 
{

	public static void main(String[] args) {
		
		
		/*
		 * In Order to run other package classes and methods
		 * We should follow below conditions.
		 * 
		 * Rule1:--> Only public modifier classes,methods, variables
		 * 			  can access outside a package..
		 * 
		 * Rule2:-->
		 * 			We should import package to current constructed class
		 * 		
		 * 		    How to import:-->
		 * 
		 * 			=> Write import statement after package name and before class
		 * 			import packagename.*;
		 * 			import packagename.classname;
		 * 			
		 */
		
		//Creating object for instant methods to call
		ClassA obj=new ClassA();
		obj.method3();
		
		//Calling Static Methods with help of classname
		MouseCommands.DoubleClick();
		MouseCommands.RightClick();
		MouseCommands.LeftClick();

	}

}
