package au.edu.qut.inn372.greenhat.ws;

import org.ksoap2.SoapEnvelope;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.ksoap2.transport.HttpTransportSE;
/**
 * 
 * @author Charleston Telles
 *
 */
public class CalculatorSoapClient {
    //private final String URL = "http://solarpowercalcwebtest.appspot.com/hellosoapserver";
	private final String URL = "http://solarpowercalcweb.appspot.com/calculatorsoapserver";
    private final String SOAP_ACTION = "";
    
    private SoapSerializationEnvelope envelope;
    private HttpTransportSE androidHttpTransport;
    private SoapObject responseObject;
    
   public CalculatorSoapClient(){
	   envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
   	   envelope.dotNet = false;
   	   androidHttpTransport = new HttpTransportSE(URL);
   }
   
   public SoapObject synchronousRequest(SoapObject soapObject){
	   try {
		   envelope.setOutputSoapObject(soapObject);
		   androidHttpTransport.call(SOAP_ACTION, envelope);
		   responseObject = (SoapObject)envelope.bodyIn;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return responseObject;
   }
}
