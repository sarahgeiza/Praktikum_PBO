package Pertemuan7.Overloading;

public class GasStation {

    public void isiBahanBakar(MobilKuno mobil, int uang) {
        int hargaPertalite = 5000;
        int jumlahLiter = uang / hargaPertalite;

        System.out.println("Mobil kuno telah diisi dengan pertalite sejumlah " + jumlahLiter + " liter");
    }

    public void isiBahanBakar(MobilMewah mobil, int uang) {
        int hargaPertamax = 10000;
        int jumlahLiter = uang / hargaPertamax;

        System.out.println("Mobil mewah telah diisi dengan pertamax sejumlah " + jumlahLiter + " liter");
    }
}