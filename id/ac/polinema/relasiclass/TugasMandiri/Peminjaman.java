package id.ac.polinema.relasiclass.TugasMandiri;

public class Peminjaman {
    private Anggota anggota;
    private DetailPeminjaman detail;

    public Peminjaman(Anggota anggota) {
        this.anggota = anggota;

        // Composition
        this.detail = new DetailPeminjaman();
    }

    public void info() {
        System.out.println("Anggota: " + anggota.getNama());
        System.out.println("Tanggal Peminjaman: " + detail.getTanggal());
    }
}
