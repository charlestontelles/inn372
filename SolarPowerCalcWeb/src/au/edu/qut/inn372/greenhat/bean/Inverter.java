/**
 * 
 */
package au.edu.qut.inn372.greenhat.bean;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
/**
 * Bean that represents a Calculator
 * 
 * @author Martin Daniel
 *
 */
@ManagedBean
@SessionScoped
public class Inverter implements Serializable{

	private static final long serialVersionUID = 6903832305061311100L;
	
	private double efficiency;
	private double lifespan;
	private double replacementCost;
	
	public double getEfficiency() {
		return efficiency;
	}
	
	public void setEfficiency(double efficiency) {
		this.efficiency = efficiency;
	}
	
	public double getLifespan() {
		return lifespan;
	}
	public void setLifespan(double lifespan) {
		this.lifespan = lifespan;
	}
	
	public double getReplacementCost() {
		return replacementCost;
	}
	
	public void setReplacementCost(double replacementCost) {
		this.replacementCost = replacementCost;
	}
}
