package Factory;

public class MobilyaFabrikasi {

    public static Mobilya getMobilya(String grup, String model, String renk, int kisiSayisi){

        Mobilya mobilya;
        if("Anka".equalsIgnoreCase(model)){
            mobilya = new KoltukTakimi(grup, model, renk, kisiSayisi);
        } else if ("Clara".equalsIgnoreCase(model)){
            mobilya = new YatakTakimi(grup, model, renk, kisiSayisi);
        } else {
            throw new RuntimeException("Gecerli bir model degildir!");
        }

        return mobilya;

    }

}
