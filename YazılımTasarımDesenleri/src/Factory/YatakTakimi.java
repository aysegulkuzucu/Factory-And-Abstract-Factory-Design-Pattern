package Factory;
public class YatakTakimi implements Mobilya{
    private String grup;
    private String model;
    private String renk;
    private int kisiSayisi;

    public YatakTakimi(String grup, String model, String renk, int kisiSayisi) {
        this.grup = grup;
        this.model = model;
        this.renk = renk;
        this.kisiSayisi = kisiSayisi;
    }
    @Override
    public String getGrup() {
        return grup;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public String getRenk() {
        return renk;
    }

    @Override
    public int getKisiSayisi() {
        return kisiSayisi;
    }

    @Override
    public String toString() {
        return "YatakTakimi{" +
                "grup='" + grup + '\'' +
                ", model='" + model + '\'' +
                ", renk='" + renk + '\'' +
                ", kisiSayisi=" + kisiSayisi +
                '}';
    }
}
