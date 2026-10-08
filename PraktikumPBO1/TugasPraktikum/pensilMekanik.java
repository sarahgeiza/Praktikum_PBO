package TugasPraktikum;

public class pensilMekanik extends pensil {
    private int panjang;
    private int isi;

    public void setPanjang(int panjangValue) {
        panjang = panjangValue;
    }

    public void setIsi(int isiValue) {
        isi = isiValue;
    }

    public void tekanIsi() {
        System.out.println("Isi pensil mekanik dikeluarkan.");
    }

    public void isiUlang() {
        System.out.println("Isi pensil mekanik diganti.");
    }

    public void printInfoPensilMekanik() {
        System.out.println("Panjang : " + panjang + " cm");
        System.out.println("Jumlah isi : " + isi);
    }
}
