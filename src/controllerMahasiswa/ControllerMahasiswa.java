/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllerMahasiswa;

import daoImplement.ImplemetMahasiswa;
import daoMahasiswa.DaoMahasiswa;
import java.io.File;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import modelMahasiswa.MahasiswaModel;
import modelMahasiswa.tableModelMahasiswa;
import viewMahasiswa.DaftarForm;



/**
 *
 * @author LEGION
 */
public class ControllerMahasiswa {
    DaftarForm form;
    ImplemetMahasiswa implement;
    List<MahasiswaModel> list;
    
    public ControllerMahasiswa(DaftarForm form){
        this.form = form;
        implement = new DaoMahasiswa();
        list = implement.getAll();
    }
    
    public void reset(){
        form.getTxtID().setText("");
        form.getTxtNama().setText("");
        form.getTxtJudul().setText("");
        form.getTxtNim().setText("");
        form.getTxtNilai().setText("");
    }
    
    public void isiTabel(){
        list = implement.getAll();
        tableModelMahasiswa tabel = new tableModelMahasiswa(list);
        form.getTabelData().setModel(tabel);
    }
    
    public void klikTabel(int row){
        form.getTxtID().setText(list.get(row).getId_Mahasiswa().toString());
        form.getTxtNama().setText(list.get(row).getNama());
        form.getTxtNim().setText(list.get(row).getNim());
        form.getTxtJudul().setText(list.get(row).getJudulPkn());
        form.getTxtNilai().setText(list.get(row).getNilai());
    }
    
    public void update(){
        if(!form.getTxtID().getText().trim().isEmpty()){
            MahasiswaModel mm = new MahasiswaModel();
            mm.setNama(form.getTxtNama().getText());
            mm.setNim(form.getTxtNim().getText());
            mm.setJudulPkn(form.getTxtJudul().getText());
            mm.setNilai(form.getTxtNilai().getText());
            mm.setId_Mahasiswa(Integer.parseInt(form.getTxtID().getText()));
            implement.update(mm);
            JOptionPane.showMessageDialog(null, "Data berhasil diupdate");
        } else {
            JOptionPane.showMessageDialog(null, "Data gagal diupdate");
        }
    }
    
    public void cariFile(){
    JFileChooser chooser = new JFileChooser();
    chooser.showOpenDialog(null);
    File f = chooser.getSelectedFile();
    String filename = f.getName();
    form.getTxtNilai().setText(filename);
    }
}
