import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
        Yonetim yonetim = new Yonetim();
        Gise g1 = new Gise(1);
        Gise g2 = new Gise(2);
        Gise g3 = new Gise(3);

        Otomobil otmbl1 = new Otomobil("Huseyin","Ozdagli","000001",30.60);
        Otomobil otmbl2 = new Otomobil("Brad","Pitt","000002",5.85);
        Otomobil otmbl3 = new Otomobil("Tom","Hanks","000003",45.45);
        Otomobil otmbl4 = new Otomobil("Will","Smith","000004",27.50);
        Otomobil otmbl5 = new Otomobil("Johnny","Depp","000005",123.25);

        Minibus m1 = new Minibus("Al","Pacino","000006",10.75);
        Minibus m2 = new Minibus("Harrison","Ford","000007",200.50);
        Minibus m3 = new Minibus("Enzo","Ferrari","000008",42.75);
        Minibus m4 = new Minibus("Heath","Ledger","000009",25.50);
        Minibus m5 = new Minibus("Matt","Damon","000010",23.70);

        Otobus otbs1 = new Otobus("Robert","Downey Jr.","000011",120.70);
        Otobus otbs2 = new Otobus("Elvis","Presley","000012",18.40);
        Otobus otbs3 = new Otobus("Keanu","Reeves","000013",25);
        Otobus otbs4 = new Otobus("Christian","Bale","000014",999.99);
        Otobus otbs5 = new Otobus("Patrick","Bateman","000015",999.99);

        g1.odeme(otmbl1);
        g2.odeme(otmbl2);
        g3.odeme(otmbl3);
        g1.odeme(otmbl4);
        g2.odeme(otmbl5);

        g3.odeme(m1);
        g1.odeme(m2);
        g2.odeme(m3);
        g3.odeme(m4);
        g1.odeme(m5);

        g2.odeme(otbs1);
        g3.odeme(otbs2);
        g1.odeme(otbs3);
        g2.odeme(otbs4);
        g3.odeme(otbs5);

        yonetim.GiseBakiyeGoster(g1);
        System.out.println("----------------------");
        yonetim.TumGiseleriGoster();
        System.out.println("----------------------");
        yonetim.ToplamBakiyeGoster();
        System.out.println("----------------------");
        g1.gecenAraclariGoster();
        g2.gecenAraclariGoster();
        g3.gecenAraclariGoster();
        System.out.println("----------------------");
    }
}








class Otomobil {
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

class Minibus {
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

class Otobus {
    public Otobus(String sahibininAdi, String sahibininSoyadi, String HGSNumarasi, double bakiye) {
        this.sahibininAdi = sahibininAdi;
        this.sahibininSoyadi = sahibininSoyadi;
        this.HGSNumarasi = HGSNumarasi;
        this.bakiye = bakiye;
    }

    public static final int type = 3;
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



class Yonetim {
    public static ArrayList<Gise> giseler = new ArrayList<>();
    public void GiseBakiyeGoster(Gise g){
        System.out.println();
        System.out.println("******** GISE NO : " + g.getGiseNo() + " ********");
        System.out.println("* GISE BAKIYESI : " + g.getBakiye() + "       ");
        System.out.println("*                           *");
        System.out.println("* GECEN OTOMOBIL SAYISI : " + g.getOtomobilSayisi() + " *");
        System.out.println("*                           *");
        System.out.println("* GECEN MINIBUS SAYISI :  " + g.getMinibusSayisi() + " *");
        System.out.println("*                           *");
        System.out.println("* GECEN OTOBUS SAYISI :   " + g.getOtobusSayisi() + " *");
        System.out.println("*****************************");
        System.out.println();



    }
    public void TumGiseleriGoster(){
        for (Gise g: giseler) {
            GiseBakiyeGoster(g);
        }
    }

    public void ToplamBakiyeGoster(){
        double toplam = 0;
        for (Gise g: giseler) {
            System.out.println("Gise No : " + g.getGiseNo() + " - Gise bakiyesi : " + g.getBakiye());
            toplam += g.getBakiye();
        }
        System.out.println("TOPLAM BAKIYE : " + toplam);
    }
}


class Gise {

    public static final int OTOMOBIL_FIYATI = 10;
    public static final int MINIBUS_FIYATI = 15;
    public static final int OTOBUS_FIYATI = 20;
    private double bakiye;
    private int giseNo;

    public int getGiseNo() {
        return giseNo;
    }

    public void setGiseNo(int giseNo) {
        this.giseNo = giseNo;
    }

    private int otomobilSayisi = 0, minibusSayisi = 0, otobusSayisi = 0;
    ArrayList<Object> gecenAraclar = new ArrayList<>();

    public Gise(int giseNo) {
        this.giseNo = giseNo;
        Yonetim.giseler.add(this);
    }

