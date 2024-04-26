package Utama;

// Kelas abstract HarryPotter
public abstract class HarryPotter {
    // Atribut yang dijadikan keyword final
    private final String idBarang;
    private final String namaBarang;
    protected int stokBarang;
    public int hargaBarang;

    // Konstruktor
    public HarryPotter(String idBarang, String namaBarang, int stokBarang, int hargaBarang) {
        this.idBarang = idBarang;
        this.namaBarang = namaBarang;
        this.stokBarang = stokBarang;
        this.hargaBarang = hargaBarang;
    }

    // Metode abstract yang harus diimplementasikan oleh kelas turunan
    public abstract void tampil();

    public String getIdBarang() {
        return idBarang;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public int getStokBarang() {
        return stokBarang;
    }

    public void setStokBarang(int stokBarang) {
        this.stokBarang = stokBarang;
    }

    public int getHargaBarang() {
        return hargaBarang;
    }

    public void setHargaBarang(int hargaBarang) {
        this.hargaBarang = hargaBarang;
    }
}
