package id.rahmanlathief.inputdata;

/**
 * Created by rahmanlathief on 04/11/16.
 */

public class Mahasiswa {
    private int nim;
    private String nama, kota;

    public Mahasiswa(int nim, String nama, String kota) {
        this.nim = nim;
        this.nama = nama;
        this.kota = kota;
    }

    public int getNim() {
        return nim;
    }

    public void setNim(int nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKota() {
        return kota;
    }

    public void setKota(String kota) {
        this.kota = kota;
    }
}
