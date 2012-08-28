package au.edu.qut.inn372.greenhat.bean;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class PanelTest {

	private static final double WIDTH = 2.0;
	private static final int ID = 0;
	private static final double HEIGHT = 4.0;
	private static final double EFFICIENCY_LOSS = 0.7;
	private static final double EFFICIENCY = 0.3;
	private Panel panel;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		panel = new Panel();
		panel.setEfficiency(EFFICIENCY);
		panel.setEfficiencyLoss(EFFICIENCY_LOSS);
		panel.setHeight(HEIGHT);
		panel.setId(ID);
		panel.setWidth(WIDTH);
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void testSetGetEfficiency() {
		assertEquals(panel.getEfficiency(), EFFICIENCY, 0.0);
		Double newEfficiency = 0.4;
		panel.setEfficiency(newEfficiency);
		assertEquals(panel.getEfficiency(), newEfficiency, 0.0);
	}
	
	@Test
	public void testSetGetEfficiencyLoss() {
		assertEquals(panel.getEfficiencyLoss(), EFFICIENCY_LOSS, 0.0);
		Double newEfficiencyLoss = 0.6;
		panel.setEfficiencyLoss(newEfficiencyLoss);
		assertEquals(panel.getEfficiencyLoss(), newEfficiencyLoss, 0.0);
	}
	
	@Test
	public void testSetGetHeight() {
		assertEquals(panel.getHeight(), HEIGHT, 0.0);
		Double newHeight = 3.0;
		panel.setHeight(newHeight);
		assertEquals(panel.getHeight(), newHeight, 0.0);
	}
	
	@Test
	public void testSetGetWidth() {
		assertEquals(panel.getWidth(), WIDTH, 0.0);
		Double newWidth = 2.5;
		panel.setWidth(newWidth);
		assertEquals(panel.getWidth(), newWidth, 0.0);
	}
	
	@Test
	public void testSetGetId() {
		assertEquals(panel.getId(), ID);
		int newId = 2;
		panel.setId(newId);
		assertEquals(panel.getId(), newId);
	}
}
