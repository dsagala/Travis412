package travis_ci_tutorial_java;

import java.util.*;

import static org.junit.Assert.*;
import org.junit.*;

public class SimpleCalculatorTest {
	@Test
	public void testAdd() {
		SimpleCalculator calc = new SimpleCalculator(); //fixed
		assertEquals(calc.add(1, 1), 2);
	}
	
	@Test
	public void testMinus() {
		SimpleCalculator calc = new SimpleCalculator(); //fixed
		assertEquals(calc.minus(5, 3), 2);
	}
	
	@Test
	public void testDivide() {
		SimpleCalculator calc = new SimpleCalculator(); //fixed
		assertEquals(calc.divide(6, 3), 2);
	}
	
	@Test
	public void testMultiply() {
		SimpleCalculator calc = new SimpleCalculator(); //fixed
		assertEquals(calc.multiply(6, 3), 2);
	}
}
