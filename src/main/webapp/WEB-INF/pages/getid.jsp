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
<form:form action="/getall" method="get" modelAttribute="employee"> 
<div align="center"><h2>Get Id</h2></div>

<table>
<tr><td>Employee id</td>
<td><form:input path="empId" name="employee name"/></td></tr>
<
<td><input type="submit" value="Get Details"/></td></tr>
</br>



</table>

</form:form>

</body>
</html>