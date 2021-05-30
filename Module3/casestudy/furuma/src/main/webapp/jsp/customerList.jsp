
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Furama Resort</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="../assert/bootstrap413/css/bootstrap.min.css">
    <link rel="stylesheet" href="../assert/datatables/css/dataTables.bootstrap4.min.css">
    <link href="https://use.fontawesome.com/releases/v5.0.4/css/all.css" rel="stylesheet">
    <link href="../assert/css/styleCSS.css" rel="stylesheet">
    <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
</head>
<body>
<div class="container-fluid">
        <div class="col-sm-10">
            <c:if test="${customerList != null}">
                <table class="table table-striped" width="100%">
                    <tr>
                        <th>ID</th>
                        <th>Customer Type</th>
                        <th>Customer Name</th>
                        <th>Birthday</th>
                        <th>Gender</th>
                        <th>Id Card</th>
                        <th>Phone</th>
                        <th>Email</th>
                        <th>Address</th>
                        <th class="text-center">Edit</th>
                        <th class="text-center">Delete</th>
                    </tr>
                    <c:forEach items="${customerList}" var="customer">
                        <tr>
                            <td>${customer.customer_id}</td>
                            <td>${customer.customer_type_id}</td>
                            <td><a href="customer-view?id=${customer.customer_id}">${customer.customer_name}</a></td>
                            <td>${customer.customer_birthday}</td>
                            <td>${customer.customer_gender}</td>
                            <td>${customer.customer_id_card}</td>
                            <td>${customer.customer_phone}</td>
                            <td>${customer.customer_email}</td>
                            <td>${customer.customer_address}</td>
                            <td class="text-center">
                                <a href="customer-edit?id=${customer.customer_id}">
                                    <span class="material-icons">edit</span>
                                </a>
                            </td>
                            <td class="text-center">
                                <a href="customer-remove?id=${customer.customer_id}">
                                    <span class="material-icons">delete_forever</span>
                                </a>
                            </td>
                        </tr>
                    </c:forEach>
                </table>
            </c:if>
        </div>
    </div>
<script src="../assert/jquery/jquery-3.5.1.min.js"></script>
<script src="../assert/datatables/js/jquery.dataTables.min.js"></script>
<script src="../assert/datatables/js/dataTables.bootstrap4.min.js"></script>
<script src="../assert/bootstrap413/js/bootstrap.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
</body>
</html>
