<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="/save" method="get" modelAttribute="employee"> 
<div align="center"><h2>Add Employee</h2></div>
<div align="center">
<table border=1>
<tr><td>Employee Name</td>
<td><form:input path="empName" name="employee name"/></td></tr>
<tr><td>Employee Age</td>
<td><form:input path="empAge" name="employee age"/></td></tr>
<tr><td>Employee Salary</td>
<td><form:input path="empSal" name="employee Salary"/></td></tr>
<tr><td>Mobile Number</td>
<td><form:input path="mob" name="Mobile Number"/></td></tr>
<tr><td></td>
<td><input type="submit" value="Add Employee"/></td></tr>
</br>



</table>
</div>

</form:form>

</body>
</html>