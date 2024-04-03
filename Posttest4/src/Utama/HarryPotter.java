package Utama;

public class HarryPotter {
    private String idBarang;
    String namaBarang;
    protected int stokBarang;
    public int hargaBarang;

    public HarryPotter(String idBarang, String namaBarang, int stokBarang, int hargaBarang) {
        this.idBarang = idBarang;
        this.namaBarang = namaBarang;
        this.stokBarang = stokBarang;
        this.hargaBarang = hargaBarang;
    }

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

    public void tampil() {
        System.out.println("Id Barang: " + idBarang);
        System.out.println("Nama Barang: " + namaBarang);
        System.out.println("Stok Barang: " + stokBarang);
        System.out.println("Harga Barang: " + hargaBarang);
    }
}
