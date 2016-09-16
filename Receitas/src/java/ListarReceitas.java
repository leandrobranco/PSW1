/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author RA21551055
 */
public class ListarReceitas extends HttpServlet {

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
      
        String[] ingredientesSelecionados = request.getParameterValues("ingred");
        
        List<Receita> receitas = buscarReceitas(ingredientesSelecionados);
                
        request.setAttribute("receita", receitas);
        
        request.getRequestDispatcher("receitasEncontradas.jsp").forward(request, response);
        
        
    }
    
    private List<Receita> buscarReceitas(String[] inds){
        
        List<Receita> Receita = new ArrayList<Receita>();
        
        Receita r1 = new Receita();
        r1.setNome("Torda de palmito");
        r1.setModoPreparo("Mistura tudo e vai fundo");
        r1.setPessoas(5);
        r1.setIngred(buscaIngredientes());
        
        Receita.add(r1);
        
        return Receita;
    }
    
     private List<Ingrediente> buscaIngredientes(){
        
        List<Ingrediente> resultado = new ArrayList<Ingrediente>();
        Ingrediente i1 = new Ingrediente();
        i1.setNome("cenoura");
        i1.setCalorias(30);
        resultado.add(i1);
         
        Ingrediente i2 = new Ingrediente();
        i2.setNome("catupiry");
        i2.setCalorias(300);
        resultado.add(i2);
        
        Ingrediente i3 = new Ingrediente();
        i3.setNome("Frango");
        i3.setCalorias(300);
        resultado.add(i3);
        
        return resultado;
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
