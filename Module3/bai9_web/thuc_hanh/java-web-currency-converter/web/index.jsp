
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>[Thực hành] Ứng dụng chuyển đổi tiền tệ - Servlet</title>
  </head>
  <body>
  <form method="post" action="/converter">
    <div>
      <h2>Currency Converter</h2>
      <p>Rate
        <input type="text" name="Rate" placeholder="Rate"/>
      </p>
      <p>
        USD
        <input type="text" name="USD" placeholder="USD">
      </p>
      <input type="submit" value="Converter">
    </div>

  </form>
  </body>
</html>
