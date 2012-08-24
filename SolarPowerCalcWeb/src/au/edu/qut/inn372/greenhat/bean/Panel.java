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
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
}
