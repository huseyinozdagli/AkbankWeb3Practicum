public class Minibus {
    public Minibus(String sahibininAdi, String sahibininSoyadi, String HGSNumarasi, double bakiye) {
        this.sahibininAdi = sahibininAdi;
        this.sahibininSoyadi = sahibininSoyadi;
        this.HGSNumarasi = HGSNumarasi;
        this.bakiye = bakiye;
    }

    public static final int type = 2;
    private String sahibininAdi;
    private String sahibininSoyadi;
    private String HGSNumarasi;
    private double bakiye;

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
