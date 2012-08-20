<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h"  uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Solar Power Calculator Login</title>
<LINK href="<%=request.getContextPath()%>/css/greenhat_style.css" rel="stylesheet" type="text/css">
</head>
<body>
<f:view>
    <h:form>
		<h:panelGrid columns="2" styleClass="input">
			<h:outputText value="User"></h:outputText>
			<h:inputText value="charles@greenhat.com"></h:inputText>
			
			<h:outputText value="Password"></h:outputText>
			<h:inputSecret value="123"></h:inputSecret>
			
			<h:outputText value=""></h:outputText>
			<h:commandButton action="equipment.jsp" value="Login"></h:commandButton>
		</h:panelGrid>
	</h:form>
</f:view>
</body>
</html>