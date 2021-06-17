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
public class model_nilaiPerusahaan {

    private int Tid;
    private int Tsopan;
    private int TdisHadir;
    private int TdisPeker;
    private int TkePrak;
    private int Ttngjwb;
    private int Tmau;
    private int TilPrak;
    private int Ttrampil;
    private int Tbicara;
    private int Tgaul;

    public int getTid() {
        return Tid;
    }

    public void setTid(int Tid) {
        this.Tid = Tid;
    }

    public int getTsopan() {
        return Tsopan;
    }

    public void setTsopan(int Tsopan) {
        this.Tsopan = Tsopan;
    }

    public int getTdisHadir() {
        return TdisHadir;
    }

    public void setTdisHadir(int TdisHadir) {
        this.TdisHadir = TdisHadir;
    }

    public int getTdisPeker() {
        return TdisPeker;
    }

    public void setTdisPeker(int TdisPeker) {
        this.TdisPeker = TdisPeker;
    }

    public int getTkePrak() {
        return TkePrak;
    }

    public void setTkePrak(int TkePrak) {
        this.TkePrak = TkePrak;
    }

    public int getTtngjwb() {
        return Ttngjwb;
    }

    public void setTtngjwb(int Ttngjwb) {
        this.Ttngjwb = Ttngjwb;
    }

    public int getTmau() {
        return Tmau;
    }

    public void setTmau(int Tmau) {
        this.Tmau = Tmau;
    }

    public int getTilPrak() {
        return TilPrak;
    }

    public void setTilPrak(int TilPrak) {
        this.TilPrak = TilPrak;
    }

    public int getTtrampil() {
        return Ttrampil;
    }

    public void setTtrampil(int Ttrampil) {
        this.Ttrampil = Ttrampil;
    }

    public int getTbicara() {
        return Tbicara;
    }

    public void setTbicara(int Tbicara) {
        this.Tbicara = Tbicara;
    }

    public int getTgaul() {
        return Tgaul;
    }

    public void setTgaul(int Tgaul) {
        this.Tgaul = Tgaul;
    }
    
}
