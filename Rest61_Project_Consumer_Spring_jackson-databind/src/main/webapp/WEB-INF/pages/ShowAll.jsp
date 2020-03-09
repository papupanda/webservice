<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="1">
<tr>
<th>ID</th>
<th>EmployeeName</th>
<th>EmpSal</th>
<th colspan="1">Operation</th>
</tr>
<c:forEach var="emp" items="${list}">
<tr>
<td>${emp.empid}</td>
<td>${emp.empName}</td>
<td>${emp.empsal}</td>
<td><a href="edit?id=${emp.empid}">Edit</a>
<a href="delete?id=${emp.empid}">Delete</a></td>

</tr>
</c:forEach>
</table>
</body>
</html>