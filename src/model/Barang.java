
package model;

public class Barang {
    private String kode;
    private String nama;
    private int jumlahTersedia;
    
    public Barang(String kode, String nama, int jumlahTersedia) {
        if (kode == null || kode.trim().isEmpty()) {
            throw new IllegalArgumentException("Nama barang wajib diisi.");
        }
        this.kode = kode.trim();
        this.nama = nama.trim();
        this.jumlahTersedia = jumlahTersedia; 
        }
    
    public String getKode() { return kode; }
    public String getNama() { return nama; }
    public int getJumlahTersedia() { return jumlahTersedia; }

}
