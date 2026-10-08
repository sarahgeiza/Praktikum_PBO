package Pertemuan6;

public class Manajer extends Pegawai {
    public String departemen;

    // Soal no.3
    @Override
    public void tampilkanStatus() {
        System.out.println("Nama: " + nama);
        System.out.println("Gaji: " + gaji);
        System.out.println("Departemen: " + departemen);
    }
}
