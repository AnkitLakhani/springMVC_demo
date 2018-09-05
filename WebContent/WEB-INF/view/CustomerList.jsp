<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Customer List</title>
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css" />
</head>
<body>
<div id="wrapper">
<div id="header">
<h2>CRM-customer relationship manager</h2>
</div>
</div>

<div id="container">
<div id="content">
<input type="button" value="AddCustomer" onclick="window.location.href='showCustomerAdd';return false;" class="add-button"/>
<table>
<tr>
<th>First Name</th>
<th>Last Name</th>
</tr>
<c:forEach var="customerdata" items="${customer}">

<c:url var="deleteLink" value="/customer/deleteCustomer">
<c:param name="customerID" value="${customerdata.id }"></c:param>
</c:url>

<c:url var="updateLink" value="/customer/updateCustomer">
<c:param name="customerID" value="${customerdata.id }"></c:param>
</c:url>
<tr>
<td>
${customerdata.firstName}
</td>
<td>
${customerdata.lastName}
</td>
<td><a href="${updateLink}">update</a>|<a href="${deleteLink}" onclick="if(!(confirm('are you sure u wanna delete'))) return false">delete</a></td>
</tr>
</c:forEach>
</table>
</div>
</div>
</body>
</html>