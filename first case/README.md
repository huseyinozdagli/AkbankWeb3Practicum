# Akbank Web3 Practicum First Case

Case detail : Boğaz köprülerinden geçiş yapan araçlardaki HGS cihazlarının yazılımını yazmanızı bekliyoruz. Buna göre araçların HGS kayıtlarının tutulması sırasında bir HGS numarası, sahibinin ismi ve soyismi, aracın sınıfı (1. Sınıf: otomobil, 2. Sınıf: minibüs, 3. Sınıf: otobüs), geçiş yaptığı tarih ve saat bilgileri, bakiyesi gibi bilgileri tutacak ve aşağıdaki istenenleri karşılayacaksınız.
 - Her araç sınıfı için ayrı bir sınıf (class) tanımı yapınız.
 
 - Ödeme kabul eden fonksiyonu olan bir gişe sınıfı ekleyiniz. Bu fonksiyon, bütün araç sınıflarını kabul eden ve ilgili araç sınıfına göre bakiyeyi azaltan tek bir fonksiyon olsun.
 
- OGS yönetimi  için raporlama yapmanız isteniyor. Gişe sınıfının, günlük olarak geçen araçları bir dizide (array) tutmasını sağlayınız. Yönetim için yeni bir sınıf yazıp, istenildiğinde elde edilen toplam günlük bakiyeyi ekrana basan bir fonksiyon yazınız.


# Kod :
```java
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
```
# Konsol çıktısı :
```
Hata! 000002 HGS No'lu aracin gecisi yapilamadi, yetersiz bakiye!
Hata! 000006 HGS No'lu aracin gecisi yapilamadi, yetersiz bakiye!
Hata! 000012 HGS No'lu aracin gecisi yapilamadi, yetersiz bakiye!

******** GISE NO : 1 ********
* GISE BAKIYESI : 70.0       
*                           *
* GECEN OTOMOBIL SAYISI : 2 *
*                           *
* GECEN MINIBUS SAYISI :  2 *
*                           *
* GECEN OTOBUS SAYISI :   1 *
*****************************

----------------------

******** GISE NO : 1 ********
* GISE BAKIYESI : 70.0       
*                           *
* GECEN OTOMOBIL SAYISI : 2 *
*                           *
* GECEN MINIBUS SAYISI :  2 *
*                           *
* GECEN OTOBUS SAYISI :   1 *
*****************************


******** GISE NO : 2 ********
* GISE BAKIYESI : 65.0       
*                           *
* GECEN OTOMOBIL SAYISI : 1 *
*                           *
* GECEN MINIBUS SAYISI :  1 *
*                           *
* GECEN OTOBUS SAYISI :   2 *
*****************************


******** GISE NO : 3 ********
* GISE BAKIYESI : 45.0       
*                           *
* GECEN OTOMOBIL SAYISI : 1 *
*                           *
* GECEN MINIBUS SAYISI :  1 *
*                           *
* GECEN OTOBUS SAYISI :   1 *
*****************************

----------------------
Gise No : 1 - Gise bakiyesi : 70.0
Gise No : 2 - Gise bakiyesi : 65.0
Gise No : 3 - Gise bakiyesi : 45.0
TOPLAM BAKIYE : 180.0
----------------------

----- 1 no'lu giseden gecen araclar gosteriliyor -----

******** ARACIN SINIFI : 1 ********
* ARAC SAHIBININ ADI : Huseyin
*                           
* ARAC SAHIBININ SOYADI : Ozdagli
*                           
* ARACA KAYITLI HGS NO :  000001
*                           
* ARACIN HGS BAKIYESI :   20.6
***********************************


******** ARACIN SINIFI : 1 ********
* ARAC SAHIBININ ADI : Will
*                           
* ARAC SAHIBININ SOYADI : Smith
*                           
* ARACA KAYITLI HGS NO :  000004
*                           
* ARACIN HGS BAKIYESI :   17.5
***********************************


******** ARACIN SINIFI : 2 ********
* ARAC SAHIBININ ADI : Harrison
*                           
* ARAC SAHIBININ SOYADI : Ford
*                           
* ARACA KAYITLI HGS NO :  000007
*                           
* ARACIN HGS BAKIYESI :   185.5
***********************************


******** ARACIN SINIFI : 2 ********
* ARAC SAHIBININ ADI : Matt
*                           
* ARAC SAHIBININ SOYADI : Damon
*                           
* ARACA KAYITLI HGS NO :  000010
*                           
* ARACIN HGS BAKIYESI :   8.7
***********************************


******** ARACIN SINIFI : 3 ********
* ARAC SAHIBININ ADI : Keanu
*                           
* ARAC SAHIBININ SOYADI : Reeves
*                           
* ARACA KAYITLI HGS NO :  000013
*                           
* ARACIN HGS BAKIYESI :   5.0
***********************************

----- 1 no'lu giseden gecen arac gosterimi bitti -----


----- 2 no'lu giseden gecen araclar gosteriliyor -----

******** ARACIN SINIFI : 1 ********
* ARAC SAHIBININ ADI : Johnny
*                           
* ARAC SAHIBININ SOYADI : Depp
*                           
* ARACA KAYITLI HGS NO :  000005
*                           
* ARACIN HGS BAKIYESI :   113.25
***********************************


******** ARACIN SINIFI : 2 ********
* ARAC SAHIBININ ADI : Enzo
*                           
* ARAC SAHIBININ SOYADI : Ferrari
*                           
* ARACA KAYITLI HGS NO :  000008
*                           
* ARACIN HGS BAKIYESI :   27.75
***********************************


******** ARACIN SINIFI : 3 ********
* ARAC SAHIBININ ADI : Robert
*                           
* ARAC SAHIBININ SOYADI : Downey Jr.
*                           
* ARACA KAYITLI HGS NO :  000011
*                           
* ARACIN HGS BAKIYESI :   100.7
***********************************


******** ARACIN SINIFI : 3 ********
* ARAC SAHIBININ ADI : Christian
*                           
* ARAC SAHIBININ SOYADI : Bale
*                           
* ARACA KAYITLI HGS NO :  000014
*                           
* ARACIN HGS BAKIYESI :   979.99
***********************************

----- 2 no'lu giseden gecen arac gosterimi bitti -----


----- 3 no'lu giseden gecen araclar gosteriliyor -----

******** ARACIN SINIFI : 1 ********
* ARAC SAHIBININ ADI : Tom
*                           
* ARAC SAHIBININ SOYADI : Hanks
*                           
* ARACA KAYITLI HGS NO :  000003
*                           
* ARACIN HGS BAKIYESI :   35.45
***********************************


******** ARACIN SINIFI : 2 ********
* ARAC SAHIBININ ADI : Heath
*                           
* ARAC SAHIBININ SOYADI : Ledger
*                           
* ARACA KAYITLI HGS NO :  000009
*                           
* ARACIN HGS BAKIYESI :   10.5
***********************************


******** ARACIN SINIFI : 3 ********
* ARAC SAHIBININ ADI : Patrick
*                           
* ARAC SAHIBININ SOYADI : Bateman
*                           
* ARACA KAYITLI HGS NO :  000015
*                           
* ARACIN HGS BAKIYESI :   979.99
***********************************

----- 3 no'lu giseden gecen arac gosterimi bitti -----

----------------------

Process finished with exit code 0
```

