package AbstractFactory;

public class MobilyaMagazasi {

    public static void main (String [] args ) {

        KoltukTakimiFabrikasi koltukTakimiFabrikasi = new KoltukTakimiFabrikasi();
        Mobilya koltukTakimi = koltukTakimiFabrikasi.getMobilya
                ("oturma grubu", "Carmen", "Siyah-Beyaz", 9);

        YatakTakimiFabrikasi yatakTakimiFabrikasi = new YatakTakimiFabrikasi();
        Mobilya yatakTakimi = yatakTakimiFabrikasi.getMobilya
                ("bebek Odasi", "Sun", "Pembe", 2);

        System.out.println(koltukTakimi);
        System.out.println(yatakTakimi);
    }
}
