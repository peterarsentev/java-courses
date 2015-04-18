<%@ page language="java" pageEncoding="UTF-8" session="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
	<title></title>
</head>
<body>
<a href="${pageContext.servletContext.contextPath}/views/user/CreateUser.jsp">Добавить пользователя</a>
<table border="1">
	<tr>
		<td>Логин Email</td>
		<td>Действия</td>
	</tr>
	<c:forEach items="${users}" var="user" varStatus="status">
		<tr valign="top">
			<td>${user.login} ${user.email}</td>
			<td>
				<a href="${pageContext.servletContext.contextPath}/user/edit?id=${user.id}">Редактировать</a>
				<a href="${pageContext.servletContext.contextPath}/user/delete?id=${user.id}">Удалить</a>
			</td>
		</tr>
	</c:forEach>
</table>
</body>
</html>