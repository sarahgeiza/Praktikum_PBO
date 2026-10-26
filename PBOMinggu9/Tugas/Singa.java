package PBOMinggu9.Tugas;

public class Singa extends Binatang
        implements IKarnivora {

    public Singa() {
        super("CingaCing", 4, "Roaar Roaaar", "Coklat");
    }

    @Override
    public void displayMakan() {
        System.out.println("Jenis: Karnivora");
        System.out.println("Makanan: Daging");
    }
}