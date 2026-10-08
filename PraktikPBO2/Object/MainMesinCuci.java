package Object;

public class MainMesinCuci {

    public static void main(String[] args) {

        mesinCuciOtomatis mesin = new mesinCuciOtomatis();

        mesin.setMerk("LG");
        mesin.tampilkanMerk();

        mesin.mulaiPencucian();
        mesin.pilihModeCuci();
        mesin.aturWaktuBilas();
        mesin.keringkanPakaian();
        mesin.pengeringanOtomatis();
    }
}