<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create New Product</title>
</head>
<body>
<h1>Create new product</h1>
<p>
    <c:if test='${requestScope["message"]!= null}'>
        <span class="message">${requestScope["message"]}</span>
    </c:if>
</p>
<p>
    <a href="/products">Back to product list</a>
</p>
<form method="post">
<fieldset>
<legend>Product Information</legend>
    <table>
        <tr>
            <td>Product Name: </td>
            <td>
                <input name="productName" type="text" id="productName"/>
            </td>
        </tr>
        <tr>
            <td>Product Price: </td>
            <td>
                <input name="productPrice" type="text" id="productPrice"/>
            </td>
        </tr>
        <tr>
            <td>Description Product: </td>
            <td>
                <input name="descriptionProduct" type="text" id="descriptionProduct"/>
            </td>
        </tr>
        <tr>
            <td>Maker: </td>
            <td>
                <input name="maker" type="text" id="maker"/>
            </td>
        </tr>
        <tr>
            <td></td>
            <td>
                <input type="submit" value="Create Product"/>
            </td>
        </tr>
    </table>
</fieldset>
</form>
</body>
</html>
