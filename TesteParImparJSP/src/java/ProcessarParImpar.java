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
public class ProcessarParImpar extends HttpServlet {

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
    
        String op = request.getParameter("opcao");
            int numero = Integer.parseInt(request.getParameter("numero"));
            
            int numServidor = new Random().nextInt(10);
            int soma = numero+numServidor;
            
            String resultado = "Par";
            
            if ((soma % 2) !=0 ){
                resultado = "Impar";
            }
            
            String resp = "Perdeu";
            
            if (op.equals(resultado)){
                resp="Ganhou";
            }
            
            request.setAttribute("RSP",resp);
            request.setAttribute("numUsu",numero);
            request.setAttribute("numCPU",numServidor);
            
            request.getRequestDispatcher("ResultadoDoParImpar.jsp").forward(request, response);

            
/*            if (op.equals(resultado)){
                out.print("<h1>Voce Ganhou</h1>");
            }else{
                out.print("<h1>Voce Perdeu!</h1>");
               
            }

                out.print("Eu joguei (" +numServidor +") e voce jogou ("+numero +")");
            
            
            out.println("<h1>Voce jogou " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
  */      
        
        
        
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
