package Factory;

public class MobilyaMagazasi {

    public static void main (String [] args) {

        Mobilya koltuk = MobilyaFabrikasi.getMobilya("Koseli Koltuk", "Anka", "vizon", 9 );

        Mobilya YatakTakimi = MobilyaFabrikasi.getMobilya("Genc Odasi", "Clara", "kirmizi", 1);

        System.out.println("Koltuk Takimina ait mobilya ozellikleri : ");
        System.out.println(koltuk);

        System.out.println("Yatak Takimina ait mobilya ozellikleri : ");
        System.out.println(YatakTakimi);

    }
}

