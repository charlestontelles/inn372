/**
 * 
 */
package au.edu.qut.inn372.greenhat.bean;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;


/**
 * 
 * Bean that represents a location
 * @author Martin Daniel
 *
 */

@ManagedBean
@SessionScoped
public class Location implements Serializable{

	private static final long serialVersionUID = -3413151911222121469L;
	
	private double sunLightHours;
	
	@ManagedProperty (value = "#{roof}")
	private Roof roof;

	public Roof getRoof() {
		return roof;
	}

	public void setRoof(Roof roof) {
		this.roof = roof;
	}

	public double getSunLightHours() {
		return sunLightHours;
	}

	public void setSunLightHours(double sunLightHours) {
		this.sunLightHours = sunLightHours;
	}
}
