<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
     <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="/update/${listall.empId}" method="get" modelAttribute="employee"> 
<div align="center"><h2>Listed Details</h2></div>
<div align="center">
<table>
<tr><th>Id</th><th>Name</th><th>Age</th><th>Salary</th><th><th>Mobile Number</th></tr>


<tr><td>${listall.empId}</td>
<td><form:input path="empName" value="${listall.empName}"/></td>
<td><form:input path="empAge" value="${listall.empAge}"/></td>
<td><form:input path="empSal" value="${listall.empSal}"/></td>
<td><form:input path="mob" value="${listall.mob}"/></td>
<td><input type="submit" value="save"></td></tr>


</table>

</div>
</form:form>

</body>
</html>