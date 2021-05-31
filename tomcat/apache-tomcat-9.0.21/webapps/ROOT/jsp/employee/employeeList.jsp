<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
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
<h2 style="text-align: center">List Employee</h2>
<div class="container-fluid">
    <div class="col-sm-10">
        <c:if test="${employeeList != null}">
            <table id="tableCus" class="table table-striped table-bordered" style="width: 120%">
                <thead>
                <tr>
                    <th>ID</th>
                    <th>Name</th>
                    <th>Birthday</th>
                    <th>Id Card</th>
                    <th>Salary</th>
                    <th>Phone</th>
                    <th>Email</th>
                    <th>Address</th>
                    <th>Location</th>
                    <th>Education Degree</th>
                    <th>Division</th>
                    <th class="text-center">Edit</th>
                    <th class="text-center">Delete</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach items="${employeeList}" var="employee">
                    <tr>
                        <td>${employee.employee_id}</td>
                        <td><a href="customer-view?id=${employee.employee_id}">${employee.employee_name}</a></td>
                        <td>${employee.employee_birthday}</td>
                        <td>${employee.employee_id_card}</td>
                        <td>${employee.employee_salary}</td>
                        <td>${employee.employee_phone}</td>
                        <td>${employee.employee_email}</td>
                        <td>${employee.employee_address}</td>
                        <td>${employee.location_id}</td>
                        <td>${employee.education_degree_id}</td>
                        <td>${employee.division_id}</td>
                        <td>${employee.username}</td>
                        <td class="text-center">
                            <a href="employee-edit?id=${employee.employee_id}">
                                <span class="material-icons">edit</span>
                            </a>
                        </td>
                        <td class="text-center">
                            <a href="employee-remove?id=${employee.employee_id}">
                                <span class="material-icons">delete_forever</span>
                            </a>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </c:if>
    </div>
</div>

<script src="../../assert/jquery/jquery-3.5.1.min.js"></script>
<script src="../../assert/datatables/js/jquery.dataTables.min.js"></script>
<script src="../../assert/datatables/js/dataTables.bootstrap4.min.js"></script>
<script src="../../assert/bootstrap413/js/bootstrap.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
<script>
    $(document).ready(function () {
        $('#tableCus').dataTable({
            "dom": 'lrtip',
            "lengthChange": false,
            "pageLength": 3
        });
    });
</script>
</body>
</html>
