package au.edu.qut.inn372.greenhat.bean;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

	private Calculator calculator;
	private Equipment equipment;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		calculator = new Calculator();
		equipment = new Equipment();
		equipment.setCost(10.0);
		equipment.setSize(20.0);
		calculator.setEquipment(equipment);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetResult() {
		calculator.calculate();
		assertTrue(calculator.getResult() > 0);
	}

	@Test
	public void testSetResult() {
		calculator.calculate();
		assertTrue(calculator.getResult() >0);
	}

	@Test
	public void testSetEquipment() {
		calculator.calculate();
		assertTrue(calculator.getResult() >0);
	}

	@Test
	public void testCalculate() {
		calculator.calculate();
		assertTrue(calculator.getResult() >0);
	}

}
