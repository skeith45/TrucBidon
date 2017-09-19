package main.java.trucbidon;
import main.java.businesslogic.StuffPrinter;

public class Main {

	public static void main(String[] args) {
		StuffPrinter printer = new StuffPrinter();
		System.out.println(printer.printStuff(1));		
		System.out.println(printer.printStuff(-1));
		
	}
	
	

}
