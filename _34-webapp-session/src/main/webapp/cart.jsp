<%@page contentType="text/html" pageEncoding="UTF-8" import="org.piolig.apiservlet.webapp.headers.models.*"%>
<%
Cart cart = (Cart) session.getAttribute("cart");
%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Shopping Cart</title>
</head>
<body>
<h1>Shopping Cart</h1>
<% if (cart == null || cart.getItems().isEmpty()) {%>
<p>Sorry, no products in shopping cart!</p>
<%} else {%>
<table>
    <tr>

        <th>id</th>
        <th>name</th>
        <th>price</th>
        <th>quantity</th>
        <th>total</th>
    </tr>

    <tr>
    <%for(CartItem item: cart.getItems()){%>
        <td><%=item.getProduct().getId()%></td>
        <td><%=item.getProduct().getName()%></td>
        <td><%=item.getProduct().getPrice()%></td>
        <td><%=item.getQuantity()%></td>
        <td><%=item.getTotal()%></td>
        <td></td>
    </tr>
    <%}%>

    <tr>
        <td colspan="4" style="text-align: right">Total: </td>
        <td><%=cart.getTotal()%></td>
    </tr>

</table>

<%}%>
<p><a href="<%=request.getContextPath()%>/products">keep buying</a></p>
<p><a href="<%=request.getContextPath()%>/index.html">return</a></p>
</body>
</html>