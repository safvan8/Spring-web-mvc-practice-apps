<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Durga Software Solutions</h2>
	<h3>User Hello Form</h3>
	<form action="generateWishMessage.do">
		<table>
			<tr>
				<td>User Name</td>
				<td><input type="text" name="uname" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="SayHello" /></td>
			</tr>
		</table>
	</form>
	<jsp:forward page="" />
</body>
</html>