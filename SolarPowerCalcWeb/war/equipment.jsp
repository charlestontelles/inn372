<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h"  uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Equipment</title>
<LINK href="<%=request.getContextPath()%>/css/greenhat_style.css" rel="stylesheet" type="text/css">
</head>
<body>
<f:view>
    <h:form>
		<h:panelGrid columns="2" styleClass="input">
			<h:outputText value="Cost"></h:outputText>
			<h:inputText value="#{equipment.cost}"></h:inputText>
			
			<h:outputText value="Size"></h:outputText>
			<h:inputText value="#{equipment.size}"></h:inputText>
			
			<h:outputText value="Number of Panels"></h:outputText>
			<h:selectOneMenu validatorMessage="required">
  				<f:selectItems value="#{calculatorController.panels}" />
			</h:selectOneMenu>
				
			<h:commandButton action="#{calculatorController.calcEnergyProduction}" value="Calculate"></h:commandButton>
			<h:commandButton action="#{calculatorController.saveCalculation}" value="Save"></h:commandButton>
				
			<h:outputText value="Result"></h:outputText>
			<h:outputText value="#{calculator.result}"></h:outputText>			
		</h:panelGrid>
	</h:form>
</f:view>
</body>
</html>