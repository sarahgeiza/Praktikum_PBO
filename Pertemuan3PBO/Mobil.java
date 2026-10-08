public class Mobil {
    private int kecepatan = 0;
    private boolean kontakOn = false;

    public void nyalakanMesin() {
        kontakOn = true;
    }

    public void matikanMesin() {
        kontakOn = false;
    }

    public void tambahKecepatan() {
        if (kontakOn == true) {
            kecepatan += 10;
        } else {
            System.out.println("Tidak bisa memudah kecepatan, mesin belum menyala!\n");
        }
    }

    public void kurangKecepatan() {
        if (kontakOn == true) {
            kecepatan -= 10;
        } else {
            System.out.println("Tidak bisa mengurangi kecepatan, mesin belum menyala\n");
        }
    }

    public void tampilkanStatus() {
        if (kontakOn == true) {
            System.out.println("Kontak On");
        } else {
            System.out.println("Kontak Off");
        }

        System.out.println("Kecepatan: " + kecepatan + "\n");
    }
}