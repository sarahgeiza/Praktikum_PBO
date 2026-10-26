package PBOMinggu9.Tugas;

public class Gorilla extends Binatang
        implements IKarnivora, IHerbivora {

    public Gorilla() {
        super("Gulali", 4, "Haaum Hauum", "Hitam Manis");
    }

    @Override
    public void displayMakan() {
        System.out.println("Jenis: Karnivora + Herbivora");
        System.out.println("Makanan: Daging + Tumbuhan");
    }
}