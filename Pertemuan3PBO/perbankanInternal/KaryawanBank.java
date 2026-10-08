package perbankanInternal;

public class KaryawanBank {
    // Menggunakan default modifier (tanpa keyword)
    String idKaryawan;
    String departemen;

    // Default constructor
    KaryawanBank(String id, String dept) {
    this.idKaryawan = id;
    this.departemen = dept;
    }

    // Default method
    void prosesTransaksi() {
    System.out.println("Karyawan " + idKaryawan + " " + "sedang memproses transaksi.");
    }
}
