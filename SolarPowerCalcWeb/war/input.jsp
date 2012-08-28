<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h"  uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Solar Calculator Tool-&gt; Solar Power Details</title>
<LINK href="<%=request.getContextPath()%>/css/greenhat_style.css" rel="stylesheet" type="text/css">
</head>
<body>
  		<h3 align = "center"> Solar Calculator </h3>

	
		<f:view>
		    <h:form styleClass="input">
		    <table style="width: 400px;" align="center">
			<tr>
			<td>
				<fieldset>
				<legend style = "align: center"> Equipment Details</legend>
				<table style="width: 400px;" align="center">
					<!-- <tr>
						<td style="width: 250px;"><h:outputText value="Cost"></h:outputText></td>
						<td><h:inputText value="#{equipment.cost}"></h:inputText></td>
					</tr> -->
					
					<tr>
						<td style="width: 250px;"><h:outputText value="System Size (KWh):"></h:outputText></td>
						<td><h:inputText value="#{equipment.size}"></h:inputText></td>
					</tr>
					<tr>
						<td style="width: 250px;"><h:outputText value="Inverter Efficiency (%):"></h:outputText></td>
						<td><h:inputText value="#{inverter.efficiency}"></h:inputText></td>
					</tr>
					<tr>
						<td style="width: 250px;"><h:outputText value="Number of Panels"></h:outputText></td>
						<td>
							<h:selectOneMenu validatorMessage="required">
		        				<f:selectItems value="#{calculatorController.panels}" />
		      				</h:selectOneMenu>
						</td>
					</tr>
				</table>
				</fieldset>
				
				<br/>
				
				<fieldset>
				<legend style = "align: center"> Roof Details</legend>
				<table style="width: 400px;" align="center">
					<tr>
						<td style="width: 250px;"><h:outputText value="Percentage on North Roof:"></h:outputText></td>
						<td><h:inputText value="#{roof.percentageNorth}"></h:inputText></td>
					</tr>
					<tr>
						<td style="width: 250px;"><h:outputText value="Percentage on West Roof:"></h:outputText></td>
						<td><h:inputText value="#{roof.percentageWest}"></h:inputText></td>
					</tr>
					<tr>
						<td style="width: 250px;"><h:outputText value="Efficiency Loss (North Roof):"></h:outputText></td>
						<td><h:inputText value="#{roof.efficiencyLossNorth}"></h:inputText></td>
					</tr>
					<tr>
						<td style="width: 250px;"><h:outputText value="Efficiency Loss (West Roof):"></h:outputText></td>
						<td><h:inputText value="#{roof.efficiencyLossWest}"></h:inputText></td>
					</tr>
				</table>
				</fieldset>
				
				<br />
				
				<fieldset>
				<legend style = "align: center"> Sunlight Details</legend>
				<table style="width: 400px;" align="center">
					<tr>
						<td style="width: 250px;"><h:outputText value="Average Daily Hours of Sunlight:"></h:outputText></td>
						<td><h:inputText value="#{location.sunLightHours}"></h:inputText></td>
					</tr>
				</table>
				</fieldset>
				
				<br />
				
				<fieldset>
				<legend style = "align: center"> Current Energy Usage Details</legend>
				<table style="width: 400px;" align="left">
					<tr>
						<td style="width: 250px;"><h:outputText value="Energy Used Per Day:"></h:outputText></td>
						<td><h:inputText value="#{electricityUsage.dailyAverageUsage}"></h:inputText></td>
					</tr>
					<tr>
						<td style="width: 250px;"><h:outputText value="Energy Used Per DayLight Hours:"></h:outputText></td>
						<td><h:inputText value="#{electricityUsage.dayTimeHourlyUsage}"></h:inputText></td>
					</tr>
				</table>
				</fieldset>
				
				<br />
				
				<fieldset> 
				<table style="width: 400px;">
					<tr>
						<td></td>
						<td align="right">
							<h:commandButton action="#{calculatorController.calculateSolarPower}" value="Calculate"></h:commandButton>
							<h:commandButton action="#{calculatorController.saveCalculation}" value="Save"></h:commandButton>
						</td>
					</tr>
				</table>
				</fieldset>
			</td>
			</tr>
			</table>
			</h:form>
		</f:view>
 </body>
  </html>