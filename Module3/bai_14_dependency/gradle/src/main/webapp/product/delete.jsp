
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Delete Product</title>
</head>
<body>
<h1>Delete Product</h1>
<p>
    <a href="/products">Back to product list</a>
</p>
<form method="post">
    <h3>Are you sure?</h3>
    <fieldset>
        <legend>Product Information</legend>
        <table>
            <tr>
                <td>Product name:</td>
                <td>${requestScope["products"].getProductName()}</td>
            </tr>
            <tr>
                <td>Product name:</td>
                <td>${requestScope["products"].getProductPrice()}</td>
            </tr>
            <tr>
                <td>Product name:</td>
                <td>${requestScope["product"].getProductOfDescription()}</td>
            </tr>
            <tr>
                <td>Product name:</td>
                <td>${requestScope["products"].getMaker()}</td>
            </tr>
            <tr>
                <td>
                    <input type="submit" value="Delete Product"/>
                </td>
                <td>
                    <a href="/products">Back to product list</a>
                </td>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>
