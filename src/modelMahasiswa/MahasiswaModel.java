/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelMahasiswa;

/**
 *
 * @author LEGION
 */
public class MahasiswaModel {   
    private Integer id_mahasiswa;
    private String nama;
    private String nim;
    private String judulPkn;
    private String nilai;

    public Integer getId_Mahasiswa() {
        return id_mahasiswa;
    }

    public void setId_Mahasiswa(Integer id_mahasiswa) {
        this.id_mahasiswa = id_mahasiswa;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getJudulPkn() {
        return judulPkn;
    }

    public void setJudulPkn(String judulPkn) {
        this.judulPkn = judulPkn;
    }

    public String getNilai() {
        return nilai;
    }

    public void setNilai(String nilai) {
        this.nilai = nilai;
    }

    
}
