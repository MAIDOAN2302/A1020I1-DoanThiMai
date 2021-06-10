<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h2>Sandwich Condiments:</h2>
    <c:if test="${sandwich.condiments != null}">
        <c:forEach items="${sandwich.condiments}" var="condiment">
            <h3 style="color: green">${condiment}</h3>
        </c:forEach>
    </c:if>
    <c:if test="${sandwich.condiments == null}">
        <h3 style="color: red">No condiments for sandwich</h3>
    </c:if>
</body>
</html>
