package layananUtama;

public class AkunBank {
    // Menggunakan protected modifier
    protected String nomorAkun;
    protected double tingkatBunga;

    public AkunBank(String nomorAkun, double tingkatBunga) {
    this.nomorAkun = nomorAkun;
    this.tingkatBunga = tingkatBunga;
    }

    // Protected method untuk penyesuaian internal
    protected void sesuaikanBunga(double bungaBaru) {
    this.tingkatBunga = bungaBaru;
    System.out.println("Tingkat bunga untuk akun " + nomorAkun + " disesuaikan menjadi: " + tingkatBunga + "%");
    }
}
