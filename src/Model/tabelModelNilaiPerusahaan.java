/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author LEGION
 */
public class tabelModelNilaiPerusahaan extends AbstractTableModel {

    List<model_nilaiPerusahaan> list;

    public tabelModelNilaiPerusahaan(List<model_nilaiPerusahaan> list) {
        this.list = list;
    }

    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return 11;
    }

    @Override
    public Object getValueAt(int row, int column) {
        switch (column) {
            case 0:
                return list.get(row).getTid();
            case 1:
                return list.get(row).getTsopan();
            case 2:
                return list.get(row).getTdisHadir();
            case 3:
                return list.get(row).getTdisPeker();
            case 4:
                return list.get(row).getTkePrak();
            case 5:
                return list.get(row).getTtngjwb();
            case 6:
                return list.get(row).getTmau();
            case 7:
                return list.get(row).getTilPrak();
            case 8:
                return list.get(row).getTtrampil();
            case 9:
                return list.get(row).getTbicara();
            case 10:
                return list.get(row).getTgaul();
            default:
                return null;
        }

    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "ID";
            case 1:
                return "Sopan Santun";
            case 2:
                return "Kehadiran";
            case 3:
                return "Pekerjaan";
            case 4:
                return "Kerja Praktek";
            case 5:
                return "Tanggung Jawab";
            case 6:
                return "Kemauan";
            case 7:
                return "Pengetahuan Ilmu";
            case 8:
                return "Ketrampilan";
            case 9:
                return "Berbicara";
            case 10:
                return "Bergaul";
            default:
                return null;
        }
    }

}
