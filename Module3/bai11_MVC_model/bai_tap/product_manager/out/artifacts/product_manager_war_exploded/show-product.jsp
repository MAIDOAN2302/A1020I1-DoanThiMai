<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>SHOW  PRODUCTS LIST</title>
</head>
<body>
<h1>Show products list</h1>
<p>
    <a href="/products?action=create">Create new product</a>
</p>
<table border="1">
    <tr>
        <th>Id</th>
        <th>Product Name</th>
        <th>Product Price</th>
        <th>Description Of Product</th>
        <th>Maker</th>
    </tr>
    <c:forEach items="${requestScope['products']}" var="product">
        <tr>
            <td><a href="/products?action=view&id=${product.getId()}">${product.getProductName()}</a></td>
            <td>${product.getProductPrice()}</td>
            <td>${product.getProductOfDescription()}</td>
            <td>${product.getMaker()}</td>
            <td><a href="/products?action=edit&id=${product.getId()}">Edit</a></td>
            <td><a href="/products?action=delete&id=${product.getId()}">Delete</a></td>
            <td><a href="/products?action=search&id=${product.getId()}">Search</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
