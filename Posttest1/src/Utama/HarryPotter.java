package Utama;

public class HarryPotter {
        String IdBarang;
        String NamaBarang;
        int StokBarang;
        int HargaBarang;
    
        public HarryPotter(String IdBarang, String NamaBarang, int StokBarang, int HargaBarang){
            this.IdBarang = IdBarang;
            this.NamaBarang = NamaBarang;
            this.StokBarang = StokBarang;
            this.HargaBarang = HargaBarang;
        }
        public String getIdBarang() {
            return IdBarang;
        }
        public String getNamaBarang() {
            return NamaBarang;
        }
        public int getStokBarang() {
            return StokBarang;
        }
        public int getHargaBarang() {
            return HargaBarang;
        }
        public void setIdBarang(String idbarang) {
            IdBarang = idbarang;
        }
        public void setNamaBarang(String namabarang) {
            NamaBarang = namabarang;
        }
        public void setStokBarang(int stokbarang) {
            StokBarang = stokbarang;
        }
        public void setHargaBarang(int hargabarang) {
            HargaBarang = hargabarang;
        }
    }
    