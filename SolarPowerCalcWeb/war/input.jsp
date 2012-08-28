<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h"  uri="http://java.sun.com/jsf/html"%>

<%@ page import="java.util.List" %>
<%@ page import="com.google.appengine.api.users.User" %>
<%@ page import="com.google.appengine.api.users.UserService" %>
<%@ page import="com.google.appengine.api.users.UserServiceFactory" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Solar Calculator Tool-&gt; Solar Power Details</title>
<LINK href="<%=request.getContextPath()%>/css/greenhat_style.css" rel="stylesheet" type="text/css">
</head>
<body>
    <!-- =============== HEADER =============== -->
    <div id="header" align = "center">
            <img src = "logo.jpg" alt = "Header Logo" class = "logoSize" />
    </div>  <!-- end div header -->

    <!-- =============== BREADCRUMB =============== -->
    <div id="breadcrumb">
    	<table width = "100%">
    		<tr>
    			<td align = "left"> You are here: Home</td>
    			<td align = "right">
    				<%
	    			UserService userService = UserServiceFactory.getUserService();   
			    	User user = userService.getCurrentUser(); 
			    	if (user != null) {      
						pageContext.setAttribute("user", user);
					%>
					Welcome, ${fn:escapeXml(user.email)}!
					<a href="<%= userService.createLogoutURL("/faces/welcome.jsp") %>">Sign out</a>
					<%
					}%>
				</td>
    		</tr>
    	</table>
    </div>

    <!-- =============== MAIN =============== -->
    <div id="main">
       <div id="menu"> <!-- start main menu div -->
        
	        <h2>Navigation </h2>

	        <h3>.........</h3>
            <ul>
	            <li> <a href = ""> ....... </a></li>
	            <li> <a href = ""> ...... </a></li>
            </ul>
	        <h3>Useful links </h3>
            <ul>
	            <li> <a href = ""> ..... </a></li>
	            <li> <a href = ""> .......</a></li>
            </ul>
	        <h3>About us</h3>
            <ul>
	            <li> <a href = ""> Contact us</a></li>
	            <li> <a href = ""> About us </a></li>
            </ul>
       </div>  <!-- end menu div -->

       <div id="content"> <!-- start content div -->
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
		</div>
    </div>  <!-- end main div -->

    <!-- =============== FOOTER =============== -->
    <div id="footer">
		<div id="copyright"> <!-- start copyright div -->
         	<span class = "copyYourName"><a href="mailto:martin.daniel@student.qut.edu.au">&copy Greenhat Solar Systems</a></span><br />
         	All images &copy Greenhat Solar Systems
      	</div> <!-- end copyright div -->

      	<div id="lastupdate"> <!-- start lastupdate div -->
         	Last updated: 27 August 2012
      	</div> <!-- end lastupdate div -->
    </div>  <!-- end footer div -->

  </body>
  </html>