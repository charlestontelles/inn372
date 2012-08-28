package au.edu.qut.inn372.greenhat.bean;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

	private static final double SOLAR_POWER = 4.5;
	private Calculator calculator;
	private Equipment equipment;
	private Customer customer;
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
		Inverter inverter = new Inverter();
		inverter.setEfficiency(0.95);
		inverter.setLifespan(25);
		inverter.setReplacementCost(350.0);
		equipment.setInverter(inverter);
		ArrayList<Panel> panels = new ArrayList<Panel>();
		Panel panel1 = new Panel();
		panel1.setEfficiency(0.35);
		panel1.setEfficiencyLoss(0.65);
		panel1.setHeight(10.0);
		panel1.setId(0);
		panel1.setWidth(10.0);
		panels.add(panel1);
		equipment.setPanels(panels);
		equipment.setSize(SOLAR_POWER);
		calculator.setEquipment(equipment);
		customer = new Customer();
		ElectricityUsage electricityUsage = new ElectricityUsage();
		electricityUsage.setDailyAverageUsage(40.0);
		electricityUsage.setDayTimeHourlyUsage(30.0);
		customer.setElectricityUsage(electricityUsage);
		Location location = new Location();
		Roof roof = new Roof();
		roof.setEfficiencyLossNorth(0.2);
		roof.setEfficiencyLossWest(0.1);
		roof.setHeight(10.0);
		roof.setPercentageNorth(0.25);
		roof.setPercentageWest(0.75);
		roof.setWidth(10.0);
		location.setRoof(roof);
		location.setSunLightHours(8.0);
		customer.setLocation(location);
		customer.setTariff(new Tariff());
		calculator.setCustomer(customer);
		calculator.setSolarPower(SOLAR_POWER);
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test 
	public void testGetSetCustomer() {
		assertEquals(calculator.getCustomer(), customer);
		Customer newCustomer = new Customer();
		calculator.setCustomer(newCustomer);
		assertEquals(calculator.getCustomer(), newCustomer);
	}
	
	@Test
	public void testGetSetSolarPower() {
		assertEquals(calculator.getSolarPower(), SOLAR_POWER, 0);
		Double newSolarPower = 4.0;
		calculator.setSolarPower(4.0);
		assertEquals(calculator.getSolarPower(), newSolarPower, 0);
	}
	
	@Test
	public void testGetSetEquipment() {
		assertEquals(calculator.getEquipment(), equipment);
		Equipment newEquipment = new Equipment();
		calculator.setEquipment(newEquipment);
		assertEquals(calculator.getEquipment(), newEquipment);
	}
	
	@Test
	public void testCalculatorSolarPower() {
		calculator.calculateSolarPower();
		assertEquals(calculator.getSolarPower(), 9.918, 0.001);
	}
	
	@Test
	public void testCalculateAnnualSolarPower() {
		assertEquals(calculator.calculateAnnualSolarPower(), SOLAR_POWER * 365, 0.0001);
	}
	
}
