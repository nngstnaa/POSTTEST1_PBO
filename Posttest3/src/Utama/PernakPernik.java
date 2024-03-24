package Utama;

public class PernakPernik extends HarryPotter {
    private String namaPernakPernik;

    public PernakPernik(String IdBarang, String namaPernakPernik, int StokBarang, int HargaBarang) {
        super(IdBarang, namaPernakPernik, StokBarang, HargaBarang);
        this.namaPernakPernik = namaPernakPernik;
    }

    // Getter dan setter untuk atribut khusus PernakPernik (namaPernakPernik)
    public String getNamaPernakPernik() {
        return namaPernakPernik;
    }

    public void setNamaPernakPernik(String namaPernakPernik) {
        this.namaPernakPernik = namaPernakPernik;
    }
}
