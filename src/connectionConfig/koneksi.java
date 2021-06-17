/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connectionConfig;

import java.sql.*;

/**
 *
 * @author LEGION
 */
public class koneksi {
    private static koneksi conn;
    
    public static koneksi configDB() throws SQLException{
        try {
            String url = "jdbc:mysql://localhost:3306/db_tugasakhir";
            String user = "root";
            String pass = "";
            
            DriverManager.registerDriver((new com.mysql.jdbc.Driver()));
            conn = (koneksi) DriverManager.getConnection(url, user, pass);
            System.out.println("Koneksi Berhasil");
        } catch (SQLException e) {
            System.out.println("Koneksi Gagal" + e.getMessage());
        }
        return conn;
    }
}
