<%@page import="java.util.List"%>
<%@page import="testservletjsp.ModelServletJSP"%>
<%@page import="testservletjsp.ServletJspDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>

    <h1>List Test Servlet JSP!</h1>

    <table border="1">
        <thead>
        <th>ID</th>
        <th>Name</th>
        <th>Quantity</th>
        <th>Iamge</th>
        <th>Status</th>
        <th>Describe</th>
        <th>Dateadd</th>
        <th>Edit | Delete</th>
    </thead>
    <%
        ServletJspDAO tDao = new ServletJspDAO();
        List<ModelServletJSP> list = tDao.getAll();
    %>

    <%
        for (ModelServletJSP elem : list) {
    %>
    <p><%= elem.getName() %></p>
    <%
        }
    %>


</table>



</html>
