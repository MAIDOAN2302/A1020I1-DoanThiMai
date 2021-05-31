
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Information Of Customer</title>
</head>
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
<c:out value="${customer}"></c:out>
<div class="container-fluid">
        <div class="col-sm-10 flex-column justify-content-center">
            <table class="table table-bordered col-sm-6" style="margin: auto">
                <tr>
                    <td style="width: 30%">ID:</td>
                    <td class="col-sm-4 text-center">${customer.customer_id}</td>
                </tr>
                <tr>
                    <td style="width: 30%">Customer Type:</td>
                    <td class="col-sm-4 text-center">${customer.customer_type_id}</td>
                </tr>
                <tr>
                    <td>Customer Name:</td>
                    <td class="text-center">${customer.customer_name}</td>
                </tr>
                <tr>
                    <td>Birthday:</td>
                    <td class="text-center">${customer.customer_birthday}</td>
                </tr>
                <tr>
                    <td>Gender:</td>
                    <td class="text-center">${customer.customer_gender}</td>
                </tr>
                <tr>
                    <td>Customer Id Card:</td>
                    <td class="text-center">${customer.customer_id_card}</td>
                </tr>
                <tr>
                    <td>Phone:</td>
                    <td class="text-center">${customer.customer_phone}</td>
                </tr>
                <tr>
                    <td>Email:</td>
                    <td class="text-center">${customer.customer_email}</td>
                </tr>
                <tr>
                    <td>Address:</td>
                    <td class="text-center">${customer.customer_address}</td>
                </tr>
            </table>
            <br><br>
            <div class="col-sm-3" style="margin: auto;">
                <a class="btn btn-outline-primary btn-block text-center" href="customer-list">Back to list</a>
            </div>
            <br><br>
        </div>
    </div>
</div>
<script src="../../assert/jquery/jquery-3.5.1.min.js"></script>
<script src="../../assert/datatables/js/jquery.dataTables.min.js"></script>
<script src="../../assert/datatables/js/dataTables.bootstrap4.min.js"></script>
<script src="../../assert/bootstrap413/js/bootstrap.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
</body>
</html>
