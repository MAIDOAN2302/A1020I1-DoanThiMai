
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>[Thực hành] Ứng dụng chuyển đổi tiền tệ - JSP</title>
  </head>
  <body>
  <form action="converter.jsp" method="post">
  <h2>Currency Converter</h2>
  <p> Rate</p>
  <p>
  <input type="text" name="rate" placeholder="RATE" value="2200"/>
  </p>
  <p>USD</p>
  <p>
  <input type="text" name="usd" placeholder="USD" value="0"/>
  </p>
  <input type="submit" value="Converter">
  </form>
  </body>
</html>