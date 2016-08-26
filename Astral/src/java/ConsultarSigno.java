/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ra21551055
 */
public class ConsultarSigno extends HttpServlet {

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
          
           
            String data = request.getParameter("DataNasc");
            
            DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
            
            Date DataNasc = (Date)formatter.parse(data);
            
            String signo = "aries";
           
            if (DataNasc.getMonth() == 0){
                signo = "Aquario";    
                
            } else if (DataNasc.getMonth()==1){
                signo = "Peixe";
            } 
            else if (DataNasc.getMonth()==2){
                signo = "Aries";
            } 
            else if (DataNasc.getMonth()==3){
                signo = "Touro";
            } 
            else if (DataNasc.getMonth()==4){
                signo = "Gemeos";
            }
            else if (DataNasc.getMonth()==5){
                signo = "Cancer";
            }
            else if (DataNasc.getMonth()==6){
                signo = "Leao";
            }
            else if (DataNasc.getMonth()==7){
                signo = "Virgem";
            }
            else if (DataNasc.getMonth()==8){
                signo = "Libra";
            }
            else if (DataNasc.getMonth()==9){
                signo = "Escorpiao";
            }
            else if (DataNasc.getMonth()==10){
                signo = "Sargitario";
            }
            else if (DataNasc.getMonth()==11){
                signo = "Capricornio";
            }
            
            
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ConsultarSigno</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Bem vindo ao portal astral </h1>");
            out.println("<h2> Seu Signo é :" + signo +" </h2>");
            out.println("</body>");
            out.println("</html>");
        }
        catch(Exception e){
            System.out.println("Erro!!!" + e.getMessage());
            
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
