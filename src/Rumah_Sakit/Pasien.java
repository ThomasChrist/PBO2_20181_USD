/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rumah_Sakit;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

/**
 *
 * @author Thomas Christian Wicaksono
 */
public class Pasien {

    private String Nama;
    private Date Tanggal;
    private String RekamMedis;

    public Pasien() {
    }

    public Pasien(String Nama) {
        this.Nama = Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public String getNama() {
        return Nama;
    }

    public void setTanggalLahir(int tahun, int bulan, int tanggal) {
        Tanggal = new Date(tahun - 1900, bulan - 1, tanggal);
    }

    public void setTanggal(Date Tanggal) {
        this.Tanggal = Tanggal;
    }

    public Date getTanggal() {
        return Tanggal;
    }

    public int getUsia() {
        Date usia = new Date();
        return usia.getYear() - Tanggal.getYear();
    }
    
    public void NoRekamMedis(){
        Date tanggal=new Date();
        RekamMedis="yyyyMMdd";
        SimpleDateFormat tf=new SimpleDateFormat(RekamMedis);
        System.out.println("Nomor Rekam Medis :" +tf.format(tanggal) + getNama().substring(0, 3));
}
}
