package TugasPraktikum;

public class demo {
    public static void main(String[] args) {

        komputer komputer1 = new komputer();
        laptop laptop1 = new laptop();
        PC pc1 = new PC();
        pensil pensil1 = new pensil();
        PensilKayu pensilKayu1 = new PensilKayu();
        pensilMekanik pensilMekanik1 = new pensilMekanik();

        komputer1.setMerk("Lenovo");
        komputer1.setProcessor("Intel Core i5");

        laptop1.setMerk("Lenovo");
        laptop1.setProcessor("Intel Core i5");
        laptop1.setRam(8);
        laptop1.setStorage(512);

        pc1.setMerk("Lenovo");
        pc1.setProcessor("Intel Core i5");
        pc1.setRam(16);
        pc1.setStorage(1000);

        pensil1.setMerk("Faber-Castell");
        pensil1.setWarna("Hitam");

        pensilKayu1.setMerk("Faber-Castell");
        pensilKayu1.setWarna("Hitam");
        pensilKayu1.setPanjang(17);
        pensilKayu1.setKetebalan(2);

        pensilMekanik1.setMerk("Faber-Castell");
        pensilMekanik1.setWarna("Hitam");
        pensilMekanik1.setPanjang(15);
        pensilMekanik1.setIsi(5);

        System.out.println("Komputer");
        komputer1.nyalakan();
        komputer1.matikan();
        komputer1.printInfo();
        System.out.println();

        System.out.println("Laptop");
        laptop1.bukaLayar();
        laptop1.tutupLayar();
        laptop1.printInfoLaptop();
        System.out.println();

        System.out.println("PC");
        pc1.nyalakanPC();
        pc1.matikanPC();
        pc1.printInfoPC();
        System.out.println();

        System.out.println("Pensil");
        pensil1.tulis();
        pensil1.asah();
        pensil1.printInfo();
        System.out.println();

        System.out.println("Pensil Kayu");
        pensilKayu1.raut();
        pensilKayu1.gunakan();
        pensilKayu1.printInfoPensilKayu();
        System.out.println();

        System.out.println("Pensil Mekanik");
        pensilMekanik1.tekanIsi();
        pensilMekanik1.isiUlang();
        pensilMekanik1.printInfoPensilMekanik();
    }
}
