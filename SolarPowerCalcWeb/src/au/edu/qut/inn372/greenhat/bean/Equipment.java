package au.edu.qut.inn372.greenhat.bean;

import java.io.Serializable;
import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
/**
 * Bean that represents a Equipment
 * 
 * @author Charleston Telles
 *
 */
@ManagedBean
@SessionScoped
public class Equipment implements Serializable{
	private static final long serialVersionUID = 7549990716571383217L;
	
	private double cost;
	private double size;
	private ArrayList<Panel> panels;
	

	public ArrayList<Panel> getPanels() {
		return panels;
	}
	public void setPanels(ArrayList<Panel> panels) {
		this.panels = panels;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public double getSize() {
		return size;
	}
	public void setSize(double size) {
		this.size = size;
	}
	
}
