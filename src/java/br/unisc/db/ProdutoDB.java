package br.unisc.db;

import br.unisc.model.Produto;
import br.unisc.utils.Config;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class ProdutoDB {
    
    public ProdutoDB() throws ClassNotFoundException{
        Class.forName("org.postgresql.Driver");
    }
    
    public Connection getConnection() throws SQLException{
        return DriverManager.getConnection("jdbc:postgresql://" + Config.get("host")
                + ":5432/" + Config.get("database"), Config.get("user"), Config.get("pass"));
    }
    
    public void inserir(Produto produto){
        String sql = "insert into produto "
                + "(nome, cod_barras, fabricante, modelo) "
                + " values (?,?,?,?) ";
        try {
            Connection conn = getConnection();
            PreparedStatement prep = conn.prepareStatement(sql);
            prep.setString(1, produto.getNome());
            prep.setInt(2, produto.getCod_barras());
            prep.setString(3, produto.getFabricante());
            prep.setString(4, produto.getModelo());
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
    
    public void atualizar(Produto produto){
        String sql = "update produto set nome=?, cod_barras=?, fabricante=?, modelo=? "
                + " where cod_produto = ? ";
        try {
            Connection conn = getConnection();
            PreparedStatement prep = conn.prepareStatement(sql);
            prep.setString(1, produto.getNome());
            prep.setInt(2, produto.getCod_barras());
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
                objprodutoList.setCod_produto(rs.getInt("cod_produto"));
                objprodutoList.setCod_barras(rs.getInt("cod_barras"));
                objprodutoList.setNome(rs.getString("nome"));
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
