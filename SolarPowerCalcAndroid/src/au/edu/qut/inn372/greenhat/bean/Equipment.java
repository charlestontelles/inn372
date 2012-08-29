package au.edu.qut.inn372.greenhat.bean;

import org.ksoap2.serialization.SoapObject;
/**
 * 
 * @author Charleston Telles
 *
 */
public class Equipment extends AndroidAbstractBean{
	private double cost;
	private double size;
		
	public Equipment(){
	}
	
	public Equipment(SoapObject soapObject, int soapOperation){
		if (soapObject != null)
			switch (soapOperation) {
			case AndroidAbstractBean.OPERATION_CALC_EQUIPMENT:
				this.size = new Double(((SoapObject)soapObject.getProperty(0)).getProperty("size").toString());
				this.cost = new Double(((SoapObject)soapObject.getProperty(0)).getProperty("cost").toString());
				break;
			default:
				break;
			}		
	}
	
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public double getSize() {
		return size;
	}
	public void setSize(double size) {
		this.size = size;
	}

	/**
	 * ATTENTION: ALL VALUES MUST BE CONVERTED TO STRING
	 */
	@Override
	protected void setSoapObject(int soapOperation) {
		switch (soapOperation) {
		case AndroidAbstractBean.OPERATION_CALC_EQUIPMENT:
			this.soapObject = new SoapObject(AndroidAbstractBean.NAMESPACE,AndroidAbstractBean.OPERATION_CALC_EQUIPMENT_NAME);
			SoapObject child = new SoapObject ("", "equipment");
			child.addProperty("cost", ""+this.cost);
			child.addProperty("size", ""+this.size);
			this.soapObject.addSoapObject(child);
			break;
		default:
			break;
		}
		
	}
}
