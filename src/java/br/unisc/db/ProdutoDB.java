/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.unisc.db;

import br.unisc.model.Produto;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Usuario
 */
public class ProdutoDB {
    
    public ProdutoDB() throws ClassNotFoundException{
        Class.forName("org.postgresql.Driver");
    }
    
    public void inserir(Produto produto){
        String sql = "insert into produto "
                + "(nome, cod_barras, fabricante, modelo) "
                + " values (?,?,?,?) ";
        try {
            Connection conn = getConnection();
            PreparedStatement prep = conn.prepareStatement(sql);
            prep.setString(1, produto.getNome());
            prep.setString(2, produto.getCodBarras());
            prep.setString(3, produto.getFabricante());
            prep.setString(3, produto.getModelo());
            prep.execute();
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public void deletar(int codigo){
        String sql = "delete from produto where codigo = ? ";
        try {
            Connection conn = getConnection();
            PreparedStatement prep = conn.prepareStatement(sql);
            prep.setInt(1, codigo);
            prep.execute();
            
            
        } catch (SQLException ex){
            ex.printStackTrace();
        }
    }
    
    public Connection getConnection() throws SQLException{
        return DriverManager.getConnection("jdbc:postgresql://localhost:5432/pooIII", "postgres", "affsd");
    }
    
    public void atualizar(Produto produto){
        String sql = "update produto set nome=?, cod_barras=?, fabricante=?, modelo=? "
                + " where cod_prod = ? ";
        try {
            Connection conn = getConnection();
            PreparedStatement prep = conn.prepareStatement(sql);
            prep.setString(1, produto.getNome());
            prep.setString(2, produto.getCodBarras());
            prep.setString(3, produto.getFabricante());
            prep.setString(4, produto.getModelo());
            prep.execute();
            
        } catch (SQLException ex){
            ex.printStackTrace();
        }
    }
    
    public List<Produto> listar(){
        List<Produto> produtos = new LinkedList<Produto>();
        
        String sql = " select * from produto ";
        try {
            Connection conn = getConnection();
            Statement state = conn.createStatement();
            ResultSet rs = state.executeQuery(sql);
            
            while (rs.next()){
                Produto objprodutoList = new Produto();
                objprodutoList.setCodProd(rs.getInt("cod_prod"));
                objprodutoList.setNome(rs.getString("nome"));
                objprodutoList.setCodBarras(rs.getString("cod_barras"));
                objprodutoList.setFabricante(rs.getString("fabricante"));
                objprodutoList.setModelo(rs.getString("modelo"));
                
                produtos.add(objprodutoList);
            }
            
            
        } catch (SQLException ex){
            ex.printStackTrace();
        }
        
        return produtos;
    }
}
