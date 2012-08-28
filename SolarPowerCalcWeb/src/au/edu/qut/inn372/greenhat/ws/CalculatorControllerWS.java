package au.edu.qut.inn372.greenhat.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import au.edu.qut.inn372.greenhat.bean.Calculator;
import au.edu.qut.inn372.greenhat.dao.CalculatorDAO;
import au.edu.qut.inn372.greenhat.dao.gae.CalculatorDAOImpl;

/**
 * 
 * @author Charleston Telles
 *
 */
@WebService
public class CalculatorControllerWS {
	private Calculator calculator = new Calculator();	
	private CalculatorDAO calculatorDAO = new CalculatorDAOImpl();
	
	@WebMethod
	@WebResult(name = "result") 
	public String saveCalculation(@WebParam(name = "calculator") Calculator calculator){
		try {
			calculatorDAO.saveCalculation(calculator);
			return "ok";
		} catch (Exception e) {
			return "error: " + e;
		}		
	}
	
	@WebMethod
	@WebResult(name = "calculator") 
	public Calculator calcEnergyProduction(@WebParam(name = "calculator") Calculator calculator){
		this.calculator = calculator;
		this.calculator.calculateSolarPower();
		return calculator;
	}
}
