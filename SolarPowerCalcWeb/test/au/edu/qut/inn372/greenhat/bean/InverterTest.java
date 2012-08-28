package au.edu.qut.inn372.greenhat.bean;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class InverterTest {

	private static final double REPLACEMENT_COST = 350.0;
	private static final double LIFESPAN = 25.0;
	private static final double EFFICIENCY = 0.95;
	private Inverter inverter;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		inverter = new Inverter();
		inverter.setEfficiency(EFFICIENCY);
		inverter.setLifespan(LIFESPAN);
		inverter.setReplacementCost(REPLACEMENT_COST);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSetGetEfficiency() {
		assertEquals(inverter.getEfficiency(), EFFICIENCY, 0.0);
		Double newEfficiency = 0.9;
		inverter.setEfficiency(newEfficiency);
		assertEquals(inverter.getEfficiency(), newEfficiency, 0.0);
	}
	
	@Test
	public void testSetGetLifespan() {
		assertEquals(inverter.getLifespan(), LIFESPAN, 0.0);
		Double newLifespan= 22.0;
		inverter.setEfficiency(newLifespan);
		assertEquals(inverter.getEfficiency(), newLifespan, 0.0);
	}
	
	@Test
	public void testSetGetReplacementCost() {
		assertEquals(inverter.getReplacementCost(), REPLACEMENT_COST, 0.0);
		Double newReplacementCost = 320.0;
		inverter.setEfficiency(newReplacementCost);
		assertEquals(inverter.getEfficiency(), newReplacementCost, 0.0);
	}
}
