/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Test;

/**
 *
 * @author Thomas Christian Wicaksono
 */
public class Pasien {
    private String Nama;
    private String TanggalLahir;

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public String getTanggalLahir() {
        return TanggalLahir;
    }

    public void setTanggalLahir(String TanggalLahir) {
        this.TanggalLahir = TanggalLahir;
    }
    public void setTanggalLahir(int date, int month, int year) {
        this.TanggalLahir = TanggalLahir;
    }
}
