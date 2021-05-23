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
    <p style="text-align: center">
        <c:out value="${message=='Created new User Succeed'}">
            <span style="color: blue">Created new User Succeed</span>
        </c:out>
    </p>
</center>
<div align="center">
    <form method="post">
        <table border="1" cellpadding="5">
            <caption>
                <h2>Add new user</h2>
            </caption>
            <tr>
                <th>User name:</th>
                <td><input type="text" name="name" id="name" size="45"></td>
            </tr>
            <tr>
                <th>User email:</th>
                <td><input type="text" name="email" id="email" size="45"></td>
            </tr>
            <tr>
                <th>Country:</th>
                <td><input type="text" name="country" id="country" size="45"></td>
            </tr>
            <tr>
                <td colspan="2" align="center">
                    <input type="submit" value="save">
                </td>
            </tr>
        </table>
    </form>
</div>
</body>
</html>
