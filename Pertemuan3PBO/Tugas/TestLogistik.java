package Tugas;
import java.util.Scanner;
public class TestLogistik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Kontainer kontainerAlfa = new Kontainer("REQ-9988", "PT. Maju Bersama", 5000);

        System.out.println("Nama Pemilik kontainer: " + kontainerAlfa.getNamaPemilik());
        System.out.println("Kapasitas Maksimal: " + kontainerAlfa.getKapasitasMaksimal() + " kg");

        // Input berat muatan dari pengguna
        System.out.print("\nMasukkan berat muatan yang ingin dimasukkan: ");
        double beratMasuk = sc.nextDouble();

        kontainerAlfa.tambahMuatan(beratMasuk);

        System.out.println("Berat muatan saat ini: " + kontainerAlfa.getBeratMuatanSaatIni() + " kg");

        // Input berat muatan yang ingin dibongkar
        System.out.print("\nMasukkan berat muatan yang ingin dibongkar: ");
        double beratKeluar = sc.nextDouble();

        kontainerAlfa.turunkanMuatan(beratKeluar);

        System.out.println("Berat muatan saat ini: " + kontainerAlfa.getBeratMuatanSaatIni() + " kg");
    }
}
