package Utama;

public final class Novel extends HarryPotter {
    private String judulNovel;

    public Novel(String idBarang, String judulNovel, int stokBarang, int hargaBarang) {
        super(idBarang, "Novel", stokBarang, hargaBarang);
        this.judulNovel = judulNovel;
    }
    
    public String getJudulNovel() {
        return judulNovel;
    }

    public void setJudulNovel(String judulNovel) {
        this.judulNovel = judulNovel;
    }
    
    @Override
    public final void tampil() {
        System.out.println("Id Barang        : " + super.getIdBarang());
        System.out.println("Jenis Barang     : Novel");
        System.out.println("Judul Novel      : " + this.getJudulNovel());
        System.out.println("Stok Novel       : " + super.getStokBarang());
        System.out.println("Harga Novel      : " + super.getHargaBarang());
    }
}
