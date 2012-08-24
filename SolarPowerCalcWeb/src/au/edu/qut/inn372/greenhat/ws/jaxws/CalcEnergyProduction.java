
package au.edu.qut.inn372.greenhat.ws.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "calcEnergyProduction", namespace = "http://ws.greenhat.inn372.qut.edu.au/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "calcEnergyProduction", namespace = "http://ws.greenhat.inn372.qut.edu.au/")
public class CalcEnergyProduction {

    @XmlElement(name = "calculator", namespace = "")
    private au.edu.qut.inn372.greenhat.bean.Calculator calculator;

    /**
     * 
     * @return
     *     returns Calculator
     */
    public au.edu.qut.inn372.greenhat.bean.Calculator getCalculator() {
        return this.calculator;
    }

    /**
     * 
     * @param calculator
     *     the value for the calculator property
     */
    public void setCalculator(au.edu.qut.inn372.greenhat.bean.Calculator calculator) {
        this.calculator = calculator;
    }

}
