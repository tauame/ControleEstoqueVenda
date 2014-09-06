package br.unisc.web;

import br.unisc.db.ProdutoDB;
import br.unisc.model.Produto;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Eduardo
 */
public class ProdutoServlet extends HttpServlet {

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
        
        String acao = request.getParameter("acao");
        Produto prod = new Produto();
        
        try {
            ProdutoDB prodDB = new ProdutoDB();
                       
            if (acao.equalsIgnoreCase("Inserir")) {
                
                prod.setNome(request.getParameter("nome"));            
                prod.setCod_barras(Integer.valueOf(request.getParameter("cod_barras")));
                prod.setFabricante(request.getParameter("fabricante"));
                prod.setModelo(request.getParameter("modelo"));
                prodDB.inserir(prod);
                
                try (PrintWriter out = response.getWriter()) {
                    out.println("<h2>Produto inserido com sucesso!</h2>"
                            + "<h3> <a href=\"index.jsp\"> Voltar </a> </h3>");
                }
                
            } else if (acao.equalsIgnoreCase("Atualizar")) {
                
                prod.setNome(request.getParameter("nome"));            
                prod.setCod_barras(Integer.valueOf(request.getParameter("cod_barras")));
                prod.setFabricante(request.getParameter("fabricante"));
                prod.setModelo(request.getParameter("modelo"));
                prod.setCod_produto(Integer.valueOf(request.getParameter("cod_produto")));
                prodDB.atualizar(prod);
                
                try (PrintWriter out = response.getWriter()) {
                    out.println("<h2>Produto atualizado com sucesso!</h2>"
                            + "<h3> <a href=\"index.jsp\"> Voltar </a> </h3>");
                }
            
            } else if (acao.equalsIgnoreCase("Deletar")) {
                int cod_delecao = Integer.valueOf(request.getParameter("cod_produto"));
                prodDB.deletar(cod_delecao);
                
                try (PrintWriter out = response.getWriter()) {
                    out.println("<h2>Produto deletado com sucesso!</h2>"
                            + "<h3> <a href=\"index.jsp\"> Voltar </a> </h3>");
                }
            }
 
        } catch(Exception e) {
            e.printStackTrace();
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
