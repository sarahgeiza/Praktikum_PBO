public class Motor {
    private String merek;
    private String warna;
    private Mesin mesin;
    private int maxSpeed;
    private int kecepatan;

    public Motor(String merek, String warna, Mesin mesin, int maxSpeed) {
        this.merek = merek;
        this.warna = warna;
        this.mesin = mesin;
        this.maxSpeed = maxSpeed;
        this.kecepatan = 0;
    }

    public String getMerek() {
        return merek;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public Mesin getMesin() {
        return mesin;
    }

    public void setMesin(Mesin mesin) {
        this.mesin = mesin;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getKecepatan() {
        return kecepatan;
    }

    public void tambahKecepatan(int tambah) {
        kecepatan += tambah;

        if (kecepatan > maxSpeed) {
            kecepatan = maxSpeed;
        }
    }

    public void kurangiKecepatan(int kurang) {
        kecepatan -= kurang;

        if (kecepatan < 0) {
            kecepatan = 0;
        }
    }

    public void tampilkanInfo() {
        System.out.println("Merek: " + merek);
        System.out.println("Warna: " + warna);
        System.out.println("Max Speed: " + maxSpeed + " km/jam");
        System.out.println("Kecepatan: " + kecepatan + " km/jam");

        // Defensive programming: null checking
        if (mesin != null) {
            mesin.tampilkanInfo();
        } else {
            System.out.println("Mesin: belum terpasang");
        }
    }
}