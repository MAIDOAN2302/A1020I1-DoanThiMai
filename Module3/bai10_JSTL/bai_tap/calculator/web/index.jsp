<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Ung dung may tinh</title>
</head>
<body>
<h1>Simple Calculate</h1>
<form action="/calculate" method="post">
    <table>
        <tr>
            <td> Number 1:</td>
            <td><input name="numberOne" type="text"></td>
        </tr>
        <tr>
            <td>Operator</td>
            <td>
                <select name="operator">
                    <option value="+">Addition</option>
                    <option value="-">Subtraction</option>
                    <option value="*">Multiplication</option>
                    <option value="/">Division</option>
                </select>
            </td>
        </tr>
        <tr>
            <td> Number 2:</td>
            <td><input name="numberTwo" type="text"></td>
        </tr>
        <tr>
            <td></td>
            <td><input type="submit" value="Calculate"></td>
        </tr>
    </table>
</form>
<h1><%=request.getAttribute("result")%></h1>
</body>
</html>
