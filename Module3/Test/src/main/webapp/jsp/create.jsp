<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>DANH SÁCH MẶT BẰNG</title>
</head>
<body>
<center>
    <h1>THÊM MỚI MẶT BẰNG</h1>
    <h2>
        <a href="users?action=users">DANH SACH MẶT BẰNG</a>
    </h2>
</center>
<p style="color: red"><c:out value="${msg}"></c:out></p>
<div align="center">
    <form method="post">
        <table border="1" cellpadding="5">
            <caption>
                <h2>THÊM MỚI</h2>
            </caption>
            <tr>
                <th>MÃ MB:</th>
                <td>
                    <input type="text" name="maMb" id="maMb" size="45"/>
                </td>
            </tr>
            <tr>
                <th>DIỆN TÍCH: </th>
                <td>
                    <input type="text" name="dienTich" id="dienTich" size="45"/>
                </td>
            </tr>
            <tr>
                <th>TRẠNG THÁI: </th>
                <td>
                    <input type="text" name="trangThai" id="trangThai" size="15"/>
                </td>
            </tr>
            <tr>
                <th>TẦNG: </th>
                <td>
                    <input type="text" name="tang" id="tang" size="15"/>
                </td>
            </tr>
            <tr>
                <th>LOẠI VP: </th>
                <td>
                    <input type="text" name="loaiVP" id="loaiVP" size="15"/>
                </td>
            </tr>
            <tr>
                <th>MÔ TẢ CHI TIẾT:  </th>
                <td>
                    <input type="text" name="moTa" id="moTa" size="15"/>
                </td>
            </tr>
            <tr>
                <th>GIÁ THUÊ:  </th>
                <td>
                    <input type="text" name="gia" id="gia" size="15"/>
                </td>
            </tr>
            <tr>
                <th>NGÀY BẮT ĐẦU:  </th>
                <td>
                    <input type="text" name="ngayBD" id="ngayBD" size="15"/>
                </td>
            </tr>
            <tr>
                <th>NGÀY KẾT THÚC:  </th>
                <td>
                    <input type="text" name="ngayKT" id="ngayKT" size="15"/>
                </td>
            </tr>
            <tr>
                <td colspan="2" align="center">
                    <input type="submit" value="Save"/>
                </td>
            </tr>
        </table>
    </form>
</div>
</body>
</html>