import java.util.ArrayList;
public class Gise {

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
            System.out.println("Hatalı tip");
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
