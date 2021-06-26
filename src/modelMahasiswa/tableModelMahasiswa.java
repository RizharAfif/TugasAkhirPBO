/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelMahasiswa;

import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author LEGION
 */
public class tableModelMahasiswa extends AbstractTableModel{
    List<MahasiswaModel> lb;
 
    public tableModelMahasiswa(List<MahasiswaModel> lb) {
        this.lb = lb;
    }
    
    public int getRowCount() {
         return lb.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }
    
     @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "ID";
            case 1:
                return "Nama";
            case 2:
                return "Nim";
            case 3:
                return "Judul Pkn";
            case 4:
                return "Nilai";
            default:
                return null;
        }
    }

    @Override
    public Object getValueAt(int row, int column) {
        switch (column) {
            case 0:
                return lb.get(row).getId_Mahasiswa();
            case 1:
                return lb.get(row).getNim();
            case 2:
                return lb.get(row).getNama();
            case 3:
                return lb.get(row).getJudulPkn();
            case 4:
                return lb.get(row).getNilai();
            default:
                return null;
        }
    }
    
}
