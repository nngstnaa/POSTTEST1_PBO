package Utama;

public final class PernakPernik extends HarryPotter {
    private final String idBarang; // Atribut idBarang dijadikan final
    private String namaPernakPernik;

    public PernakPernik(String idBarang, String namaPernakPernik, int stokBarang, int hargaBarang) {
        super(idBarang, "Pernak Pernik", stokBarang, hargaBarang);
        this.idBarang = idBarang; // Inisialisasi atribut idBarang saat objek PernakPernik dibuat
        this.namaPernakPernik = namaPernakPernik;
    }

    public String getIdBarang() {
        return idBarang;
    }

    public String getNamaPernakPernik() {
        return namaPernakPernik;
    }

    public void setNamaPernakPernik(String namaPernakPernik) {
        this.namaPernakPernik = namaPernakPernik;
    }

    @Override
    public final void tampil() {
        System.out.println("Id Barang           : " + idBarang); // Menggunakan idBarang yang sudah final
        System.out.println("Jenis Barang        : Pernak Pernik");
        System.out.println("Nama Pernak Pernik  : " + this.getNamaPernakPernik());
        System.out.println("Stok Pernak Pernik  : " + super.getStokBarang());
        System.out.println("Harga Pernak Pernik : " + super.getHargaBarang());
    }
}
