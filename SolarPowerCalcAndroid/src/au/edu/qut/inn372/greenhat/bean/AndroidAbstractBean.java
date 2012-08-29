package au.edu.qut.inn372.greenhat.bean;

import org.ksoap2.serialization.SoapObject;
/**
 * 
 * @author Charleston Telles
 *
 */
public abstract class AndroidAbstractBean {
    protected static final String NAMESPACE = "http://ws.greenhat.inn372.qut.edu.au/";
    protected static final String OPERATION_CALC_EQUIPMENT_NAME = "calcEquipment";
    public static final int OPERATION_CALC_EQUIPMENT = 0;
    protected static final String OPERATION_CALC_ENERGY_PRODUCTION_NAME = "calcEnergyProduction";
    public static final int OPERATION_CALC_ENERGY_PRODUCTION = 1;
    protected static final String OPERATION_SAVE_CALCULATION_NAME = "saveCalculation";
    public static final int OPERATION_SAVE_CALCULATION = 2;
    
    protected SoapObject soapObject = null;
    
	public SoapObject getSoapObject(int soapOperation){
		this.setSoapObject(soapOperation);
		return soapObject;
	}
	
	protected abstract void setSoapObject(int soapOperation);
}
