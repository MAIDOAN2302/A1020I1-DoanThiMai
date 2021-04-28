
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>[Bài tập] Ứng dụng Product Discount Calculator</title>
  </head>
  <body>
  <form action="/Product" method="post">
    <p>
      Product Description:
      <input type="text" name="product_description">
    </p>
    <p>
      List Price:
      <input type="text" name="list_price">
    </p>
    <p>
      Discount Percent:
      <input type="text" name="discount_percent">
    </p>
    <input type="submit" value="calculate_discount ">

    <p>Product Description: <%=request.getAttribute("product")%></p>
    <p>List Price:<%=request.getAttribute("price")%></p>
    <p>Discount Percent: <%=request.getAttribute("discount_percent")%></p>
    <h4 style="color: blue">Discount Percent: <%=request.getAttribute("discount_percent")%></h4>
    <h4 style="color: blue">Discount Price: <%=request.getAttribute("discount_price")%></h4>

  </form>
  </body>
</html>