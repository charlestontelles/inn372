package au.edu.qut.inn372.greenhat.dao.gae;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import au.edu.qut.inn372.greenhat.bean.Calculator;
import au.edu.qut.inn372.greenhat.dao.CalculatorDAO;

@ManagedBean
@SessionScoped
public class CalculatorDAOImpl implements CalculatorDAO {

	@Override
	public void saveCalculation(Calculator calculator) {
		System.out.println("saving calculation: " + calculator.getSolarPower());		
	}

	@Override
	public void deleteCalculation(Calculator calculator) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateCalculation(Calculator calculator) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Calculator getCalculation(String[][] filter) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Calculator[] getCalculations(String[][] filter) {
		// TODO Auto-generated method stub
		return null;
	}

}
