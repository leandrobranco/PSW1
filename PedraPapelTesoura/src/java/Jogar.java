/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author RA21551055
 */
public class Jogar extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>jogo</title>");            
            out.println("</head>");
            out.println("<body>");
            
            String[] opcaes ={"te","pa","pe"};
            int sorteio = new Random().nextInt(3); 
            String opcaoservidor = opcaes[sorteio];
            
            //recupero a opção do usuario
            String opcao = request.getParameter("opcao");
            
            
           boolean  usuariovenceu = true;
           
            if(opcao.equals("te")){
             if(opcaoservidor.equals("pe")){
                 usuariovenceu=false;
             }
            }
              if(opcao.equals("pa")){
             if(opcaoservidor.equals("pe")){
                 usuariovenceu=false;
             }
            }
          out.println("<h1>Eu escolhi:==> " + "'"+opcao+"'" + " Pc escolheu:==>"+"'"+opcaoservidor+"'"+ "</h1>");
          
          if(usuariovenceu)
           {
               out.println("<h1> Voce venceu o jogo! </h1>");
           }else{
               out.println("<h1> Voce perdeu o jogo! </h1>");
           }
            
            out.println("</body>");
            out.println("</html>");
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
