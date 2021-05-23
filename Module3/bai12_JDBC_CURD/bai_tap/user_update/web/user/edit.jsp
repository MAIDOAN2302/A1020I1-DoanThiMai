
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
            <caption>
                <h2>Edit User</h2>
            </caption>
            <c:if test="${user!=null}">
                <input type="text" name="id" value="<c:out value='${user.id}'/>"/>
            </c:if>
            <tr>
                <th>User Name:</th>
                <td>
                    <input type="text" name="name" size="45" value="<c:out value='${user.name}'/>"/>
                </td>
            </tr>
            <tr>
                <th>User Email:</th>
                <td>
                    <input type="text" name="email" size="45" value="<c:out value='${user.email}'/>"/>
                </td>
            </tr>
            <tr>
                <th>Country:</th>
                <td>
                    <input type="text" name="country" size="45" value="<c:out value='${user.country}'/>"/>
                </td>
            </tr>
            <tr>
                <td colspan="2" align="center">
                    <input type="submit" value="Save">
                </td>
            </tr>
        </table>
    </form>
</div>
</body>
</html>
