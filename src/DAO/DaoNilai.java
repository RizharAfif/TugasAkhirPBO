/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.model_nilaiPerusahaan;
import connectionConfig.koneksi;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LEGION
 */
public class DaoNilai extends model_nilaiPerusahaan {

    Connection connection;
    final String tambah = "INSERT INTO nilai_pkn(sopan,disHadir,disPeker,kePrak,tngjwb,mau,ilPrak,trampil,bicara,gaul)"
            + "VALUES (?,?,?,?,?,?,?,?,?,?)";
    final String delete = "DELETE FROM nilai_pkn WHERE id=?";
    final String select = "SELECT * FROM nilai_pkn";

    public DaoNilai() throws SQLException {
        connection = (Connection) koneksi.configDB();
    }

    public void tambah(model_nilaiPerusahaan nilai) {
        PreparedStatement ps = null;
        try {
            ps = connection.prepareStatement(tambah);
            ps.setInt(1, nilai.getTsopan());
            ps.setInt(2, nilai.getTdisHadir());
            ps.setInt(3, nilai.getTdisPeker());
            ps.setInt(4, nilai.getTkePrak());
            ps.setInt(5, nilai.getTtngjwb());
            ps.setInt(6, nilai.getTmau());
            ps.setInt(7, nilai.getTilPrak());
            ps.setInt(8, nilai.getTtrampil());
            ps.setInt(9, nilai.getTbicara());
            ps.setInt(10, nilai.getTgaul());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally{
            try {
                ps.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    } // end method
    
    public void delete(int id){
        PreparedStatement ps = null;
        try {
            ps = connection.prepareStatement(delete);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally{
            try {
            ps.close();    
            } catch (Exception e) {
                e.printStackTrace();
            }
            
        } 
    } // ebd method
    
    public List<model_nilaiPerusahaan> get(){
        List<model_nilaiPerusahaan> list = null;
        try {
            list = new ArrayList<model_nilaiPerusahaan>();
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(select);
            while (rs.next()) {                
                model_nilaiPerusahaan m = new model_nilaiPerusahaan();
                
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
