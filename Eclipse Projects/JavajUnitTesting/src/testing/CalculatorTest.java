package testing;

import static org.junit.Assert.*;

import org.junit.Test;

import service.Calculator;

public class CalculatorTest {

	@Test				//like a main method
	public void testAdd() {
		Calculator cc = new Calculator();
		int res = cc.add(100, 200);
		assertEquals(300, res);     // expection 
	}

}
