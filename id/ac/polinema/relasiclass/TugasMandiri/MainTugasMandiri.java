package id.ac.polinema.relasiclass.TugasMandiri;

public class MainTugasMandiri {
    public static void main(String[] args) {

        // Aggregation
        Buku buku = new Buku("Pemrograman Java", "Budi");
        Perpustakaan perpustakaan =
                new Perpustakaan("Perpustakaan Polinema", buku);

        perpustakaan.info();

        // Membuat object Anggota
        Anggota anggota = new Anggota("Sarah");

        // Composition
        Peminjaman peminjaman = new Peminjaman(anggota);
        peminjaman.info();

        // Dependency
        Petugas petugas = new Petugas("Pak Andi");
        petugas.memprosesPeminjaman(peminjaman);
    }
}
