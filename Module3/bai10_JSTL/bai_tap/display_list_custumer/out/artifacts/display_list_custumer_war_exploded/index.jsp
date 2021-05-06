<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="model.Customer" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<html>
  <head>
    <title>[Bài tập] Hiển thị danh sách khách hàng</title>
  </head>
  <body>
  <%
    List<Customer> customerList = new ArrayList<>();
    Customer customer = new Customer("Dehan","2000-02-03","Han Quoc","web/WEB-INF/image/dehan.jpg");
    customerList.add(customer);
    customer = new Customer("Mingkuk","2000-02-03","Han Quoc","WEB-INF/image/mingkook.jpg");
    customerList.add(customer);
    customer = new Customer("Manse","2000-02-03","Han Quoc","WEB-INF/image/manse.jpg");
    customerList.add(customer);
    customer = new Customer("Naeun","2003-05-23","Han Quoc","WEB-INF/image/naeun.jpg");
    customerList.add(customer);
    customer = new Customer("Benthly","2010-05-23","Han Quoc","WEB-INF/image/benttly.jpg");
    customerList.add(customer);

    pageContext.setAttribute("CustomerList",customerList);
  %>
<form action="index.jsp" method="get">
  <h2>Danh sách khách hàng</h2>
  <table border="1">
    <tr>
      <th>Tên</th>
      <th>Ngày sinh</th>
      <th>Địa chỉ </th>
      <th>Ảnh</th>
    </tr>
    <c:forEach var="cus" items="${CustomerList}">
      <tr style="border: 1px">
        <td><c:out value="${cus.name}"></c:out></td>
        <td><c:out value="${cus.birthday}"></c:out></td>
        <td><c:out value="${cus.address}"></c:out></td>
        <td><img src="${cus.imageLink}" style=" width:50px; height: 50px"/></td>
      </tr>
    </c:forEach>
</form>
  </table>
  </body>
</html>
