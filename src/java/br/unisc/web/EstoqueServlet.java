package br.unisc.web;

import br.unisc.db.EstoqueDB;
import br.unisc.model.Estoque;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Eduardo
 */
public class EstoqueServlet extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("Testando EstoqueServelet.doGet - EstoqueServelet.java");
        }
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
        try (PrintWriter out = response.getWriter()){
            out.println("Chamou POST - EstoqueServelet.doPost (EstoqueServelet.java).</br>");
            Estoque estoq = new Estoque();
            estoq.setCod_produto(Integer.valueOf(request.getParameter("cod_produto")));
            out.println(estoq.getCod_produto()+".</br>");
            estoq.setCod_estoque(Integer.valueOf(request.getParameter("cod_estoque")));
            out.println(estoq.getCod_estoque()+".</br>");
            //out.println("Chamou POST - EstoqueServelet.doPost (EstoqueServelet.java).</br>");
            Estoque estoq = new Estoque();
            estoq.setCod_produto(Integer.valueOf(request.getParameter("cod_produto")));
            //out.println(estoq.getCod_produto()+".</br>");
            estoq.setCod_estoque(Integer.valueOf(request.getParameter("cod_estoque")));
            //out.println(estoq.getCod_estoque()+".</br>");
            estoq.setQtd_produto(Integer.valueOf(request.getParameter("qtd_produto")));
            estoq.setValidade(request.getParameter("validade"));
        
            EstoqueDB estoqDB = new EstoqueDB();
            estoqDB.inserir(estoq);
            
            out.println("cadástro com Sucesso.</br></br>");
            out.println("<h3> <a href=\"index.jsp\"> Voltar </a> </h3>");
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(EstoqueServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        
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
