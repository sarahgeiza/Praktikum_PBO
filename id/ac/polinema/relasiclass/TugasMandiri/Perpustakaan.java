package id.ac.polinema.relasiclass.TugasMandiri;

public class Perpustakaan {
    private String nama;

    // Aggregation
    private Buku buku;

    public Perpustakaan(String nama, Buku buku) {
        this.nama = nama;
        this.buku = buku;
    }

    public void info() {
        System.out.println("Perpustakaan: " + nama);
        System.out.println("Buku: " + buku.info());
    }
}
