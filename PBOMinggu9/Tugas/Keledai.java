package PBOMinggu9.Tugas;

public class Keledai extends Binatang
        implements IHerbivora {

    public Keledai() {
        super("Keledai", 4, "Hehehehe", "Abu-Abu");
    }

    @Override
    public void displayMakan() {
        System.out.println("Jenis: Herbivora");
        System.out.println("Makanan: Tumbuhan");
    }
}