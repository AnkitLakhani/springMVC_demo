<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css" />
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/AddCustomer.css" />
</head>
<body>
<div id="wrapper">
<div id="header">
<h2>CRM-customer relationship manager</h2>
</div>
</div>
<div class="container">
<h3>Save data</h3>
<form:form action="saveCustomer" modelAttribute="customer" method="post">
<form:hidden path="id"/>
<table>
<tbody>
<tr>
<td>
<label>First Name</label>
</td>
<td>
<form:input path="firstName"/>
</td>
</tr>


<tr>
<td>
<label>Last Name</label>
</td>
<td>
<form:input path="lastName"/>
</td>
</tr>


<tr>
<td>
<label></label>
</td>
<td>
<input type="submit" value="save" class="save"/>
</td>
</tr>
</tbody>
</table>
</form:form>
<p>
<a href="${pageContext.request.contextPath}/customer/list">Goback to list</a>
</p>
</div>
</body>
</html>