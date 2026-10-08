package TugasPraktikum;

public class PensilKayu extends pensil {
    private int panjang;
    private int ketebalan;

    public void setPanjang(int panjangValue) {
        panjang = panjangValue;
    }

    public void setKetebalan(int ketebalanValue) {
        ketebalan = ketebalanValue;
    }

    public void raut() {
        System.out.println("Pensil kayu diraut.");
    }

    public void gunakan() {
        System.out.println("Pensil kayu digunakan untuk menulis.");
    }

    public void printInfoPensilKayu() {
        System.out.println("Panjang : " + panjang + " cm");
        System.out.println("Ketebalan : " + ketebalan + " mm");
    }
}
