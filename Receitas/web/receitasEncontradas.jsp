<%-- 
    Document   : receitasEncontradas
    Created on : 15/09/2016, 21:59:14
    Author     : RA21551055
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Sugestoes de receitas</h1>
        <c:forEach items="${requestScope.receita}" var="receita"> 
                   <br> ${receita.nome}<br>

            </c:forEach>
    </body>
</html>