    public void odeme(Object o){


        if(o instanceof Otomobil){
            Otomobil arac = ((Otomobil) o);
            if(arac.getBakiye() >= OTOMOBIL_FIYATI){
                arac.setBakiye(arac.getBakiye() - OTOMOBIL_FIYATI);
                this.bakiye += OTOMOBIL_FIYATI;
                otomobilSayisi++;
                gecenAraclar.add(o);
            }
            else{
                System.out.println("Hata! " + arac.getHGSNumarasi() + " HGS No'lu aracin gecisi yapilamadi, yetersiz bakiye!");
            }
        }


        else if (o instanceof Minibus){
            Minibus arac = ((Minibus) o);
            if(arac.getBakiye() >= MINIBUS_FIYATI){
                arac.setBakiye(arac.getBakiye() - MINIBUS_FIYATI);
                this.bakiye += MINIBUS_FIYATI;
                minibusSayisi++;
                gecenAraclar.add(o);
            }
            else{
                System.out.println("Hata! " + arac.getHGSNumarasi() + " HGS No'lu aracin gecisi yapilamadi, yetersiz bakiye!");
            }
        }


        else if (o instanceof Otobus) {
            Otobus arac = ((Otobus) o);
            if (arac.getBakiye() >= OTOBUS_FIYATI) {
                arac.setBakiye(arac.getBakiye() - OTOBUS_FIYATI);
                this.bakiye += OTOBUS_FIYATI;
                otobusSayisi++;
                gecenAraclar.add(o);
            }
            else {
                System.out.println("Hata! " + arac.getHGSNumarasi() + " HGS No'lu aracin gecisi yapilamadi, yetersiz bakiye!");
            }
        }
        else {
            System.out.println("Hatali tip");
        }
    }


    public void gecenAraclariGoster(){
        System.out.println();
        System.out.println("----- " + this.giseNo + " no'lu giseden gecen araclar gosteriliyor -----");
        for (Object o : gecenAraclar) {
            if(o instanceof Otomobil){
                Otomobil arac = ((Otomobil) o);
                System.out.println();
                System.out.println("******** ARACIN SINIFI : " + arac.type + " ********");
                System.out.println("* ARAC SAHIBININ ADI : " + arac.getSahibininAdi() );
                System.out.println("*                           ");
                System.out.println("* ARAC SAHIBININ SOYADI : " + arac.getSahibininSoyadi());
                System.out.println("*                           ");
                System.out.println("* ARACA KAYITLI HGS NO :  " + arac.getHGSNumarasi());
                System.out.println("*                           ");
                System.out.println("* ARACIN HGS BAKIYESI :   " + arac.getBakiye());
                System.out.println("***********************************");
                System.out.println();
            }
            else if(o instanceof Minibus){
                Minibus arac = ((Minibus) o);
                System.out.println();
                System.out.println("******** ARACIN SINIFI : " + arac.type + " ********");
                System.out.println("* ARAC SAHIBININ ADI : " + arac.getSahibininAdi() );
                System.out.println("*                           ");
                System.out.println("* ARAC SAHIBININ SOYADI : " + arac.getSahibininSoyadi());
                System.out.println("*                           ");
                System.out.println("* ARACA KAYITLI HGS NO :  " + arac.getHGSNumarasi());
                System.out.println("*                           ");
                System.out.println("* ARACIN HGS BAKIYESI :   " + arac.getBakiye());
                System.out.println("***********************************");
                System.out.println();
            }
            else if(o instanceof Otobus){
                Otobus arac = ((Otobus) o);
                System.out.println();
                System.out.println("******** ARACIN SINIFI : " + arac.type + " ********");
                System.out.println("* ARAC SAHIBININ ADI : " + arac.getSahibininAdi() );
                System.out.println("*                           ");
                System.out.println("* ARAC SAHIBININ SOYADI : " + arac.getSahibininSoyadi());
                System.out.println("*                           ");
                System.out.println("* ARACA KAYITLI HGS NO :  " + arac.getHGSNumarasi());
                System.out.println("*                           ");
                System.out.println("* ARACIN HGS BAKIYESI :   " + arac.getBakiye());
                System.out.println("***********************************");
                System.out.println();
            }
        }
        System.out.println("----- " + this.giseNo + " no'lu giseden gecen arac gosterimi bitti -----");
        System.out.println();
    }










    public double getBakiye() {
        return bakiye;
    }

    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }

    public int getMinibusSayisi() {
        return minibusSayisi;
    }

    public void setMinibusSayisi(int minibusSayisi) {
        this.minibusSayisi = minibusSayisi;
    }

    public int getOtobusSayisi() {
        return otobusSayisi;
    }

    public void setOtobusSayisi(int otobusSayisi) {
        this.otobusSayisi = otobusSayisi;
    }

    public int getOtomobilSayisi() {
        return otomobilSayisi;
    }

    public void setOtomobilSayisi(int otomobilSayisi) {
        this.otomobilSayisi = otomobilSayisi;
    }
}

