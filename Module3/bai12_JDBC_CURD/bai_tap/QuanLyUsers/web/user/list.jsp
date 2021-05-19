<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Users Management</title>
</head>
<body>
<h1>Users Management</h1>
<p>
    <a href="/users?action=create">Create new user</a>
</p>
<p>
    <c:out value="${message}"></c:out>
</p>
<table border="1">
    <tr>
        <th>Id</th>
        <th>Name</th>
        <th>Email</th>
        <th>Country</th>
    </tr>
    <c:forEach items="${requestScope['Users']}" var="user">
        <tr>
            <td>${user.getId()}</td>
            <td>${user.getName()}</td>
            <td>${user.getEmail()}</td>
            <td>${user.getCountry()}</td>
            <td><a href="/users?action=edit&id = ${user.getId()}">Edit</a> </td>
            <td><a href="/users?action=delete&id = ${user.getId()}">Delete</a> </td>
            <td><a href="/users?action=search&id = ${user.getId()}">Search</a> </td>
        </tr>

    </c:forEach>
</table>

</body>
</html>