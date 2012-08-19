package au.edu.qut.inn372.greenhat.dao;

import au.edu.qut.inn372.greenhat.bean.Calculator;
/**
 * Data Access Object to provide operations related to the Calculator
 * 
 * @author Charleston
 *
 */
public interface CalculatorDAO {
	public void saveCalculation(Calculator calculator);
	public void deleteCalculation (Calculator calculator);
	public void updateCalculation (Calculator calculator);
	public Calculator getCalculation (String[][] filter);
	public Calculator[] getCalculations (String[][] filter);
}
