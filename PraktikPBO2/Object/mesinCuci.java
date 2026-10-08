package Object;

public class mesinCuci {

    private String merk;
    private int kapasitas;
    private String modeCuci;

    public void mulaiPencucian() {
        System.out.println("Pencucian dimulai");
    }

    public void pilihModeCuci() {
        System.out.println("Mode cuci dipilih");
    }

    public void aturWaktuBilas() {
        System.out.println("Waktu bilas diatur");
    }

    public void keringkanPakaian() {
        System.out.println("Pakaian dikeringkan");
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void tampilkanMerk() {
        System.out.println("Merk mesin cuci: " + merk);
    }
}