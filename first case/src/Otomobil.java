public class Otomobil {
    public final int type = 1;
    private String sahibininAdi;
    private String sahibininSoyadi;
    private String HGSNumarasi;
    private double bakiye;

    public Otomobil(String sahibininAdi, String sahibininSoyadi, String HGSNumarasi, double bakiye) {
        this.sahibininAdi = sahibininAdi;
        this.sahibininSoyadi = sahibininSoyadi;
        this.HGSNumarasi = HGSNumarasi;
        this.bakiye = bakiye;
    }

    public String getSahibininAdi() {
        return sahibininAdi;
    }

    public void setSahibininAdi(String sahibininAdi) {
        this.sahibininAdi = sahibininAdi;
    }

    public String getSahibininSoyadi() {
        return sahibininSoyadi;
    }

    public void setSahibininSoyadi(String sahibininSoyadi) {
        this.sahibininSoyadi = sahibininSoyadi;
    }

    public String getHGSNumarasi() {
        return HGSNumarasi;
    }

    public void setHGSNumarasi(String HGSNumarasi) {
        this.HGSNumarasi = HGSNumarasi;
    }

    public double getBakiye() {
        return bakiye;
    }

    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }
}
