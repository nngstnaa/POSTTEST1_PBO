package Utama;
public class Novel extends HarryPotter {
    private String judulNovel;

    public Novel(String IdBarang, String judulNovel, int stokBarang, int hargaBarang) {
        super(IdBarang, "Novel", stokBarang, hargaBarang);
        this.judulNovel = judulNovel;
    }
    
    public String getJudulNovel() {
        return judulNovel;
    }

    public void setJudulNovel(String judulNovel) {
        this.judulNovel = judulNovel;
    }
}
