<%-- 
    Document   : introjsp
    Created on : Dec 12, 2022, 8:35:44 AM
    Author     : DQT
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <c:set var="name" value="dqt"></c:set>
        <c:out value="${name}"></c:out>
        
        <h1>Hello World!</h1>

        <%
            int a = 11;
            String name = "Dao Quoc Truong";
        %>

        <h1><%= a%></h1>
        <h1><%= name%></h1>

        <%
            int x = 10;
            int y = 5;
            int sum = x + y;

            out.print(sum);
        %>

        <h1><%= sum%></h1>


    </body>
</html>
