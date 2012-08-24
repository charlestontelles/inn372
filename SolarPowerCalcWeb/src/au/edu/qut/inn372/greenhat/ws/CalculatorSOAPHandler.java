package au.edu.qut.inn372.greenhat.ws;

import java.util.Iterator;

import javax.xml.bind.JAXB;
import javax.xml.namespace.QName;
import javax.xml.soap.MessageFactory;
import javax.xml.soap.SAAJResult;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPFault;
import javax.xml.soap.SOAPMessage;
import javax.xml.transform.dom.DOMSource;

import au.edu.qut.inn372.greenhat.ws.jaxws.CalcEnergyProduction;
import au.edu.qut.inn372.greenhat.ws.jaxws.SaveCalculation;

/**
 * 
 * @author Charleston Telles
 *
 */
public class CalculatorSOAPHandler {
	  private static final String NAMESPACE_URI = "http://ws.greenhat.inn372.qut.edu.au/";
	  private static final QName CALC_ENERGY_PRODUCTION_QNAME = new QName(NAMESPACE_URI, "calcEnergyProduction");
	  private static final QName SAVE_CALCULATION_QNAME = new QName(NAMESPACE_URI, "saveCalculation");
	  	  
	  private MessageFactory messageFactory;
	  private CalculatorAdapter calculatorAdapter;
	  
	  public CalculatorSOAPHandler() throws SOAPException {
		    messageFactory = MessageFactory.newInstance();
		    calculatorAdapter = new CalculatorAdapter();
	  }	  
	  
	  public SOAPMessage handleSOAPRequest(SOAPMessage request) throws SOAPException {
		    SOAPBody soapBody = request.getSOAPBody();
		    Iterator iterator = soapBody.getChildElements();
		    Object responsePojo = null;
		    while (iterator.hasNext()) {
		      Object next = iterator.next();
		      if (next instanceof SOAPElement) {
		        SOAPElement soapElement = (SOAPElement) next;
		        QName qname = soapElement.getElementQName();
		          if (CALC_ENERGY_PRODUCTION_QNAME.equals(qname)) {
		            responsePojo = handleCalcEnergyProcutionRequest(soapElement);
		            break;
		          } else if (SAVE_CALCULATION_QNAME.equals(qname)) {
		            responsePojo = handleSaveCalculationRequest(soapElement);
		            break;
		          } 
		      }
		    }
		    SOAPMessage soapResponse = messageFactory.createMessage();
		    soapBody = soapResponse.getSOAPBody();
		    if (responsePojo != null) {
		      JAXB.marshal(responsePojo, new SAAJResult(soapBody));
		    } else {
		      SOAPFault fault = soapBody.addFault();
		      fault.setFaultString("Unrecognized SOAP request.");
		    }
		    return soapResponse;
		  }
	  
	  private Object handleCalcEnergyProcutionRequest(SOAPElement soapElement) {
		    CalcEnergyProduction request = JAXB.unmarshal(new DOMSource(soapElement), CalcEnergyProduction.class);
		    return calculatorAdapter.calcEnergyProduction(request);
	  }

	  private Object handleSaveCalculationRequest(SOAPElement soapElement) {
		    SaveCalculation request = JAXB.unmarshal(new DOMSource(soapElement), SaveCalculation.class);
		    return calculatorAdapter.saveCalculation(request);
	  }
	  
}
