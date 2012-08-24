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
	private double result;

	public double getResult() {
		return result;
	}

	public void setResult(double result) {
		this.result = result;
	}

	public void setEquipment(Equipment equipment) {
		this.equipment = equipment;
	}
	
	public void calculate(){
		this.result = equipment.getCost() * equipment.getSize();
	}
	
	public double getAnnualPower(){
		return getResult() * 365;
	}

	public Equipment getEquipment() {
		return equipment;
	}
	
}
