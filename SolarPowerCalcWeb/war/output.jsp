<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h"  uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Solar Calculator -&gt; Solar Power Details</title>
<LINK href="<%=request.getContextPath()%>/css/greenhat_style.css" rel="stylesheet" type="text/css">
</head>
<body>
<f:view>
    <h:form styleClass="input" >
    	<h1 align = "center"> Solar Power Generation </h1>
    <table style="width: 402px;" align="center">
	<tr>
	<td>
		<fieldset> 
			<table style="width: 402px;">
				<tr>
					<td> </td>
					<td align="left">Daily Solar Power Generation: <h:outputText value="#{calculator.result} KWh"></h:outputText></td>
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