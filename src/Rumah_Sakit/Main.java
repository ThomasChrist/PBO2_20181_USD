/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rumah_Sakit;

/**
 *
 * @author Thomas Christian Wicaksono
 */
public class Main {
    public static void main(String[] args) {
        Pasien pas=new Pasien("Thomas");
        pas.setTanggalLahir(1998, 8, 19);
        System.out.println("DATA PASIEN");
        System.out.println("Nama : " +pas.getNama());
        System.out.println("Umur : "+pas.getUsia());
        pas.NoRekamMedis();
      //  System.out.println("Nomor Rekam Medis : "+pas.NoRekamMedis());
    }
}
