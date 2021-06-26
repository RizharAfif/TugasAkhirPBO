/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daoMahasiswa;

import connectionConfig.Koneksi;
import daoImplement.ImplemetMahasiswa;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelMahasiswa.MahasiswaModel;

/**
 *
 * @author LEGION
 */
public class DaoMahasiswa implements ImplemetMahasiswa{
    
    Connection con;
    final String update = "UPDATE tb_mahasiswa set judulPkn=?, nilai=? where id_mahasiswa=? ;";
    final String select = "SELECT id_mahasiswa,nama, nim, judulPkn, nilai FROM tb_mahasiswa ";
    
    public DaoMahasiswa(){
        con = Koneksi.configDB();
    }

    @Override
    public void update(MahasiswaModel b) {
        PreparedStatement ps = null;
        try{
            ps = con.prepareStatement(update);
            
//            ps.setString(1, b.getNama());
//            ps.setString(1, b.getNim());
            ps.setString(1, b.getJudulPkn());
            ps.setString(2, b.getNilai());
            ps.setInt(3, b.getId_Mahasiswa());
            
            
            ps.executeUpdate();

        } catch (SQLException e){
            e.printStackTrace();
        } finally {
            try {
                ps.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    @Override
    public List<MahasiswaModel> getAll() {
        List<MahasiswaModel> list = null;
        try{
            list = new ArrayList<MahasiswaModel>();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(select);
            while(rs.next()){
                MahasiswaModel mm = new MahasiswaModel();
                mm.setId_Mahasiswa(rs.getInt("id_mahasiswa"));
                mm.setNama(rs.getString("nama"));
                mm.setNim(rs.getString("nim"));
                mm.setJudulPkn(rs.getString("judulPkn"));
                mm.setNilai(rs.getString("nilai"));
                list.add(mm);
            }
        } catch (SQLException e){
            Logger.getLogger(MahasiswaModel.class.getName()).log(Level.SEVERE, null, e);
        }
        return list;
    }
    
}
