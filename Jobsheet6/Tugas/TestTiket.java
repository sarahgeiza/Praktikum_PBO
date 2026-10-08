package Jobsheet6.Tugas;

public class TestTiket {
    public static void main(String[] args) {

        // Tiket Kereta
        TiketKereta kereta = new TiketKereta();

        kereta.kodeTiket = "KA-001";
        kereta.namaPenumpang = "Andi";
        kereta.asal = "Malang";
        kereta.tujuan = "Jakarta";
        kereta.setHargaDasar(350000);
        kereta.nomorGerbong = 3;
        kereta.nomorKursi = "12A";

        System.out.println("========== Tiket Kereta ==========");
        kereta.tampilKereta();

        // Tiket Pesawat Domestik
        TiketDomestik domestik = new TiketDomestik(
                "GA-102",
                "Sinta",
                "Surabaya",
                "Denpasar",
                900000,
                "Garuda Indonesia",
                25,
                75000
        );

        System.out.println();
        System.out.println("====== Tiket Pesawat Domestik ======");
        domestik.tampilDomestik();

        // Tiket Pesawat Internasional
        TiketInternasional internasional = new TiketInternasional(
                "SQ-205",
                "Budi",
                "Jakarta",
                "Singapura",
                2500000,
                "Singapore Airlines",
                20,
                "C1234567",
                150000
        );

        System.out.println();
        System.out.println("==== Tiket Pesawat Internasional ====");
        internasional.tampilInternasional();
    }
}
