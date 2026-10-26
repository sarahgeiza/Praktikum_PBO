package PBOMinggu9.Tugas;

public class Main {
    public static void main(String[] args) {

        Binatang[] daftarBinatang = {
            new Keledai(),
            new Gorilla(),
            new Singa()
        };

        for (Binatang b : daftarBinatang) {
            b.displayBinatang();
            System.out.println();
        }
    }
}