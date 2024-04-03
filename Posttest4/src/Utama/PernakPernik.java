package Utama;

public class PernakPernik extends HarryPotter {
    private String namaPernakPernik;

    public PernakPernik(String IdBarang, String namaPernakPernik, int StokBarang, int HargaBarang) {
        super(IdBarang, "Pernak Pernik", StokBarang, HargaBarang);
        this.namaPernakPernik = namaPernakPernik;
    }

    public String getNamaPernakPernik() {
        return namaPernakPernik;
    }

    public void setNamaPernakPernik(String namaPernakPernik) {
        this.namaPernakPernik = namaPernakPernik;
    }

    @Override
    public void tampil() {
        System.out.println("Id Barang          : " + super.getIdBarang());
        System.out.println("Stok Barang        : " + stokBarang);
        System.out.println("Nama Pernak Pernik : " + this.getNamaPernakPernik());
    }
}

