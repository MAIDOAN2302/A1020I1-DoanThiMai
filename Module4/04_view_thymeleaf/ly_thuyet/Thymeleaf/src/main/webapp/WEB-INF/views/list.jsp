<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: KILL YOU
  Date: 6/7/2021
  Time: 9:09 PM
  To change this template use File | Settings | File Templates.
--%>

<html>
<head>
    <title>Title</title>
</head>
<body>

<c:if test="${not empty successMsg}">
    <strong style="color: red">${successMsg}</strong>
</c:if>
<c:if test="${empty successMsg}">
    <strong style="color: red">khong co ms gi het</strong>
</c:if>
<table class="table">
    <thead>
    <tr>
        <th>ID</th>
        <th>Name</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${studentList}" var="student">
    <tr>
        <td></td>
        <td>${student.name}</td>
    </tr>
    </c:forEach>
    </tbody>
</table>

</body>
</html>
