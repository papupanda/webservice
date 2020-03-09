<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>Welcome to Page</h3>
${msg}
<form:form action="save" method="post" modelAttribute="emp">
<table>
<tr>
<th>NAME</th>
<td><form:input path="empName"/></td>
</tr>
<tr>
<th>SALARY</th>
<td><form:input path="empsal"/></td>
</tr>
<tr>
<td><input type="reset" value="Reset"/></td>
<td><input type="submit" value="Register"/></td>
</tr>
</table>
</form:form>
</body>
</html>