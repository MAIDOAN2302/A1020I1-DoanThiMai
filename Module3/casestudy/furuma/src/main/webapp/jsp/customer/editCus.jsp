
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %><html>
<head>
    <title>Furama Resort</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="../../assert/bootstrap413/css/bootstrap.min.css">
    <link rel="stylesheet" href="../../assert/datatables/css/dataTables.bootstrap4.min.css">
    <link href="https://use.fontawesome.com/releases/v5.0.4/css/all.css" rel="stylesheet">
    <link href="../../assert/css/styleCSS.css" rel="stylesheet">
    <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
</head>
<body>
<h2>
    <a href="/customer-list?action=edit">Edit Customer</a>
</h2>

<div class="container-fluid">
    <c:if test="${listCus != null}">
        <input type="text" name="id" value="<c:out value='${customer.customer_id}'/>"/>
    </c:if>
    <tr>
        <th>Customer type:</th>
        <td>
            <input type="text" name="cusType" size="45" value="<c:out value='${customer.customer_type_id}'/>"/>
        </td>
    </tr>
    <tr>
        <th>Customer name:</th>
        <td>
            <input type="text" name="name" size="45" value="<c:out value='${customer.customer_name}'/>"/>
        </td>
    </tr>>
    <tr>
        <td colspan="2" align="center">
            <input type="submit" value="Save">
        </td>
    </tr>
    </table>
</div>
<script src="../../assert/jquery/jquery-3.5.1.min.js"></script>
<script src="../../assert/datatables/js/jquery.dataTables.min.js"></script>
<script src="../../assert/datatables/js/dataTables.bootstrap4.min.js"></script>
<script src="../../assert/bootstrap413/js/bootstrap.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
</body>
</html>
