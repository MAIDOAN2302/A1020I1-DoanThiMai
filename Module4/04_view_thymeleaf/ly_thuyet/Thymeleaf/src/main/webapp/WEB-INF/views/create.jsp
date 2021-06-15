<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: KILL YOU
  Date: 6/11/2021
  Time: 8:36 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form:form modelAttribute="student" action="/student/create" method="post">
    <table>
        <tr>
            <td>Id</td>
            <td>
                <form:input path="id"/>
            </td>
        </tr>
        <tr>
            <td>Name</td>
            <td>
                <form:input path="name"/>
            </td>
        </tr>
        <tr>
            <td>Gender</td>
            <td>
                <form:radiobutton path="gender" value="0" label="Female"/>
                <form:radiobutton path="gender" value="1" label="Male"/>
                <form:radiobutton path="gender" value="2" label="LGBT"/>
            </td>
        </tr>
        <tr>
            <td>Languages:</td>
            <td>
                <form:checkboxes path="language" items="${languageList}"/>
<%--                <form:checkbox path="language" value="C#" label="C#" />--%>
<%--                <form:checkbox path="language" value="Java" label="Java" />--%>
<%--                <form:checkbox path="language" value="" label="Php" />--%>
            </td>
        </tr>
    </table>
    <button type="submit">Create</button>
</form:form>

</body>
</html>
