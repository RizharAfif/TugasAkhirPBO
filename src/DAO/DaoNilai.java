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
public class DaoNilai implements DaoImplement {

    Connection connection;
    final String tambah = "INSERT INTO nilai_pkn(sopan,disHadir,disPeker,kePrak,tngjwb,mau,ilPrak,trampil,bicara,gaul)"
            + "VALUES (?,?,?,?,?,?,?,?,?,?)";
    final String delete = "DELETE FROM nilai_pkn WHERE id=?";
    final String select = "SELECT * FROM nilai_pkn";

    public DaoNilai() throws SQLException{
        connection = (Connection) koneksi.configDB();
    }

    @Override
    public void Tambah(model_nilaiPerusahaan m){
         PreparedStatement ps = null;
        try {
            ps = connection.prepareStatement(tambah);
            ps.setInt(1, m.getTsopan());
            ps.setInt(2, m.getTdisHadir());
            ps.setInt(3, m.getTdisPeker());
            ps.setInt(4, m.getTkePrak());
            ps.setInt(5, m.getTtngjwb());
            ps.setInt(6, m.getTmau());
            ps.setInt(7, m.getTilPrak());
            ps.setInt(8, m.getTtrampil());
            ps.setInt(9, m.getTbicara());
            ps.setInt(10, m.getTgaul());
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

    @Override
    public void Hapus() {
         PreparedStatement ps = null;
        try {
            ps = connection.prepareStatement(delete);
//            ps.setInt(1, id);
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
    } //end method

    @Override
    public List<model_nilaiPerusahaan> getAll() {
        List<model_nilaiPerusahaan> list = null;
        try {
            list = new ArrayList<model_nilaiPerusahaan>();
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(select);
            while (rs.next()) {                
                model_nilaiPerusahaan m = new model_nilaiPerusahaan();
                m.setTid(rs.getInt("id"));
                m.setTsopan(rs.getInt("sopan"));
                m.setTdisHadir(rs.getInt("disHadir"));
                m.setTdisPeker(rs.getInt("disPeker"));
                m.setTkePrak(rs.getInt("kePrak"));
                m.setTtngjwb(rs.getInt("tngjwb"));
                m.setTmau(rs.getInt("mau"));
                m.setTilPrak(rs.getInt("ilPrak"));
                m.setTtrampil(rs.getInt("trampil"));
                m.setTbicara(rs.getInt("bicara"));
                m.setTgaul(rs.getInt("gaul"));
                list.add(m);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
