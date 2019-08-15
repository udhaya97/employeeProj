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
<form:form action="/getall" method="get" modelAttribute="employee"> 
<div align="center"><h2>Listed Details</h2></div>
<div align="center"><h3><a href="/first">create employee</a></h3></div>
<div align="center">
<table border=1>
<tr><th>Id</th><th>Name</th><th>Age</th><th>Salary</th><th>Mobile Number</th> <th>Actions</th></tr>
<c:forEach items= "${listall}" var="empdet">

<tr><td>${empdet.empId}</td>
<td>${empdet.empName}</td>
<td>${empdet.empAge}</td>
<td>${empdet.empSal}</td>
<td>${empdet.mob}</td>
<td><a href="third/${empdet.empId}">Edit</a>
<a href="fourth/${empdet.empId}">Delete</a></tr>

</c:forEach>

</table>
</div>

</form:form>
</body>
</html>