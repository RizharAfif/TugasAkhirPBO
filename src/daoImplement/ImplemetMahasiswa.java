/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daoImplement;

import java.util.List;
import modelMahasiswa.MahasiswaModel;

/**
 *
 * @author LEGION
 */
public interface ImplemetMahasiswa {
    public void update(MahasiswaModel b);
    
    public List<MahasiswaModel> getAll();
}
