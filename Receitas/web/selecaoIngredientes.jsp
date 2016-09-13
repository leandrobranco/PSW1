<%-- 
    Document   : selecaoIngredientes
    Created on : 13/09/2016, 20:16:49
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
        <h1>Quais ingrediente voce tem?</h1>
        <c:forEach items="${requestScope.ingredientesSelecionaveis}" var="ingrediente">
            
               <br> <input type="checkbox" name="ingred" value="${ingrediente.nome}"/> ${ingrediente.nome}
            
        </c:forEach>
    </body>
</html>
