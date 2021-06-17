/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.NilaiPerusahaan;
import View.TambahNilaiForm;
import java.sql.SQLException;

/**
 *
 * @author LEGION
 */
public interface controller_nilaiPerusahaan {
    public void Tambah(TambahNilaiForm tbhNilai) throws SQLException;
    public void Hapus(NilaiPerusahaan nilaiPer) throws SQLException;
    public void tabelKlik(NilaiPerusahaan nilaiPer) throws SQLException;
}
