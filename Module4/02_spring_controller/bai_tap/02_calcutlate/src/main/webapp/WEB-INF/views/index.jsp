<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Calculator</title>
</head>
<body>
<h1>Calculator</h1>
<form action="/result", method="post">
  <input type="text" name="numberOne" required>
  <input type="text" name="numberTwo" required>
  <br>
  <br>
  <button type="submit" name="operator" value="+">Addition</button>
  <button type="submit" name="operator" value="-">Subtraction</button>
  <button type="submit" name="operator" value="*">Multiple</button>
  <button type="submit" name="operator" value="/">Division</button>
</form>
<hr>
<c:choose>
  <c:when test="${error != null}">
    <h2 style="color: red">${error}</h2>
  </c:when>
  <c:when test="${result != null}">
    <h2 style="color: darkblue">${numberOne} ${operator} ${numberTwo} = ${result}</h2>
  </c:when>
</c:choose>
</body>
</html>
