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
	/**
	 * @return the dailyAverageUsage
	 */
	public double getDailyAverageUsage() {
		return dailyAverageUsage;
	}
	/**
	 * @param dailyAverageUsage the dailyAverageUsage to set
	 */
	public void setDailyAverageUsage(double dailyAverageUsage) {
		this.dailyAverageUsage = dailyAverageUsage;
	}
	/**
	 * @return the dayTimeHourlyUsage
	 */
	public double getDayTimeHourlyUsage() {
		return dayTimeHourlyUsage;
	}
	/**
	 * @param dayTimeHourlyUsage the dayTimeHourlyUsage to set
	 */
	public void setDayTimeHourlyUsage(double dayTimeHourlyUsage) {
		this.dayTimeHourlyUsage = dayTimeHourlyUsage;
	}
}
