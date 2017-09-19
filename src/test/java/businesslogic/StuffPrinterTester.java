package test.java.businesslogic;
import static org.junit.Assert.*;

import org.junit.Test;

import main.java.businesslogic.StuffPrinter;

public class StuffPrinterTester {
	
	StuffPrinter printer = new StuffPrinter(); 

	@Test
	public void GIVEN_StuffPrinter_WHEN_StuffTypePositive_THEN_HelloWorld() {
		assertTrue(printer.printStuff(1) == "Hello World!");
	}
	
	@Test
	public void GIVEN_StuffPrinter_WHEN_StuffTypeNegativeOrZero_THEN_GoodbyeWorld() {
		assertTrue(printer.printStuff(-1) == "Goodbye World!");
	}

}
