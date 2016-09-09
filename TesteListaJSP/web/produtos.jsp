<%-- 
    Document   : produtos
    Created on : 08/09/2016, 21:40:23
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
        
        
        <h1>Lista de produtos cadastrados!</h1>
        
        <c:forEach items="${requestScope.lista}" var="prod">
           
             <h2 style="color: brown"> Produto: ${prod}</h2>
            
        </c:forEach>
                 
        
    </body>
</html>
