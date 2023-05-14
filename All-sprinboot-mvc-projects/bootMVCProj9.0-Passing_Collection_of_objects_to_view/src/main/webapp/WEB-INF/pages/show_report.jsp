<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table border="1" align="center">
		<tr>
			<th>eno</th>
			<th>ename</th>
			<th>desg</th>
			<th>salary</th>
		</tr>
		<c:forEach var="emp" items="${empsInfo}">
			<tr>
				<td>${emp.eno}</td>
				<td>${emp.ename}</td>
				<td>${emp.desg}</td>
				<td>${emp.salary}</td>
			</tr>
		</c:forEach>
	</table>


	<!-- To print details of single player -->
	<table border="1" align="center">
		<h1 style="color: green;align-content: center;">Printing Single Object</h1>
		<tr>
			<th>eno</th>
			<th>ename</th>
			<th>desg</th>
			<th>salary</th>
		</tr>
		<tr>
			<td>${footballer.eno}</td>
			<td>${footballer.ename}</td>
			<td>${footballer.desg}</td>
			<td>${footballer.salary}</td>
		</tr>
	</table>
</body>
</html>