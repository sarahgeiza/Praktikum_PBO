package Object;

public class printerLaser extends Printer {

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void tampilkanMerk() {
        System.out.println("Merk printer: " + merk);
    }
}