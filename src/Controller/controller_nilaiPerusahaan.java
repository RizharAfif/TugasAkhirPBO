/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.DaoImplement;
import DAO.DaoNilai;
import Model.model_nilaiPerusahaan;
import Model.tabelModelNilaiPerusahaan;
import View.NilaiPerusahaan;
import View.TambahNilaiForm;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author LEGION
 */
public class controller_nilaiPerusahaan {
    TambahNilaiForm tbh;
    NilaiPerusahaan nilai;
    DaoImplement dao;
    List<model_nilaiPerusahaan> list;
    
    public controller_nilaiPerusahaan(TambahNilaiForm tbh) throws SQLException{
        this.tbh = tbh; 
        dao = new DaoNilai();
        list = dao.getAll();
    }
    
    public controller_nilaiPerusahaan(NilaiPerusahaan nilai) throws SQLException{
        this.nilai = nilai;
        dao = new DaoNilai();
        list = dao.getAll();
    }
    
    public void reset(){
        tbh.getSopan().setText("");
        tbh.getDisHadir().setText("");
        tbh.getDisPeker().setText("");
        tbh.getKePrak().setText("");
        tbh.getTngjwb().setText("");
        tbh.getMau().setText("");
        tbh.getIlPrak().setText("");
        tbh.getTrampil().setText("");
        tbh.getBicara().setText("");
        tbh.getGaul().setText("");
    }
    
    public void isiTabel(){
        list = dao.getAll();
        tabelModelNilaiPerusahaan tabel = new tabelModelNilaiPerusahaan(list);
        nilai.getTableView().setModel(tabel);
    }
    
    public void insert(){
        if(!tbh.getSopan().getText().trim().isEmpty() & !tbh.getDisHadir().getText().trim().isEmpty()&
           !tbh.getDisPeker().getText().trim().isEmpty()&!tbh.getKePrak().getText().trim().isEmpty()&
           !tbh.getTngjwb().getText().trim().isEmpty()&!tbh.getMau().getText().trim().isEmpty()&
           !tbh.getIlPrak().getText().trim().isEmpty()&!tbh.getTrampil().getText().trim().isEmpty()&
           !tbh.getBicara().getText().trim().isEmpty()&!tbh.getGaul().getText().trim().isEmpty()){
            
            model_nilaiPerusahaan m = new model_nilaiPerusahaan();
            m.setTsopan(Integer.parseInt(tbh.getSopan().getText()));
            m.setTdisHadir(Integer.parseInt(tbh.getDisHadir().getText()));
            m.setTdisPeker(Integer.parseInt(tbh.getDisPeker().getText()));
            m.setTkePrak(Integer.parseInt(tbh.getKePrak().getText()));
            m.setTtngjwb(Integer.parseInt(tbh.getTngjwb().getText()));
            m.setTmau(Integer.parseInt(tbh.getMau().getText()));
            m.setTilPrak(Integer.parseInt(tbh.getIlPrak().getText()));
            m.setTtrampil(Integer.parseInt(tbh.getTrampil().getText()));
            m.setTbicara(Integer.parseInt(tbh.getBicara().getText()));
            m.setTgaul(Integer.parseInt(tbh.getGaul().getText()));
            
            dao.Tambah(m);
            JOptionPane.showMessageDialog(null, "Simpan Berhasil");
        } else{
            JOptionPane.showMessageDialog(null, "Simpan Gagal");
        }
    }
    
    public void delete(){
        if(nilai.getTableView().getSelectedRow()>0){
            JOptionPane.showMessageDialog(null, "Data Berhasil didelete");
            dao.Hapus();
        } else {
            JOptionPane.showMessageDialog(null, "Delete Gagal");
        }
    }
}
