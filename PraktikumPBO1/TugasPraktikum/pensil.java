package TugasPraktikum;

public class pensil {
    private String merk;
    private String warna;

    public void setMerk(String merkName) {
        merk = merkName;
    }

    public void setWarna(String warnaPensil) {
        warna = warnaPensil;
    }

    public void tulis() {
        System.out.println("Pensil digunakan untuk menulis.");
    }

    public void asah() {
        System.out.println("Pensil diasah.");
    }

    public void printInfo() {
        System.out.println("Merk : " + merk);
        System.out.println("Warna : " + warna);
    }
}
