<%@ page language="java" pageEncoding="UTF-8" session="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
	<title></title>
</head>
<body>
<form action="${pageContext.servletContext.contextPath}/user/edit" method="POST">
	<input type="hidden" name="id" value="${user.id}">
	<table>
		<tr>
			<td align="right" >Login : </td>
			<td>
				<input type="text" name="login" value="${user.login}">
			</td>
		</tr>
		<tr>
			<td align="right" >Email : </td>
			<td>
				<input type="text" name="email" value="${user.email}">
			</td>
		</tr>
		<tr>
			<td><input type="submit" align="center" value="Submit"/></td>
		</tr>
	</table>
</form>
</body>
</html>