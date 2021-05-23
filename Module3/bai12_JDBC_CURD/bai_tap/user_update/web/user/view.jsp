
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Users Management</title>
</head>
<body>
<center>
    <h1>Users Management</h1>
    <h2>
        <a href="/users?action=users">List All Users</a>
    </h2>
</center>
<div style="text-align: center">
    <form method="post">
        <table border="1" cellpadding="5">
            <tr>
                <td>Id:</td>
                <td><c:out value="${user.getId()}"/></td>
            </tr>
            <tr>
                <td>Name:</td>
                <td><c:out value="${user.getName()}"/></td>
            </tr>
            <tr>
                <td>Email:</td>
                <td><c:out value="${user.getEmail()}"/></td>
            </tr>
            <tr>
                <td>Country:</td>
                <td><c:out value="${user.getCountry()}"/></td>
            </tr>
        </table>
    </form>
</div>
<div style="display: flex">
    <a href="/product" class="a-tag-button">&#8592;Back</a>
</div>
</body>
</html>
