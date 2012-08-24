/**
 * 
 */
package au.edu.qut.inn372.greenhat.bean;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


/**
 * 
 * Bean that represents a customer
 * @author Martin Daniel
 *
 */

@ManagedBean
@SessionScoped
public class Customer implements Serializable {

	private static final long serialVersionUID = 7549990716571383217L;
	
	private Location location;
	private Tariff tariff;
	private ElectricityUsage electricityUsage;
	
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	public Tariff getTariff() {
		return tariff;
	}
	public void setTariff(Tariff tariff) {
		this.tariff = tariff;
	}
	public ElectricityUsage getElectricityUsage() {
		return electricityUsage;
	}
	public void setElectricityUsage(ElectricityUsage electricityUsage) {
		this.electricityUsage = electricityUsage;
	}
}
