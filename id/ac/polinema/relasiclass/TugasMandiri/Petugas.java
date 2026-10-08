package id.ac.polinema.relasiclass.TugasMandiri;

public class Petugas {
    private String nama;

    public Petugas(String nama) {
        this.nama = nama;
    }

    // Dependency
    public void memprosesPeminjaman(Peminjaman peminjaman) {
        System.out.println("Petugas " + nama + " memproses peminjaman.");
        peminjaman.info();
    }
}
