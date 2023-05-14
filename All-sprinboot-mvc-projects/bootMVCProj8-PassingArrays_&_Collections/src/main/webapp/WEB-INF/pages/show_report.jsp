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
	<!-- printing Array -->
	<b>Arrays Data</b>
	<br />
	<c:forEach var="name" items="${nickNames}">
		${name}<br />
	</c:forEach>
	<hr />
	
	<!-- printing List -->
	<b>List Data</b>
	<br />
	<c:forEach var="course" items="${coursesInfo}">
		${course }<br />
	</c:forEach>
	<hr />

	<!-- printing Set -->
	<b> Phone number (set)::</b>
	<br>
	<c:forEach var="phone" items="${phonesInfo}">
        ${phone} <br>
	</c:forEach>
	<hr />

	<!-- printing Map -->	
	<b> ids Info (Map)::</b>
	<br>
	<c:forEach var="id" items="${idsInfo}">
        ${id.key} ===> ${id.value} <br>
	</c:forEach>
</body>
</html>