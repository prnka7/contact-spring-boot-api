<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="addContact">
		<table>
			<tr>
				<td>ID:</td>
				<td><input type="text" name="cid"></td>
			</tr>
			<br>
			<tr>
				<td>Name:</td><td><input type="text" name="cname"></td>
			</tr>
			<br>
			<tr>
				<td>Contact Number 1:</td><td><input type="text" name="cnumber1"></td>
			</tr>
			<br>
			<tr>
				<td>Contact Number 2:</td><td><input type="text" name="cnumber2"></td>
			</tr>
			<br>
			<tr>
				<td>Email:</td><td><input type="text" name="email"></td>
			</tr> <br>
			<tr>
				<td>Address:</td><td><input type="text" name="address"></td>
			</tr> <br>
			<tr>
				<td><input type="submit"></td>
			</tr>
		</table>
	</form>
	
	<h2>Get Contact</h2>
	<form action="getContact">
		<table>
			<tr>
				<td>ID:</td>
				<td><input type="text" name="cid"></td>
			</tr>
			<br>
			<tr>
				<td><input type="submit"></td>
			</tr>
		</table>
	</form>

</body>
</html>