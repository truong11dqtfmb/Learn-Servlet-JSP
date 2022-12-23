<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>%>

<%@page isELIgnored="false"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>JSTL Core</h1>
        <hr>
        <c:out value="out"></c:out>

            <hr>
        <c:import url="jstlimport.jsp" var="import_di"></c:import>
            <h1>
            <c:out value="${import_di}"></c:out>
            </h1>

            <hr>
        <c:set var="result" value="${11*11}" scope="session"></c:set>
        <c:out value="${result}"></c:out>

            <hr>
            Before: 
        <c:out value="${result}"></c:out>
        <c:remove var="result" />
        After:
        <c:out value="${result}"></c:out>

            <hr>

        <c:catch var="exception" >
            <%
//                int a = 10 / 0;
                String str = null;
                str.toLowerCase();
            %>
        </c:catch>
        <c:if test="${exception != null}">
            <p>${exception}</p>
        </c:if>

        <hr>

        <c:set var="age" value="20"></c:set>
        <c:if test="${age > 15}">
            <h1>Male</h1>
        </c:if>

        <hr>
        <c:choose>
            <c:when test="${age > 18}">>>18</c:when>
            <c:when test="${age < 18}"><<18</c:when>
            <c:otherwise>
                other
            </c:otherwise>
        </c:choose>

        <hr>
        <c:forEach var="num" begin="1" end="11">
            <c:out value="${num}"></c:out>
        </c:forEach>

        <hr>
        <c:forTokens var="newString" items="alo,oke,dao quoc truong" delims=",">            
            <p><c:out value="${newString}"></c:out></p>
        </c:forTokens>

        <hr>

        <c:url value="index.jsp" var="pageUrl">
            <c:param name="em" value="quoc truong11tv@gmial.com"></c:param>
            <c:param name="ps" value="12345678"></c:param>
        </c:url>
        ${pageUrl}

        <hr>
        <%--<c:redirect url="https://www.google.com"></c:redirect>--%>

        <hr>
        <h1>JSTL Functions</h1>
        <c:set var="hoVaTen" value="Dao Quoc Truong"></c:set>
        <c:if test="${fn:contains(hoVaTen, 'ao')}">
            <h4>Found dqt</h4>
        </c:if>



    </body>
</html>
