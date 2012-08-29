package au.edu.qut.inn372.greenhat.bean;

import org.ksoap2.serialization.SoapObject;

public class Calculator extends AndroidAbstractBean{
	private Equipment equipment;
	private double result;
	
	public Calculator(){
		equipment = new Equipment();
	}
	
	public Calculator(SoapObject soapObject, int soapOperation){
		equipment = new Equipment();
		if (soapObject != null)
			switch (soapOperation) {
			case AndroidAbstractBean.OPERATION_CALC_ENERGY_PRODUCTION:
				this.result = new Double(((SoapObject)soapObject.getProperty(0)).getProperty("result").toString());
				this.equipment.setSize(new Double(((SoapObject)((SoapObject)soapObject.getProperty(0)).getProperty(0)).getProperty("size").toString()));
				this.equipment.setCost(new Double(((SoapObject)((SoapObject)soapObject.getProperty(0)).getProperty(0)).getProperty("cost").toString()));
				break;
			case AndroidAbstractBean.OPERATION_SAVE_CALCULATION:
				break;
			default:
				break;
			}		
	}
	public Equipment getEquipment() {
		return equipment;
	}
	public void setEquipment(Equipment equipment) {
		this.equipment = equipment;
	}
	public double getResult() {
		return result;
	}
	public void setResult(double result) {
		this.result = result;
	}
	
	/**
	 * ATTENTION: ALL VALUES MUST BE CONVERTED TO STRING
	 */
	@Override
	protected void setSoapObject(int soapOperation) {
		SoapObject parent;
		SoapObject child;
		SoapObject subchild;
		switch (soapOperation) {
		case AndroidAbstractBean.OPERATION_CALC_ENERGY_PRODUCTION:
			this.soapObject = new SoapObject(AndroidAbstractBean.NAMESPACE,AndroidAbstractBean.OPERATION_CALC_ENERGY_PRODUCTION_NAME);
			parent = new SoapObject ("", "calculator");
			parent.addProperty("result",""+this.result);
			child = new SoapObject ("", "equipment");
			child.addProperty("cost", ""+this.equipment.getCost());
			child.addProperty("size", ""+this.equipment.getSize());
			subchild = new SoapObject ("", "panels");
			subchild.addProperty("id", "1");
			subchild.addProperty("height", "2");
			subchild.addProperty("width", "2");
			child.addSoapObject(subchild);
			parent.addSoapObject(child);
			this.soapObject.addSoapObject(parent);
			break;
		case AndroidAbstractBean.OPERATION_SAVE_CALCULATION:
			this.soapObject = new SoapObject(AndroidAbstractBean.NAMESPACE,AndroidAbstractBean.OPERATION_SAVE_CALCULATION_NAME);
			parent = new SoapObject ("", "calculator");
			parent.addProperty("result",this.result);
			child = new SoapObject ("", "equipment");
			child.addProperty("cost", ""+this.equipment.getCost());
			child.addProperty("size", ""+this.equipment.getSize());
			subchild = new SoapObject ("", "panels");
			subchild.addProperty("id", "1");
			subchild.addProperty("height", "2");
			subchild.addProperty("width", "2");
			child.addSoapObject(subchild);
			parent.addSoapObject(child);
			this.soapObject.addSoapObject(parent);
			break;
		default:
			break;
		}
		
	}
	
}
