/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author RA21551055
 */
public class IncluirIngrediente extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
    
        try {
            //Carrega o driver na memória
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            
            // Conecta ao banco
           Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/sample","app", "app");
           
             // Cria comando
            java.sql.Statement comando = con.createStatement(); 
            
            //executa um update
            
            String nome = request.getParameter("nome");
            String calorias = request.getParameter("calorias");
            
            String query = "insert into ingrediente values ('" + nome + "', " + calorias + ")";
            int linhas = comando.executeUpdate(query);

            request.getRequestDispatcher("Sucesso.jsp").forward(request, response);

            //Executa uma query
            //ResultSet res = comando.executeQuery(query);

            //*** Finaliza transação e conexão
            //transacao.close();
            //con.close()
         
            
            
        } catch (Exception ex) {
            
                request.setAttribute("erro", ex.getMessage());
                
             request.getRequestDispatcher("erro.jsp").forward(request, response);
        }

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
