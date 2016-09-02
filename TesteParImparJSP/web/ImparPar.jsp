<%-- 
    Document   : Inparpar
    Created on : 30/08/2016, 20:16:44
    Author     : RA21551055
--%>

<%@page import="java.util.Random"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Par ou Impar advanced!!!!!</h1>
        <%
            String op = request.getParameter("opcao");
            int numero = Integer.parseInt(request.getParameter("numero"));
            
            int numServidor = new Random().nextInt(10);
            int soma = numero+numServidor;
            
            String resultado = "Par";
            
            if ((soma % 2) !=0 ){
                resultado = "Impar";
            }
            
            if (op.equals(resultado)){
                out.print("<h1>Voce Ganhou</h1>");
            }else{
                out.print("<h1>Voce Perdeu!</h1>");
               
            }
                out.print("Eu joguei (" +numServidor +") e voce jogou ("+numero +")");
        %>
        
    </body>
</html>
