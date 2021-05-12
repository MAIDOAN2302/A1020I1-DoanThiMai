<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit product</title>
</head>
<body>
<h1>Edit product</h1>
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
                <td>Product name:</td>
                <td>
                    <input type="text" name="productName" id="productName"
                           value="${requestScope["product"].getProductName}"/>
                </td>
            </tr>
            <tr>
                <td>Product price:</td>
                <td>
                    <input type="text" name="productPrice" id="productPrice"
                           value="${requestScope["product"].getProductPrice}"/>
                </td>
            </tr>
            <tr>
                <td>Description product:</td>
                <td>
                    <input type="text" name="productOfDescription" id="productOfDescription"
                           value="${requestScope["product"].getProductOfDescription}"/>
                </td>
            </tr>
            <tr>
                <td>Maker:</td>
                <td>
                    <input type="text" name="maker" id="maker"
                           value="${requestScope["product"].getMaker}"/>
                </td>
            </tr>
            <tr>
                <td></td>
                <td>
                    <input type="submit" value="Update product">
                </td>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>
