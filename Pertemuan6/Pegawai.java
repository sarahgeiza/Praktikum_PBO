package Pertemuan6;

public class Pegawai {
    public String nama;
    public double gaji;

    public String getDescription() {
        return "Nama: " + nama + ", gaji: " + gaji;
    }

    // Soal no.2
    public void tampilkanStatus() {
        System.out.println("Nama: " + nama);
        System.out.println("Gaji: " + gaji);
    }
}