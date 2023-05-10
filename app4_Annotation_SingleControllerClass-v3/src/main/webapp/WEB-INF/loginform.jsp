<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login form</title>
</head>
<body>
	<center>
		<h3>BMW - Login Page</h3>
		<form action="authenticateUser" method="post">
			<table>
				<tr>
					<th>Username
					<th>
					<td><input type="text" name="uname"></td> 
				</tr>
				<tr>
					<th>Password
					<th>
					<td><input type="password" name="password"></td>
				</tr> 
				<tr><td><input type="submit" value="Login"></td></tr>
			</table>
		</form>
	</center>
</body>
</html>