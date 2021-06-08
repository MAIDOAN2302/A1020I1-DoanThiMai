
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>DANH SACH MAT BANG CHO THUE</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="../../assert/bootstrap413/css/bootstrap.min.css">
    <link rel="stylesheet" href="../../assert/datatables/css/dataTables.bootstrap4.min.css">
    <link href="https://use.fontawesome.com/releases/v5.0.4/css/all.css" rel="stylesheet">
    <link href="../../assert/css/styleCSS.css" rel="stylesheet">
    <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
</head>
<body>
<h2 style="text-align: center">DANH SÁCH MẶT BẰNG CHO THUÊ</h2>
<h4 style="text-align: center">
    <a href="/users?action=create">Thêm mới một mặt bằng</a>
</h4>

<div class="col-sm-10">
    <c:if test="${list != null}">
        <table id="tableList" class="table table-striped table-bordered" style="width: 120%">

            <thead>
            <tr>
                <th>Mã MB</th>
                <th>Diện tích</th>
                <th>Trạng thái</th>
                <th>Tầng</th>
                <th>Loại văn phòng</th>
                <th>Mô tả chi tiết</th>
                <th>Giá thuê</th>
                <th>Ngày bắt đầu</th>
                <th>Ngày kết thúc</th>
                <th class="text-center">Edit</th>
                <th class="text-center">Delete</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${list}" var="matBang">
                <tr>
                    <td><a href="customer-view?id=${matBang.maMatBang}">${matBang.maMatBang}</a></td>
                    <td>${matBang.dienTich}</td>
                    <td>${matBang.trangThai}</td>
                    <td>${matBang.tang}</td>
                    <td>${matBang.idLoaiVp}</td>
                    <td>${matBang.moTaChiTiet}</td>
                    <td>${matBang.giaChoThue}</td>
                    <td>${matBang.ngayBatDau}</td>
                    <td>${matBang.ngayKetThuc}</td>
                    <td class="text-center">
                        <a href="customer-edit?id=${matBang.maMatBang}">
                            <span class="material-icons">edit</span>
                        </a>
                    </td>
                    <td class="text-center">
                        <a href="customer-remove?id=${matBang.maMatBang}">
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
        $('#tableList').dataTable({
            "dom": 'lrtip',
            "lengthChange": false,
            "pageLength": 5
        });
    });
</script>
</body>
</html>
