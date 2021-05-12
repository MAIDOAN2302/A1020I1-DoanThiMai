<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<html>
<head>
    <title>HIỂN THỊ DANH SÁCH KHÁCH HÀNG</title>
</head>
<body>
<h2>DANH SÁCH KHÁCH HÀNG</h2>
<table border="1">
    <tr>
        <th>Tên</th>
        <th>Ngày sinh</th>
        <th>Địa chỉ</th>
        <th>Ảnh</th>
    </tr>

    <c:forEach var="customer" items="${customerListSevrlet}">
        <tr>
        <td><c:out value="${customer.name}"/></td>
        <td><c:out value="${customer.dateOfBirth}"/></td>
        <td><c:out value="${customer.address}"/></td>
        <td>
            <img src="${customer.image}" alt="image" height="50" width="100"/>
        </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
