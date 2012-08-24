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
public class ElectricityUsage implements Serializable{
	
	private static final long serialVersionUID = -8315704050812581587L;
	
	private double dailyAverageUsage;
	private double dayTimeHourlyUsage;

	public double getDailyAverageUsage() {
		return dailyAverageUsage;
	}
	
	public void setDailyAverageUsage(double dailyAverageUsage) {
		this.dailyAverageUsage = dailyAverageUsage;
	}
	
	public double getDayTimeHourlyUsage() {
		return dayTimeHourlyUsage;
	}
	
	public void setDayTimeHourlyUsage(double dayTimeHourlyUsage) {
		this.dayTimeHourlyUsage = dayTimeHourlyUsage;
	}
}
