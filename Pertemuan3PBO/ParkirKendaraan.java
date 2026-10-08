public class ParkirKendaraan {
    // private pada atribut (access modifier)
    private String nomorKendaraan;
    private int lamaParkir = 0;

    public ParkirKendaraan() {
        nomorKendaraan = "Belum Ada";
        lamaParkir = 0;
    }

    // method untuk mengubah atribut
    public void setNomorKendaraan(String nomor) {
        nomorKendaraan = nomor;
    }

    public void setLamaParkir(int lama) {
        lamaParkir = lama;
    }

    // method untuk mengambil nilai atribut
    public String getNomorKendaraan() {
        return nomorKendaraan;
    }

    public int getLamaParkir() {
        return lamaParkir;
    }
}