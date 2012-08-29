package au.edu.qut.inn372.greenhat.controller;

import au.edu.qut.inn372.greenhat.bean.AndroidAbstractBean;
import au.edu.qut.inn372.greenhat.bean.Calculator;
import au.edu.qut.inn372.greenhat.ws.CalculatorSoapClient;
/**
 * 
 * @author Charleston Telles
 *
 */
public class CalculatorRemoteController {
	private CalculatorSoapClient soapClient = new CalculatorSoapClient();
	
	public Calculator calcEnergyProduction(Calculator calculator){
		return new Calculator(soapClient.synchronousRequest(calculator.getSoapObject(AndroidAbstractBean.OPERATION_CALC_ENERGY_PRODUCTION)),AndroidAbstractBean.OPERATION_CALC_ENERGY_PRODUCTION);
	}
}
