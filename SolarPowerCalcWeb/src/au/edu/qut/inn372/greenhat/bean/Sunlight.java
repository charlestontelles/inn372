/**
 * 
 */
package au.edu.qut.inn372.greenhat.bean;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


/**
 * 
 * Bean that represents sunlight
 * @author Martin Daniel
 *
 */

@ManagedBean
@SessionScoped
public class Sunlight implements Serializable {
	
	private static final long serialVersionUID = 192594841205611668L;
	
	private double sunLightHours;

	public double getSunLightHours() {
		return sunLightHours;
	}

	public void setSunLightHours(double sunLightHours) {
		this.sunLightHours = sunLightHours;
	}
}
