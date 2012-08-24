
package au.edu.qut.inn372.greenhat.ws.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "saveCalculationResponse", namespace = "http://ws.greenhat.inn372.qut.edu.au/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "saveCalculationResponse", namespace = "http://ws.greenhat.inn372.qut.edu.au/")
public class SaveCalculationResponse {

    @XmlElement(name = "result", namespace = "")
    private String result;

    /**
     * 
     * @return
     *     returns String
     */
    public String getResult() {
        return this.result;
    }

    /**
     * 
     * @param result
     *     the value for the result property
     */
    public void setResult(String result) {
        this.result = result;
    }

}
