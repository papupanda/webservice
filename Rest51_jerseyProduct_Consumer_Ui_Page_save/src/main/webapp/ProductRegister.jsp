<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>Welcome To Product register Page</h3>
<form action="save" method="POST">
<pre>
ID::<input type="text" name="pid">
CODE::<input type="text" name="pcode">
COST::<input type="text" name="pcost">
<input type="submit" value="Register">
</pre>
</form>
${message}
</body>
</html>