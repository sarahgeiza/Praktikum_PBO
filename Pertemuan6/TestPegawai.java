package Pertemuan6;

public class TestPegawai {

    public static void main(String[] args) {

        Manajer man = new Manajer();

        man.nama = "Bob";
        man.gaji = 9999999;
        man.departemen = "IT";

        man.tampilkanStatus();

        Supervisor sup = new Supervisor();

        sup.nama = "Andi";
        sup.gaji = 7000000;
        sup.departemen = "Produksi";
        sup.shift = "Pagi";
        sup.durasi = 2;

        sup.tampilkanStatus();
        System.out.println("Shift: " + sup.shift);
        System.out.println("Durasi: " + sup.durasi);
        sup.tampilkanGajiTotal();
    }
}