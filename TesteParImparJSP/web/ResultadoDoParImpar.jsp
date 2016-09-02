<%-- 
    Document   : ResultadoDoParImpar
    Created on : 01/09/2016, 21:45:41
    Author     : RA21551055
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World
        <%=request.getAttribute("RSP")
        %>
        !</h1>
        <h2>
            Vce jogou:<%out.println(request.getAttribute("numUsu"));%>
        </h2>    
        <h2>
            eu jogou:<%out.println(request.getAttribute("numCPU"));%> 
        </h2>
            
    </body>
</html>
