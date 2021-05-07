package AbstractFactory;

public class YatakTakimiFabrikasi implements MobilyaFactory{

    @Override
    public Mobilya getMobilya(String grup, String model, String renk, int kisiSayisi) {
        return new YatakTakimi(grup, model, renk, kisiSayisi);
    }
}
