package layananKhusus;
import layananUtama.AkunBank;

public class AkunPremium extends AkunBank {
    private String benefitKhustus;

    public AkunPremium(String nomorAkun, double tingkatBunga, String benefit) {
    // Memanggil konstruktor super-class
    super(nomorAkun, tingkatBunga);
    this.benefitKhustus = benefit;
    }

    public void berikanBonusBunga() {
    // Atribut 'tingkatBangga' dari AkunBank dapat diakses langsung karena
    // bersifat protected
    double bungaBonus = tingkatBunga + 1.5;

    // Method 'sesuaikanBangga' dapat dipanggil langsung oleh class turunan
    sesuaikanBunga(bungaBonus);
    System.out.println("Benefit tambahan: " + benefitKhustus);
    }
}