<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>User Management</title>
</head>
<body>
<h1>User Management</h1>
<p>
    <a href="/managerUsers?action=create">Create new User</a>
</p>
<p>
    <c:out value="${message}"/>
</p>
<table border="1">
    <tr>
        <th>Id</th>
        <th>Name</th>
        <th>Email</th>
        <th>Country</th>
    </tr>
    <c:forEach items="${requestScope['managerUsers']}" var="user">
        <tr>
            <td>${user.getId()}</td>
            <td><a href="managerUsers?action=view&id=${user.getId()}">${user.getName()}</a></td>
            <td>${user.getEmail()}</td>
            <td>${user.getCountry()}</td>
            <td><a href="/managerUsers?action=edit&id=${product.getId()}">Edit</a></td>
            <td><a href="/managerUsers?action=delete&id=${product.getId()}">Delete</a></td>
            <td><a href="/managerUsers?action=search&id=${product.getId()}">Search</a></td>
            <td><a href="/managerUsers?action=sort&id=${product.getId()}">Sort By Name</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
