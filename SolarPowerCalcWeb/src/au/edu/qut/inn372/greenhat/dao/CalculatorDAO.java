package au.edu.qut.inn372.greenhat.dao;

import au.edu.qut.inn372.greenhat.bean.Calculator;

public interface CalculatorDAO {
	public void saveCalculation(Calculator calculator);
	public void deleteCalculation (Calculator calculator);
	public void updateCalculation (Calculator calculator);
	public Calculator getCalculation (String[][] filter);
	public Calculator[] getCalculations (String[][] filter);
}
