<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>[Thực hành] Tạo trang web để đăng nhập và hiển thị lời chào</title>
    <style type="text/css">
        .login {
            height: 180px;
            width: 300px;
            margin: 0;
            padding: 10px;
            border: 1px #CCC solid;
        }

        .login input {
            padding: 5px;
            margin: 5px;
        }
    </style>
</head>
<body>
<form method="get" action="/login">
    <div class="login">
        <h2>Login</h2>
        <input type="text" name="username" size="30" placeholder="UserName">
        <input type="password" name="password" size="30" placeholder="PassWord">
        <input type="submit" value="Sing in">
    </div>
</form>
</body>
</html>