<%@ page import="bean.Student" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List Student</title>
</head>
<body>
<h2> List Student</h2>
<%
    List<Student> studentListJSP = (List<Student>) request.getAttribute("studentListServelet");
%>
<table>
    <tr>
        <th>No</th>
        <th>Id</th>
        <th>Name</th>
        <th>Date Of Birth</th>
    </tr>
    <%
        for (int i = 0; i < studentListJSP.size(); i++){
    %>
    <tr>
        <td><%=i + 1%></td>
        <td><%= studentListJSP.get(i).getId()%></td>
        <td><%= studentListJSP.get(i).getName()%></td>
        <td><%= studentListJSP.get(i).getDateOfBirth()%></td>

    </tr>
    <%
        }
    %>
</table>
</body>
</html>
