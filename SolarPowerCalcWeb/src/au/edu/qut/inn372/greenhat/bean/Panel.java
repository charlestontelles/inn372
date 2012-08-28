package au.edu.qut.inn372.greenhat.bean;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 * Bean that represents a Panel
 * 
 * @author Charleston Telles
 *
 */
@ManagedBean
@SessionScoped
public class Panel implements Serializable {

	private static final long serialVersionUID = 6525434735006191175L;
	
	private int id;
	private double width;
	private double height;
	private double efficiency;
	private double efficiencyLoss;
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the width
	 */
	public double getWidth() {
		return width;
	}
	/**
	 * @param width the width to set
	 */
	public void setWidth(double width) {
		this.width = width;
	}
	/**
	 * @return the height
	 */
	public double getHeight() {
		return height;
	}
	/**
	 * @param height the height to set
	 */
	public void setHeight(double height) {
		this.height = height;
	}
	/**
	 * @return the efficiency
	 */
	public double getEfficiency() {
		return efficiency;
	}
	/**
	 * @param efficiency the efficiency to set
	 */
	public void setEfficiency(double efficiency) {
		this.efficiency = efficiency;
	}
	/**
	 * @return the efficiencyLoss
	 */
	public double getEfficiencyLoss() {
		return efficiencyLoss;
	}
	/**
	 * @param efficiencyLoss the efficiencyLoss to set
	 */
	public void setEfficiencyLoss(double efficiencyLoss) {
		this.efficiencyLoss = efficiencyLoss;
	}
}
