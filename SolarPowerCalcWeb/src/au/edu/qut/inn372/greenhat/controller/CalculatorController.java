package au.edu.qut.inn372.greenhat.controller;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;

import au.edu.qut.inn372.greenhat.bean.Calculator;
import au.edu.qut.inn372.greenhat.dao.CalculatorDAO;
import au.edu.qut.inn372.greenhat.dao.gae.CalculatorDAOImpl;

@ManagedBean
@SessionScoped
public class CalculatorController implements Serializable {

	private static final long serialVersionUID = 8091277788980459284L;
	
	@ManagedProperty (value = "#{calculator}")
	private Calculator calculator;
	
	private CalculatorDAO calculatorDAO = new CalculatorDAOImpl();

	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}
	
	public void calcEnergyProduction(){
		calculator.calculate();
		nextPage("output.jsp");
	}

	private void nextPage(String url) {
		FacesContext fc = FacesContext.getCurrentInstance(); 
		ExternalContext ec = fc.getExternalContext(); 
		try { 
		        ec.redirect(url); 
		} catch (IOException ex) { 
				System.out.println("Error displaying the page");
		}
	}
	
	public void saveCalculation(){
		calculatorDAO.saveCalculation(calculator);
	}
	
	public List<SelectItem> getPanels() {
		    List<SelectItem> list = new ArrayList<SelectItem>();
		    list.add(new SelectItem(1, "1"));
		    list.add(new SelectItem(2, "2"));
		    list.add(new SelectItem(3, "3"));
		    list.add(new SelectItem(4, "4"));
		    list.add(new SelectItem(5, "5"));
		    return list;
	}

}
