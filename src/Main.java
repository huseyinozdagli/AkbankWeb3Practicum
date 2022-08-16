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
