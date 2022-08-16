import java.util.ArrayList;

public class Yonetim {
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
