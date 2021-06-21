/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connectionConfig;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author LEGION
 */
public class Koneksi {
    private static Connection conn;
    private Connection a = configDB();
    
    public static Connection configDB(){
       if (conn ==null) {
            MysqlDataSource data = new MysqlDataSource();
            data.setDatabaseName("db_tugasakhir");
            data.setUser("root");
            data.setPassword("");
            
            try {
                conn = data.getConnection();
            } catch (SQLException e){
                JOptionPane.showMessageDialog(null, "Gagal Koneksi" +e.getMessage());
            }
        }
        return conn;
     
    }
}
