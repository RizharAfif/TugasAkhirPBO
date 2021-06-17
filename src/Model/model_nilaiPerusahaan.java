/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Controller.controller_nilaiPerusahaan;
import View.NilaiPerusahaan;
import View.TambahNilaiForm;
import connectionConfig.koneksi;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author LEGION
 */
public class model_nilaiPerusahaan implements controller_nilaiPerusahaan{

    @Override
    public void Tambah(TambahNilaiForm tbhNilai) throws SQLException {
//        throw new UnsupportedOperationException("Not supported yet."); 
        try {
            Connection con = (Connection) koneksi.configDB();
            String sql = "insert nilai_pkn values(?,?,?,?,?,?,?,?,?,?)";
        } catch (Exception e) {
        }
    }

    @Override
    public void Hapus(NilaiPerusahaan nilaiPer) throws SQLException {
//        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void tabelKlik(NilaiPerusahaan nilaiPer) throws SQLException {
//        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
}
