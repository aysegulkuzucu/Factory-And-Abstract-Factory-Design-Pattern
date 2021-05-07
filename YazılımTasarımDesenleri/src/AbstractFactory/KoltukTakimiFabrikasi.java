package AbstractFactory;

public class KoltukTakimiFabrikasi implements MobilyaFactory {

    @Override
    public Mobilya getMobilya(String grup, String model, String renk, int kisiSayisi) {
        return new KoltukTakimi(grup, model, renk, kisiSayisi);
    }
}
