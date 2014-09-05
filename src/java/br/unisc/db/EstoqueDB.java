package br.unisc.db;

import br.unisc.model.Estoque;
import br.unisc.utils.Config;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Eduardo
 */
public class EstoqueDB {
    public EstoqueDB() throws ClassNotFoundException{
        Class.forName("org.postgresql.Driver");
    }
    
    public Connection getConnection() throws SQLException{
        return DriverManager.getConnection("jdbc:postgresql://" + Config.get("host")
                + ":5432/" + Config.get("database"), Config.get("user"), Config.get("pass"));
    }
    
    public void inserir(Estoque estoque){
        /*String sql = "insert into estoque "
                + "(cod_estoque, cod_produto, qtd_produto, validade) "
                + " values (?,?,?,?) ";
        */
        String sql = "insert into estoque "
                + "(cod_estoque, cod_produto, qtd_produto) "
                + " values (?,?,?) ";
        
        try {
            Connection conn = getConnection();
            PreparedStatement prep = conn.prepareStatement(sql);
            prep.setInt(1, estoque.getCod_estoque());
            prep.setInt(2, estoque.getCod_produto());
            prep.setInt(3, estoque.getQtd_produto());
            //prep.setString(4, estoque.getValidade());
            prep.execute();
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
