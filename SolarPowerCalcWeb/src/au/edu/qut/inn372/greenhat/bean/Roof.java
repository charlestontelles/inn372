/**
 * 
 */
package au.edu.qut.inn372.greenhat.bean;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


/**
 * 
 * Bean that represents a roof
 * @author Martin Daniel
 *
 */

@ManagedBean
@SessionScoped
public class Roof implements Serializable {

	private static final long serialVersionUID = -5620428438578639760L;
	
	private double width;
	private double height;
	private double percentageNorth;
	private double percentageWest;
	private double efficiencyLossNorth;
	private double efficiencyLossWest;
	
	public double getEfficiencyLossNorth() {
		return efficiencyLossNorth;
	}
	
	public void setEfficiencyLossNorth(double efficiencyLossNorth) {
		this.efficiencyLossNorth = efficiencyLossNorth;
	}
	
	public double getEfficiencyLossWest() {
		return efficiencyLossWest;
	}
	
	public void setEfficiencyLossWest(double efficiencyLossWest) {
		this.efficiencyLossWest = efficiencyLossWest;
	}
	
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getPercentageNorth() {
		return percentageNorth;
	}
	public void setPercentageNorth(double percentageNorth) {
		this.percentageNorth = percentageNorth;
	}
	public double getPercentageWest() {
		return percentageWest;
	}
	public void setPercentageWest(double percentageWest) {
		this.percentageWest = percentageWest;
	}
}
