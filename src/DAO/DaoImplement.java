/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.model_nilaiPerusahaan;
import View.NilaiPerusahaan;
import View.TambahNilaiForm;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author LEGION
 */
public interface DaoImplement {
    public void Tambah(model_nilaiPerusahaan m);
    public void Hapus();
    public List<model_nilaiPerusahaan> getAll();
}
