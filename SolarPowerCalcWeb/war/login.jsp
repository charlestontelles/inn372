<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h"  uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<LINK href="<%=request.getContextPath()%>/css/greenhat_style.css" rel="stylesheet" type="text/css">
</head>
<body>
<f:view>
    <h:form styleClass="input">
		<table style="width: 402px;" align="center">
			<tr>
				<td><h:outputText value="User"></h:outputText></td>
				<td><h:inputText></h:inputText></td>
			</tr>
			<tr>
				<td><h:outputText value="Password"></h:outputText></td>
				<td><h:inputText></h:inputText></td>
			</tr>
			<tr>
				<td></td>
				<td>
					<h:commandButton action="equipment.jsp" value="Login"></h:commandButton>
				</td>
			</tr>
		</table>
	</h:form>
</f:view>
</body>
</html>