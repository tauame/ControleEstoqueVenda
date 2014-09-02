/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.unisc.web;

import br.unisc.db.ProdutoDB;
import br.unisc.model.Produto;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Usuario
 */
public class ProdutoServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            try {
                //String nome = request.getParameter('nome')!=null?request.getParameter('nome'):'';
                //String endereco = request.getParameter('endereco')!=null?request.getParameter('endereco'):'';
                //String telefone = request.getParameter('telefone')!=null?request.getParameter('telefone'):'';
                
                ProdutoDB objprodutoDB = new ProdutoDB();
                
                out.println("<table>"
                        + "<tr>"
                        + "<td>Código</td>"
                        + "<td>Nome</td>"
                        + "<td>Cód Barras</td>"
                        + "<td>Fabricante</td>"
                        + "<td>Modelo</td>"
                        + "</tr>");
                for(Produto objproduto : objprodutoDB.listar()){
                    out.println("<tr>");
                    out.println("<td>"+ objproduto.getCodProd()+ "</td>");
                    out.println("<td>"+ objproduto.getNome() + "</td>");
                    out.println("<td>"+ objproduto.getCodBarras()+ "</td>");
                    out.println("<td>"+ objproduto.getFabricante()+ "</td>");
                    out.println("<td>"+ objproduto.getModelo()+ "</td>");
                    out.println("<td></td>");
                    out.println("</tr>");
                }
                out.println("</table>");
            
            } catch (Exception ex){
                //out.println(ex);
                System.out.println(ex);
            }
            
        }
    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)  throws ServletException, IOException {
        //processRequest(request, response);
        try {
            String nome =  "", cod_barras="", fabricante="", modelo="";
            nome = request.getParameter("nome"); 
            cod_barras = request.getParameter("cod_barras"); 
            fabricante = request.getParameter("fabricante"); 
            modelo = request.getParameter("modelo"); 
            
            ProdutoDB produtoDB = new ProdutoDB();
            Produto produto = new Produto();   
            produto.setNome(nome);
            produto.setCodBarras(cod_barras);
            produto.setFabricante(fabricante);
            produto.setModelo(modelo);
            produtoDB.inserir(produto);
        } catch (Exception ex){
            //out.println(ex);
            System.out.println(ex);
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
