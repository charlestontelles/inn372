package au.edu.qut.inn372.greenhat.bean;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
/**
 * Bean that represents a Calculator
 * 
 * @author Charleston Telles
 *
 */
@ManagedBean
@SessionScoped
public class Calculator implements Serializable {
	private static final long serialVersionUID = 8267206547724271616L;
	
	@ManagedProperty (value = "#{equipment}")
	private Equipment equipment;
	
	@ManagedProperty (value = "#{customer}")
	private Customer customer;
	
	private double solarPower;
	
	/**
	 * @return the customer
	 */
	public Customer getCustomer() {
		return customer;
	}

	/**
	 * @param customer the customer to set
	 */
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public double getSolarPower() {
		return solarPower;
	}

	public void setSolarPower(double solarPower) {
		this.solarPower = solarPower;
	}

	public void setEquipment(Equipment equipment) {
		this.equipment = equipment;
	}
	
	public Equipment getEquipment() {
		return equipment;
	}
	
	public void calculateSolarPower(){
		//this.result = equipment.getCost() * equipment.getSize();
		Location location = new Location();
		location = customer.getLocation();
		this.solarPower = ((equipment.getSize() * location.getRoof().getPercentageNorth()
				*(1-location.getRoof().getEfficiencyLossNorth()))
					+(equipment.getSize()*location.getRoof().getEfficiencyLossWest()
						*(1-location.getRoof().getEfficiencyLossWest())))
							//*equipment.getPanels().get(1).getEfficiency()
								*equipment.getInverter().getEfficiency()
									*location.getSunLightHours();
	}
	
	public double calculateNetSolarPower(){
		return (this.solarPower - customer.getElectricityUsage().getDailyAverageUsage());
	}
	
	public double calculateAnnualSolarPower(){
		return getSolarPower() * 365;
	}
}
