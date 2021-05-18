
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Search product</title>
</head>
<body>
<h1>Search product</h1>
<p>
    <a href="/products">Back to product list</a>
</p>
<table>
    <tr>
        <td>Product name:</td>
        <td>${requestScope["products"].getProductName()}</td>
    </tr>
    <tr>
        <td>Product price:</td>
        <td>${requestScope["products"].getProductPrice()}</td>
    </tr>
    <tr>
        <td>Description of product:</td>
        <td>${requestScope["products"].getProductOfDescription()}</td>
    </tr>
    <tr>
        <td>Maker:</td>
        <td>${requestScope["products"].getMaker()}</td>
    </tr>
</table>
</body>
</html>
