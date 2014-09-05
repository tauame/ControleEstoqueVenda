package br.unisc.db;

import br.unisc.model.Venda;
import br.unisc.utils.Config;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Eduardo
 */
public class VendaDB {
public VendaDB() throws ClassNotFoundException{
        Class.forName("org.postgresql.Driver");
    }
    
    public Connection getConnection() throws SQLException{
        return DriverManager.getConnection("jdbc:postgresql://" + Config.get("host")
                + ":5432/" + Config.get("database"), Config.get("user"), Config.get("pass"));
    }
    
    public void inserir(Venda venda){
        String sql = "insert into venda "
                + "(cod_produto, qtd_produto) "
                + " values (?,?) ";
        try {
            Connection conn = getConnection();
            PreparedStatement prep = conn.prepareStatement(sql);
            prep.setInt(1, venda.getCod_produto());
            prep.setInt(2, venda.getQtd_produto());
            prep.execute();
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
