package main.java.businesslogic;

public class StuffPrinter {
	public String printStuff(int stuffType)
	{
		if (stuffType > 0)
			return "Hello World!";
			//System.out.println("Hello World!"); // Prints the string to the console.
		else
			return "Goodbye World!";
			//System.out.println("Goodbye World!"); // Prints the string to the console.
	}
}
