package Utama;

public class HarryPotter {
    private String IdBarang; // private: hanya dapat diakses di kelas ini
    String NamaBarang; // default (package-private): hanya dapat diakses di package yang sama
    protected int StokBarang; // protected: dapat diakses di package yang sama dan subclass di package yang berbeda
    public int HargaBarang; // public: dapat diakses dari mana saja

        // constructor
        public HarryPotter(String IdBarang, String NamaBarang, int StokBarang, int HargaBarang){
            this.IdBarang = IdBarang;
            this.NamaBarang = NamaBarang;
            this.StokBarang = StokBarang;
            this.HargaBarang = HargaBarang;
        }

        // Getter untuk idBarang
        public String getIdBarang() {
            return IdBarang;
        }

        // Setter untuk idBarang
        public void setIdBarang(String idBarang) {
            this.IdBarang = idBarang;
        }

        // Getter untuk namaBarang
        public String getNamaBarang() {
            return NamaBarang;
        }

        // Setter untuk namaBarang
        public void setNamaBarang(String namaBarang) {
            this.NamaBarang = namaBarang;
        }

        // Getter untuk stokBarang
        public int getStokBarang() {
            return StokBarang;
        }

        // Setter untuk stokBarang
        public void setStokBarang(int stokBarang) {
            this.StokBarang = stokBarang;
        }

        // Getter untuk hargaBarang
        public int getHargaBarang() {
            return HargaBarang;
        }

        // Setter untuk hargaBarang
        public void setHargaBarang(int hargaBarang) {
            this.HargaBarang = hargaBarang;
        }
    }
    