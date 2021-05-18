<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>View Product</title>
</head>
<body>
<h1>View product</h1>
<p>
    <a href="/products">Back to product list</a>
</p>
<table>
    <tr>
        <td>Product name:</td>
        <td><c:out value="${product.getProductName()}"></c:out></td>
    </tr>
    <tr>
        <td>Product price:</td>
        <td><c:out value="${product.getProductPrice()}"></c:out></td>
    </tr>
    <tr>
        <td>Description of product:</td>
        <td><c:out value="${product.getProductOfDescription()}"></c:out></td>
    </tr>
    <tr>
        <td>Maker:</td>
        <td><c:out value="${product.getMaker()}"></c:out></td>
    </tr>
</table>
</body>
</html>
